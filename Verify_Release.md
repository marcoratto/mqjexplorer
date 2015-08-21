# Verify release #

It is essential that you verify the integrity of the downloaded files using the PGP signature or the SHA1 or MD5 checksums. The checksums are not as strong indicators as the PGP signature.
The PGP signatures can be verified using PGP or GPG. First download the [KEYS](http://mqjexplorer.googlecode.com/svn/trunk/MQJExplorer/KEYS) as well as the asc signature file for the particular distribution. Verify the signatures using:

_```
% pgpk -a KEYS
% pgpv <FILE_NAME>.asc
```_

or
_```
% pgp -ka KEYS
% pgp <FILE_NAME>.asc
```_

or

_```
% gpg --import KEYS
% gpg --verify <FILE_NAME>.asc
```_

Alternatively, you can verify the checksums using `*`sum tools:

_```
% md5sum -c <FILE_NAME>.md5
% sha1sum -c <FILE_NAME>.sha
```_

Unix programs called md5/sha1 or md5sum/sha1sum are included in many unix distributions. `*`sum is also available as part of [GNU Textutils](http://www.gnu.org/software/textutils/textutils.html). Windows users can get binary md5 programs from [here](http://www.fourmilab.ch/md5/) or [here](http://www.pc-tools.net/win32/freeware/console). [fsum](http://www.slavasoft.com/fsum/index.htm) and [MD5Summer](http://www.md5summer.com/) support MD5 and SHA1.

_**I highly recommend to verify the PGP signature, though.**_