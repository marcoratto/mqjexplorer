#!/bin/bash
set -x
if [ $# -ne 2 ]
then
	echo "Parameter: <GOOGLE_PROJECT> <GOOGLE_TOKEN>"
	exit 1
fi
GOOGLE_PROJECT=$1
GOOGLE_TOKEN=$2
GOOGLE_USER=marcoratto@gmail.com

firefox_cookies.sh >$MOZILLA_PROFILE/cookies.txt

find . -maxdepth 1 -mindepth 1 -type f -iname "*.deb" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=Featured -F labelenter1=Type-Installer -F labelenter2=OpSys-Linux -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.bin.zip" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=Featured -F labelenter1=OpSys-Windows -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.bin.tar.gz" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=Featured -F labelenter1=OpSys-OSX -F labelenter2=OpSys-Linux -F labelenter3=OpSys-Unix -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.sh" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=Featured -F labelenter1=Type-Installer -F labelenter2=OpSys-OSX -F labelenter3=OpSys-Linux -F labelenter4=OpSys-Unix -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.src.zip" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=Featured -F labelenter1=Type-Source -F labelenter2=OpSys-Windows -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.src.tar.gz" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
      curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=Featured -F labelenter1=Type-Source -F labelenter2=OpSys-OSX -F labelenter3=OpSys-Linux -F labelenter4=OpSys-Unix -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.jar" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=Featured -F labelenter1=OpSys-All -F labelenter2=Type-Installer -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.asc" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=OpSys-All -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.md5" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=OpSys-All -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

find . -maxdepth 1 -mindepth 1 -type f -iname "*.sha" | while read BUFFER
do
      FILENAME=`basename $BUFFER`
      echo "Upload $FILENAME..."
	  curl -v -i -b $MOZILLA_PROFILE/cookies.txt --user-agent "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:18.0) Gecko/20100101 Firefox/18.0" -F token="$GOOGLE_TOKEN" -F logged_in_user_email="$GOOGLE_USER" -F star=1 -F summary=$FILENAME -F description=$FILENAME -F labelenter0=OpSys-All -F filefield=@"$BUFFER" "http://uploads.code.google.com/upload/$GOOGLE_PROJECT"
      RET_CODE=$?
      if [ $RET_CODE -ne 0 ]
      then
		echo "ERROR: curl return error code $RET_CODE! Stopped."
		exit 1
	  fi
done

exit 0
