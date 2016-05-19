DESCRIPTION = "Python CarHUD code for use with the pyELM327 code"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PR = "r16"

# WILL NEED TO UPDATE EVERYTIME THERE IS A NEW COMMIT
SRCREV = "9fdeb9601780c4cd66e813ca3116f0511a3d2729"
# THIS IS GOOFY FOR BITBUCKET, BUT IT WORKED
SRC_URI = "git://bitbucket.org/xtacocorex/pycarhud.git;protocol=http;branch=master"
S = "${WORKDIR}/git"

inherit distutils
