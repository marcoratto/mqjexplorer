#!/bin/sh
#set -x
TARGET_DIR=/usr/local/MQJExplorer-0.14
TARGET_LINK=/usr/local/MQJExplorer

echo " * Check if exists the sym-link ${TARGET_LINK}..." 
if [ -h "${TARGET_LINK}" ]
then
	echo " * Delete the target sym-link ${TARGET_LINK}..."
	rm -f "${TARGET_LINK}"
fi
if [ -d "${TARGET_LINK}" ]
then
	echo " * Delete the target directory ${TARGET_LINK}..."
	rm -rf "${TARGET_LINK}"
fi
if [ -d "${TARGET_DIR}" ]
then
	echo " * Delete the target directory ${TARGET_DIR}..."
	rm -rf "${TARGET_DIR}"
fi
if [ -h "/usr/bin/MQJExplorer" ]
then
	rm -f "/usr/bin/MQJExplorer"
fi

echo " * Copying all..."
cp -r ./MQJExplorer-0.14 /usr/local

echo " * Set GRANTs..."
chmod 0755 ${TARGET_DIR}/runme.sh

echo " * Create sym-link..."
ln -s "${TARGET_DIR}" "${TARGET_LINK}"
ln -s "${TARGET_LINK}/runme.sh" /usr/bin/MQJExplorer

echo " * Update menu..."
cp "${TARGET_DIR}/xdg/MQJExplorer.desktop" "/usr/share/applications"
cp "${TARGET_DIR}/xdg/MQJExplorer.directory" "/usr/share/desktop-directories"
cp "${TARGET_DIR}/xdg/MQJExplorer.png" /usr/share/pixmaps
update-menus
echo " * Finished" 
exit 0
