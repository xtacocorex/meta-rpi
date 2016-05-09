DESCRIPTION = "Adafruit Python LED Backpack Library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bda1c9cc018bbe5da02d845724b71d55"

PR = "r1"

inherit setuptools

COMPATIBLE_MACHINE = "raspberrypi"

SRCREV = "c8c8bda4c2cdbc630240bf0e3a988226fb66f2b7"
SRC_URI = "git://github.com/adafruit/Adafruit_Python_LED_Backpack.git;protocol=git;branch=master"
S = "${WORKDIR}/git"
