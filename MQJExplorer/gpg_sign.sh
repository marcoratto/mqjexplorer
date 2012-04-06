#!/bin/sh
if [ "$1" = "" -o "$2" = "" ]
then
	echo "Parameter: <gpg_password> <file>"
	exit 1
fi 
echo "$1" | gpg --batch --passphrase-fd 0 -u marcoratto@gmail.com -b -a -s "$2"
