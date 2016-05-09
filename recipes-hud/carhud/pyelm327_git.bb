DESCRIPTION = "Python ELM-327 Device Driver with OBD-II Parser"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PR = "r6"

# WILL NEED TO UPDATE EVERYTIME THERE IS A NEW COMMIT
#SRCREV = "76c16b09f3a4a93abdd71eba08819d42d9292cb2"
# THIS IS GOOFY FOR BITBUCKET, BUT IT WORKED
#SRC_URI = "git://bitbucket.org/xtacocorex/pyelm327.git;protocol=http;branch=master"

# BRANCH TEST
SRCREV = "8ea051af2efca854c5931bda06b85ba2f6db1fde"
SRC_URI = "git://bitbucket.org/xtacocorex/pyelm327.git;protocol=http;branch=threaded_test"

S = "${WORKDIR}/git"

inherit distutils


