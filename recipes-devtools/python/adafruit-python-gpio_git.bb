DESCRIPTION = "Adafruit Python GPIO Library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bda1c9cc018bbe5da02d845724b71d55"

PR = "r1"

inherit setuptools

COMPATIBLE_MACHINE = "raspberrypi"

SRCREV = "cdf7a7b8a2bc49d6d37ac676a240492bdd14684b"
SRC_URI = "git://github.com/adafruit/Adafruit_Python_GPIO.git;protocol=git;branch=master"
S = "${WORKDIR}/git"
