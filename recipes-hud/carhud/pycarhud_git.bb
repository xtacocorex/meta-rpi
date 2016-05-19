DESCRIPTION = "Python CarHUD code for use with the pyELM327 code"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PR = "r19"

# WILL NEED TO UPDATE EVERYTIME THERE IS A NEW COMMIT
SRCREV = "5950a23eb0a22f3161e616140392a559ec021047"
# THIS IS GOOFY FOR BITBUCKET, BUT IT WORKED
SRC_URI = "git://bitbucket.org/xtacocorex/pycarhud.git;protocol=http;branch=master"
S = "${WORKDIR}/git"

inherit distutils
