@echo off
setlocal
set JAVA_OPTS=-Xms64m -Xmx1024m

set PRGDIR=%CD%

set CONFIG_DIR=%USERPROFILE%\.MQJExplorer
IF not EXIST "%CONFIG_DIR%" (
	mkdir "%CONFIG_DIR%"
)

set LOG_DIR=%CONFIG_DIR%\log
IF not EXIST "%LOG_DIR%" (
	mkdir "%LOG_DIR%"
)

SET CPATH=%PRGDIR%\bin\MQJExplorer.jar
SET CPATH=%PRGDIR%\res;%CPATH%

: checkJava
if "%JAVA_HOME%" == "" goto noJavaHome
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHome
if "%JAVACMD%" == "" set JAVACMD=%JAVA_HOME%\bin\java.exe
goto runMQJExplorer

: noJavaHome
if "%JAVACMD%" == "" set JAVACMD=java.exe

: runMQJExplorer
"%JAVACMD%" %JAVA_OPTS% -Dlog4j.debug -classpath "%CPATH%" com.kolban.mqjexplorer.MQJExplorer
if errorlevel == 1 pause
endlocal
