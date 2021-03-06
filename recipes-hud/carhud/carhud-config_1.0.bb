DESCRIPTION = "CarHUD Config"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PR = "r3"

SRC_URI = "              \
    file://carhud.cfg \
    file://LICENSE.txt \
    "

do_configure() {
    install -m 0555 ${WORKDIR}/LICENSE.txt ${S}/
}

do_install() {
    # CREATE DIRECTORIES, WE NEED etc
    install -d ${D}${sysconfdir}

    # INSTALL THE FILES
    install -m 0555 ${WORKDIR}/carhud.cfg                 ${D}${sysconfdir}/
}

