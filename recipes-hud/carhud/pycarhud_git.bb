DESCRIPTION = "Python CarHUD code for use with the pyELM327 code"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PR = "r15"

# WILL NEED TO UPDATE EVERYTIME THERE IS A NEW COMMIT
SRCREV = "2e3a8fe19edc962f468d5899273a94b74af48661"
# THIS IS GOOFY FOR BITBUCKET, BUT IT WORKED
SRC_URI = "git://bitbucket.org/xtacocorex/pycarhud.git;protocol=http;branch=master"
S = "${WORKDIR}/git"

inherit distutils
