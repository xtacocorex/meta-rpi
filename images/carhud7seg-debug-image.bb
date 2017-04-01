SUMMARY = "CarHUD Image: 7-Segment LED - DEBUG"
HOMEPAGE = "http://engineering-with-a-rpi.blogspot.com"
LICENSE = "MIT"

# REMOVE MACHINE FEATURES
MACHINE_FEATURES_remove = "touchscreen alsa bluetooth wifi package-management splash"

#IMAGE_FEATURES += "read-only-rootfs"
IMAGE_LINGUAS = "en-us"

inherit core-image

DEPENDS += "bcm2835-bootfiles"

CORE_OS = " \
    term-prompt \
 "

EXTRA_TOOLS_INSTALL = " \
    i2c-tools \
    vim-tiny \
 "

RPI_STUFF = " \
    bcm2835-tests \
    wiringpi \
    rpio \
    rpi-gpio \
    pi-blaster \
    userland \
 "

# PYTHON 2.7
CARHUD_PYTHON += "libpython2 \
                  python-core \
                  python-dev \
                  python-logging \
                  python-re \
                  python-smbus \
                  python-subprocess"

# ADAFRUIT RASPBERRY PI PYTHON LIBRARIES
CARHUD_NEEDS = "adafruit-python-gpio \
                adafruit-python-ledbackpack \
                python-pyserial \
                pyelm327 \
                pycarhud \
                carhud-extras \
                carhud-config"

# GPS NEEDED ITEMS
GPS_NEEDS = "gpsd \
             libgps \
             python-pygps \
             gpsd-conf \
             gpsd-udev \
             gpsd-gpsctl \ 
             gps-utils"

# PYGAME + SDL FOR LCD PROJECTOR HUD
#CARHUD_GFX_NEEDS += "python-pygame"
# SDL
#CARHUD_GFX_NEEDS += "libsdl jpeg libsdl-dev libsdl-ttf libsdl-ttf-dev libsdl-mixer libsdl-mixer-dev libsdl-image libsdl-image-dev"

# CARHUD INIT CODE
# DEBUG BUILD
CARHUD_NEEDS += "carhudgui7seg-startup-init carhudgui7seg-test-init"

# FULL BUILD
#CARHUD_NEEDS += "carhudgui7seg-startup-init carhudgui7seg-init"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${EXTRA_TOOLS_INSTALL} \
    ${CARHUD_PYTHON} \
    ${CARHUD_NEEDS} \
    ${RPI_STUFF} \
 "

# SET THE SPLASH TO THE CARHUD ONE
#SPLASH = "psplash-carhud"

# BLANK OUT THE SERIAL CONSOLE
SERIAL_CONSOLE = ""

set_local_timezone() {
    ln -sf /usr/share/zoneinfo/CST5CDT ${IMAGE_ROOTFS}/etc/localtime
}

disable_bootlogd() {
    echo BOOTLOGD_ENABLE=no > ${IMAGE_ROOTFS}/etc/default/bootlogd
}

ROOTFS_POSTPROCESS_COMMAND += " \
    set_local_timezone ; \
    disable_bootlogd ; \
 "

export IMAGE_BASENAME = "carhud7seg-debug-image"

