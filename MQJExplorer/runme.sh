#!/bin/sh
set -x
# resolve links - $0 may be a softlink
PRG="$0"

while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '.*/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done

# Get standard environment variables
PRGDIR=`dirname "$PRG"`

CPATH=$PRGDIR/bin/MQJExplorer.jar
for JAR_FILE in `find $PRGDIR -type f -iname "*.jar"`
do
CPATH=$JAR_FILE:$CPATH
done

java -classpath $CPATH -Dlog4j.debug com.kolban.mqjexplorer.MQJExplorer
