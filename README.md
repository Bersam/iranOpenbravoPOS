#Iran OpenbravoPOS
================

fork from openBravo Java Client POS including Localization 

##Build from the sources
================

To build the Openbravo POS sources you need ant. Ant is a build tool used by Openbravo POS to compile and package the distribution files from the sources.

The binary and source packages can both be obtained executing the following instruction from the folder you downloaded or checked out the sources:

ant dist

There are other ant targets if you only need one specific package:

To obtain the package openbravopos.jar execute the following instruction:

ant jar

To obtain the binary distribution package execute:

ant dist.bin

To obtain the sources distribution package execute:

ant dist.src

Notes: All the packages created by the build process are located in the subfolder build/dist. 