# Introduction #

From the release 0.15, I changed the configuration file from `config.dat` to `config.xml`.
This command line utility could be used to migrate the old configuration to the new configuration.

# Download #

  * Download the tool from this site [ConfigFileMigrationTool](https://mqjexplorer.googlecode.com/svn/trunk/ConfigFileMigrationTool/build/ConfigFileMigrationTool_v0.1/)

| **Platform** | **Setup type (without JVM)** |
|:-------------|:-----------------------------|
|[![](http://mqjexplorer.googlecode.com/svn/trunk/MQJExplorer/web/images/linux.png)](https://mqjexplorer.googlecode.com/svn/trunk/ConfigFileMigrationTool/build/ConfigFileMigrationTool_v0.1/ConfigFileMigrationTool_v0.1.bin.tar.gz)|Linux (~ 4 MB)                |
|[![](http://mqjexplorer.googlecode.com/svn/trunk/MQJExplorer/web/images/mac_os_x.png)](https://mqjexplorer.googlecode.com/svn/trunk/ConfigFileMigrationTool/build/ConfigFileMigrationTool_v0.1/ConfigFileMigrationTool_v0.1.bin.tar.gz)|Mac OS X (~ 4 MB)             |
|[![](http://mqjexplorer.googlecode.com/svn/trunk/MQJExplorer/web/images/unix.png)](https://mqjexplorer.googlecode.com/svn/trunk/ConfigFileMigrationTool/build/ConfigFileMigrationTool_v0.1/ConfigFileMigrationTool_v0.1.bin.tar.gz)|UNIX (~ 4 MB)                 |
|[![](http://mqjexplorer.googlecode.com/svn/trunk/MQJExplorer/web/images/windows.png)](https://mqjexplorer.googlecode.com/svn/trunk/ConfigFileMigrationTool/build/ConfigFileMigrationTool_v0.1/ConfigFileMigrationTool_v0.1.bin.zip)|Windows (~ 4 MB)              |

# Setup #

## Windows ##

  * Extract `ConfigFileMigrationTool_v0.1.bin.zip` somewhere, for example into the directory `C:\TEMP\ConfigFileMigrationTool_v0.1`.

## Linux, UNIX, Mac ##

  * Extract `ConfigFileMigrationTool_v0.1.bin.tar.gz` somewhere, for example into `/tmp/ConfigFileMigrationTool_v0.1`.

# Execution #

## Windows ##

  * Execute `runme.bat`.

## Linux, UNIX, Mac ##

  * Execute `runme.sh`.

# Checking #

## Windows ##

  * Check on the `%USERPROFILE%\.MQJExplorer` the file `config.xml`

## Linux, UNIX, Mac ##

  * Check on the `$HOME/.MQJExplorer` the file `config.xml`