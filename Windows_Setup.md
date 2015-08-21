# Sun JDK 1.6 #

# Download #

## Sun JDK 1.6 ##

  * Download the correct version for you Windows System from the Oracle/Sun url [Oracle Sun JDK](http://jdk6.java.net/download.html)

## MQJexplorer ##

  * Download the tool from this site [MQJExplorer\_v0.13.bin.zip](http://mqjexplorer.googlecode.com/files/MQJExplorer_v0.13.bin.zip)

# Setup #

  * Install the JDK 1.6.x somewhere, for example into the directory `C:\Program Files (x86)\Java\jdk1.6.0_29`

  * Add Operating System Variable:
```
JAVA_HOME=C:\Program Files (x86)\Java\jdk1.6.0_29
```

  * Extract MQJExplorer\_v0.13.bin.zip somewhere, for example into the directory `D:\Program Files (x86)\MQJExplorer-0.13`

  * Change the file “runme.bat” with the following code:
```
@echo off
setlocal
for /f %%i in ("%0") do set PRGDIR=%%~dpi

SET CPATH="%PRGDIR%bin\MQJExplorer.jar"
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8";%CPATH%
SET CPATH="%PRGDIR%lib\jhbasic.jar";%CPATH%
SET CPATH="%PRGDIR%lib\messagingImpl.jar";%CPATH%
SET CPATH="%PRGDIR%lib\mqjhelp.jar";%CPATH%
SET CPATH="%PRGDIR%lib\xerces.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\CL3Export.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\CL3Nonexport.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\com.ibm.mq.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\com.ibm.mq.pcf.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\com.ibm.mqjms.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\connector.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\dhbcore.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\fscontext.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\jms.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\jndi.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\jta.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\ldap.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\postcard.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\providerutil.jar";%CPATH%
SET CPATH="%PRGDIR%lib\IBM_MQSeries-6.0.2.8\rmm.jar";%CPATH%
SET CPATH="%PRGDIR%lib\log4j\log4j-1.2.15.jar";%CPATH%

"%JAVA_HOME%\bin\java" -Dlog4j.debug -classpath %CPATH% com.kolban.mqjexplorer.MQJExplorer
endlocal
```

  * Copy the file `config.dat` from another PC into the directory
`%HOMEPATH%\.MQJExplorer`

# Execution #

  * Execute “runme.bat”