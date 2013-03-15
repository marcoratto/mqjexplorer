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
SET CPATH=%PRGDIR%\lib\jhbasic.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\messagingImpl.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\mqjhelp.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\xerces.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\CL3Export.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\CL3Nonexport.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.axis2.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.commonservices.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.defaultconfig.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.headers.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.jmqi.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.jms.Nojndi.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.pcf.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.postcard.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mq.soap.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\com.ibm.mqjms.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\connector.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\dhbcore.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\fscontext.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\jms.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\jndi.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\jta.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\ldap.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\providerutil.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\IBM_WebSphere_MQ-7.0.1.3\rmm.jar;%CPATH%
SET CPATH=%PRGDIR%\lib\log4j\log4j-1.2.15.jar;%CPATH%

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
