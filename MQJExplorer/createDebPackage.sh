#!/bin/bash
set -x

PACKAGE_DIR=build/MQJExplorer_v0.13
PACKAGE_NAME=MQJExplorer_v0.13_all
PACKAGE_FILE=${PACKAGE_NAME}.deb

if [ "$USER" != "root" ]
then
	echo "ERROR: Run the script as root."
	exit 1
fi
if [ $# -eq 0 ]
then
	echo "Parameter: gpg_password"
	exit 2
fi
gpg_password=$1
TARGET_DIR=/opt/MQJExplorer

rm -rf $TARGET_DIR

if [ ! -d "$TARGET_DIR" ]
then
	mkdir $TARGET_DIR
fi
chmod 0777 $TARGET_DIR

cp -r ./bin ./icons ./lib ./xdg ./runme.sh ./runme.bat ./VERSION ./COPYING ./KEYS ./README ./AUTHORS ./THANKS $TARGET_DIR

find $TARGET_DIR -type d -exec chmod 0755 "{}" \;
find $TARGET_DIR -type f -exec chmod 0644 "{}" \;
chmod 0755 $TARGET_DIR/runme.sh

rm -f data.tar.gz
tar cPvzf data.tar.gz $TARGET_DIR
RET_CODE=$?
if [ $RET_CODE -ne 0 ]
then
	echo "ERROR: tar return error code $RET_CODE!"
	exit 1
fi
ls -al data.tar.gz

if [ ! -f control/md5sums ]
then
	rm -f control/md5sums
	find $TARGET_DIR -type f -exec md5sum -b "{}" \; >../control/md5sums
fi
ls -al control/md5sums

tar cvzf ./control.tar.gz -C control control md5sums postinst preinst prerm
ls -al control.tar.gz

ar rv ${PACKAGE_DIR}/${PACKAGE_FILE} debian-binary data.tar.gz control.tar.gz
ls -al ${PACKAGE_DIR}/${PACKAGE_FILE}

CUR_DIR=`pwd`
cd ${PACKAGE_DIR}
md5sum -b ${PACKAGE_FILE} >${PACKAGE_FILE}.md5
sha1sum -b ${PACKAGE_FILE} >${PACKAGE_FILE}.sha
echo ${gpg_password}|gpg --batch --passphrase-fd 0 -u 'marcoratto@gmail.com' -b -a -s ${PACKAGE_FILE}
cd "$CUR_DIR"

dpkg -I ${PACKAGE_DIR}/${PACKAGE_FILE}

