#!/bin/sh
#set -x
rm -rf /usr/local/MQJExplorer-0.14 2>/dev/null 
rm -rf /usr/local/MQJExplorer 2>/dev/null
rm -f /usr/bin/MQJExplorer 2>/dev/null
rm -f /usr/share/applications/MQJExplorer.desktop 2>/dev/null
rm -f /usr/share/desktop-directories/MQJExplorer.directory 2>/dev/null
rm -f /usr/share/pixmaps/MQJExplorer.png 2>/dev/null
update-menus
exit 0
