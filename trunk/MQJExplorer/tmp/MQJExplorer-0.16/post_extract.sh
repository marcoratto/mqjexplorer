#!/bin/sh
#set -x
VERSION=0.16
TARGET_DIR=/usr/local/MQJExplorer-${VERSION}
TARGET_LINK=/usr/local/MQJExplorer

echo " * Check if exists the sym-link '${TARGET_LINK}'" 
if [ -h "${TARGET_LINK}" ]
then
	echo " * Delete the target sym-link '${TARGET_LINK}'"
	rm "${TARGET_LINK}"
fi

echo " * Check if exists the sym-link '/usr/local/bin/MQJExplorer'" 
if [ -h "/usr/local/bin/MQJExplorer" ]
then
	echo " * Delete the target sym-link '/usr/local/bin/MQJExplorer'"
	rm -f "/usr/local/bin/MQJExplorer"
fi

if [ -d "${TARGET_LINK}" ]
then
	echo " * Delete the target directory '${TARGET_LINK}'"
	rm -rf "${TARGET_LINK}"
fi
if [ -d "${TARGET_DIR}" ]
then
	echo " * Delete the target directory '${TARGET_DIR}'"
	rm -rf "${TARGET_DIR}"
fi

echo " * Copying all..."
cp -r ./MQJExplorer-${VERSION} /usr/local

echo " * Set GRANTs..."
chmod 0755 ${TARGET_DIR}
find "${TARGET_DIR}" -type d -exec chmod 755 "{}" \;
find "${TARGET_DIR}" -type f -exec chmod 644 "{}" \;
chmod 0755 ${TARGET_DIR}/runme.sh
chmod 0755 ${TARGET_DIR}/uninstall.sh

echo " * Create sym-link for '${TARGET_DIR}'"
ln -s "${TARGET_DIR}" "${TARGET_LINK}"

echo " * Create sym-link for '${TARGET_LINK}/runme.sh'"
ln -s "${TARGET_LINK}/runme.sh" /usr/local/bin/MQJExplorer

echo " * Update menu..."
cp "${TARGET_DIR}/xdg/MQJExplorer.desktop" "/usr/share/applications"
cp "${TARGET_DIR}/xdg/MQJExplorer.directory" "/usr/share/desktop-directories"
cp "${TARGET_DIR}/xdg/MQJExplorer.png" /usr/share/pixmaps
update-menus

echo " * Delete '${TARGET_DIR}/post_extract.sh'"
rm -f "${TARGET_DIR}/post_extract.sh"

echo " * Finished" 
exit 0
