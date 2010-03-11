#!/bin/sh
echo "$1" | gpg --batch --passphrase-fd 0 -u marcoratto@gmail.com -b -a -s "$2"
