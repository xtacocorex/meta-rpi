DESCRIPTION = "CarHUD GUI 7 Segment Display Initialization Script"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PR = "r1"

SRC_URI = "file://carhudgui7seg-init \
           file://LICENSE.txt"

inherit update-rc.d

INITSCRIPT_NAME = "carhudgui7seg"
INITSCRIPT_PARAMS = "defaults 96"

do_configure() {
    mv ${WORKDIR}/LICENSE.txt ${S}/
}

do_install() {
       install -d ${D}${sysconfdir}/init.d
       install -m 0755 ${WORKDIR}/carhudgui7seg-init ${D}${sysconfdir}/init.d/carhudgui7seg
}

FILES_${PN} = "${sysconfdir}/init.d/carhudgui7seg"
