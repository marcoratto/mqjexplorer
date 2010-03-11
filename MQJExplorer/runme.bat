rem @echo off
setlocal
for /f %%i in ("%0") do set PRGDIR=%%~dpi

SET CPATH=%PRGDIR%bin\MQJExplorer.jar
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8;%CPATH%
SET CPATH=%PRGDIR%lib\jhbasic.jar;%CPATH%
SET CPATH=%PRGDIR%lib\messagingImpl.jar;%CPATH%
SET CPATH=%PRGDIR%lib\mqjhelp.jar;%CPATH%
SET CPATH=%PRGDIR%lib\xerces.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\CL3Export.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\CL3Nonexport.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\com.ibm.mq.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\com.ibm.mq.pcf.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\com.ibm.mqjms.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\connector.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\dhbcore.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\fscontext.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\jms.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\jndi.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\jta.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\ldap.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\postcard.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\providerutil.jar;%CPATH%
SET CPATH=%PRGDIR%lib\IBM_MQSeries-6.0.2.8\rmm.jar;%CPATH%
SET CPATH=%PRGDIR%lib\log4j\log4j-1.2.15.jar;%CPATH%

%JAVA_HOME%\bin\java -Dlog4j.debug -classpath %CPATH% com.kolban.mqjexplorer.MQJExplorer
endlocal
