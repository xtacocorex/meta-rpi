DESCRIPTION = "Python JSON Server & Client"
HOMEPAGE = "http://cpiekarski.com/2011/05/09/super-easy-python-json-client-server/"
SECTION = "devel/python"
LICENSE = "GPLV3"
LIC_FILES_CHKSUM = "file://README;md5=ee81898440c50d224a72f46bfc23dc3e"

SRCNAME = "jsocket"
PR = "r0"

SRC_URI = "https://pypi.python.org/packages/source/j/jsocket/${SRCNAME}-${PV}.tar.gz"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils

COMPATIBLE_MACHINE = "raspberrypi"

SRC_URI[md5sum] = "5460d160fab307724c929688b3e75880"
SRC_URI[sha256sum] = "1bb7a247f73cc9d7a27cd48a471d55725032fe353080eb7f926ea77feae0260b"
