#!/bin/sh
#set -x

JAVA_OPTS="-Xms256m -Xmx1024m"
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

CONFIG_DIR=$HOME/.MQJExplorer
if [ ! -d "$CONFIG_DIR" ]
then
        mkdir -p "$CONFIG_DIR"
fi
LOG_DIR=$HOME/.MQJExplorer/log
if [ ! -d "$LOG_DIR" ]
then
        mkdir -p "$LOG_DIR"
fi

LIB_DIR=$PRGDIR/lib

CPATH=$PRGDIR/bin/MQJExplorer.jar
CPATH=$PRGDIR/res:$CPATH
for JAR_FILE in `find "$LIB_DIR" -type f -name "*.jar"`
do
	CPATH=$JAR_FILE:$CPATH
done

if [ -z "$JAVACMD" ] ; then
  if [ -n "$JAVA_HOME"  ] ; then
    # IBM's JDK on AIX uses strange locations for the executables
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
      JAVACMD="$JAVA_HOME/jre/sh/java"
    elif [ -x "$JAVA_HOME/jre/bin/java" ] ; then
      JAVACMD="$JAVA_HOME/jre/bin/java"
    else
      JAVACMD="$JAVA_HOME/bin/java"
    fi
  else
    JAVACMD=`which java 2> /dev/null `
    if [ -z "$JAVACMD" ] ; then
        JAVACMD=java
    fi
  fi
fi

if [ ! -x "$JAVACMD" ] ; then
  echo "Error: JAVA_HOME is not defined correctly."
  echo "I cannot execute $JAVACMD"
  exit 1
fi

if [ ! -h "$HOME/Desktop/MQJExplorer.desktop" ]
then
	ln -s /usr/share/applications/MQJExplorer.desktop $HOME/Desktop/MQJExplorer.desktop
fi

"$JAVACMD" $JAVA_OPTS -classpath $CPATH -Dlog4j.debug com.kolban.mqjexplorer.MQJExplorer
RET_CODE=$?
if [ $RET_CODE -ne 0 ]
then
        echo "ERROR! java return error code $RET_CODE."
        exit 1
fi
exit 0
