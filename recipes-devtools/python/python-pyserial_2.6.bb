DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
HOMEPAGE = "http://pyserial.sourceforge.net/"
SECTION = "devel/python"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d88c706961680d5d232a4ae0879b1714"

SRCNAME = "pyserial"
PR = "r0"

SRC_URI = "https://pypi.python.org/packages/source/p/pyserial/${SRCNAME}-${PV}.tar.gz"
S = "${WORKDIR}/${SRCNAME}-${PV}"

#inherit setuptools
inherit distutils

COMPATIBLE_MACHINE = "raspberrypi"

SRC_URI[md5sum] = "cde799970b7c1ce1f7d6e9ceebe64c98"
SRC_URI[sha256sum] = "049dbcda0cd475d3be903e721d60889ee2cc4ec3b62892a81ecef144196413ed"

