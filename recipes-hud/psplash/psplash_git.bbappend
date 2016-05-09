FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
#SPLASH_IMAGES += "file://psplash-carhud-img.h;outsuffix=carhud"

SRC_URI += "file://psplash-colors.h \
            file://psplash-bar-img.h "

# NB: this is only for the main logo image; if you add multiple images here,
#     poky will build multiple psplash packages with 'outsuffix' in name for
#     each of these ...
# SET outsuffix TO DEFAULT
SPLASH_IMAGES = "file://psplash-carhud-img.h;outsuffix=carhud"

# Copy over our custom colors and progress bar
do_configure_append () {
	cd ${S}
	cp ../psplash-colors.h ./
	cp ../psplash-bar-img.h ./
}

