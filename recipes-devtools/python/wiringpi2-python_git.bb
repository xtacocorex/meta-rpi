DESCRIPTION = "Arduino like Wiring library for Raspberry Pi with Python Bindings"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://README;md5=7f4b11d304341f1d27d0a900182613b1"

PR = "r1"

#DEPENDS = "wiringpi"

COMPATIBLE_MACHINE = "raspberrypi"

SRCREV = "4ca39a67619641b9599a71c396f83d48544c7e57"
SRC_URI = "git://github.com/WiringPi/WiringPi-Python.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

inherit setuptools


#do_compile() {
#    ${S}/build.sh
#}
