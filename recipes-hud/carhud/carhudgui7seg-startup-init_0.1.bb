DESCRIPTION = "CarHUD GUI 7 Segment Display Startup Initialization Script"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PR = "r2"

SRC_URI = "file://carhudgui7seg-startup-init \
           file://LICENSE.txt"

inherit update-rc.d

INITSCRIPT_NAME = "carhudgui7seg-startup"
INITSCRIPT_PARAMS = "start 1 1 2 3 4 5 . stop 80 0 6 ."

do_configure() {
    mv ${WORKDIR}/LICENSE.txt ${S}/
}

do_install() {
       install -d ${D}${sysconfdir}/init.d
       install -m 0755 ${WORKDIR}/carhudgui7seg-startup-init ${D}${sysconfdir}/init.d/carhudgui7seg-startup
}

FILES_${PN} = "${sysconfdir}/init.d/carhudgui7seg-startup"
