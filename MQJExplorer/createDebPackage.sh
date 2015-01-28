#!/bin/bash
#set -x

PACKAGE_VER=0.16
PACKAGE_DIR=build/MQJExplorer_v${PACKAGE_VER}
PACKAGE_NAME=MQJExplorer_v${PACKAGE_VER}_all
PACKAGE_FILE=${PACKAGE_NAME}.deb

if [ $# -eq 0 ]
then
	echo "Parameter: GPG_PASSWORD"
	exit 2
fi
GPG_PASSWORD=$1

rm -f control/md5sums
rm -f data.tar.gz
rm -rf ./debian.tmp 2>/dev/null

mkdir -p ./debian.tmp/usr/local

chmod 755 ./control/postinst
chmod 755 ./control/preinst
chmod 755 ./control/prerm
chmod 755 ./tmp/MQJExplorer-${PACKAGE_VER}/*.sh

cp -r ./tmp/MQJExplorer-${PACKAGE_VER} ./debian.tmp/usr/local
TARGET_DIR=./debian.tmp/usr/local/MQJExplorer-${PACKAGE_VER}

cd ./debian.tmp
find usr -type f -exec md5sum -b "{}" \; >../control/md5sums
tar cPvzf ../data.tar.gz ./usr
cd ..
RET_CODE=$?
if [ $RET_CODE -ne 0 ]
then
	echo "ERROR: tar return error code $RET_CODE!"
	exit 1
fi
ls -al data.tar.gz

tar cvzf ./control.tar.gz -C control control md5sums postinst preinst prerm
ls -al control.tar.gz

ar rv ${PACKAGE_DIR}/${PACKAGE_FILE} debian-binary data.tar.gz control.tar.gz
ls -al ${PACKAGE_DIR}/${PACKAGE_FILE}

CUR_DIR=`pwd`
cd ${PACKAGE_DIR}
md5sum -b ${PACKAGE_FILE} >${PACKAGE_FILE}.md5
sha1sum -b ${PACKAGE_FILE} >${PACKAGE_FILE}.sha
sh ./gpg_sign.sh ${GPG_PASSWORD} "${PACKAGE_FILE}"
cd "$CUR_DIR"

dpkg -I ${PACKAGE_DIR}/${PACKAGE_FILE}

