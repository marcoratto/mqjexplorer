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

SET CPATH=%PRGDIR%\bin\ConfigFileMigrationTool.jar
SET CPATH=%PRGDIR%\lib\com.ibm.mq.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\com.ibm.mqjms.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\com.ibm.mq.pcf-6.0.3.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\com.ibm.mq.pcf.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\connector.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\fscontext.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\jhbasic.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\jms.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\jndi.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\jta.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\ldap.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\MQJExplorer.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\mqjhelp.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\providerutil.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\xerces.jar;%CPATH%
SET CPATH=%PRGDIR%\res;%CPATH%

: checkJava
if "%JAVA_HOME%" == "" goto noJavaHome
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHome
if "%JAVACMD%" == "" set JAVACMD=%JAVA_HOME%\bin\java.exe
goto runMQJExplorer

: noJavaHome
if "%JAVACMD%" == "" set JAVACMD=java.exe

: runMQJExplorer
"%JAVACMD%" %JAVA_OPTS% -Dlog4j.debug -classpath "%CPATH%" com.kolban.mqjexplorer.ConfigFileMigrationTool
if errorlevel == 1 pause
endlocal
