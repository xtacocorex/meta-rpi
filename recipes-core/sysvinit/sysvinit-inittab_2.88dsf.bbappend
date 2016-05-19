# Brute force method to get rid of the auto-addition of the getty on /dev/ttyAMA0

do_install() {
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/inittab ${D}${sysconfdir}/inittab
}


