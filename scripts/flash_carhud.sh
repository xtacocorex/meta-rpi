#!/bin/bash

export OETMP=~/projects/embeddedpi/carhud/build/tmp
export MACHINE=raspberrypi

if [ "x${1}" = "x" ]; then
	echo "Usage: ${0} <block device>"
	exit 1
fi

if [ "${1}" = "sda" ]; then
	echo "Sorry, not going to work on /dev/sda"
	exit 1
fi

DEV=${1}
IMG=${2}
IMG_LONG="${IMG}-image-${MACHINE}"

if [ ! -b /dev/${DEV} ]; then
	echo "Block device not found: /dev/${DEV}"
	exit 1
fi

CARDSIZE=1

if [ -z "${OETMP}" ]; then
	echo "OETMP environment variable not set"
	exit 1
fi

if [ -z "${MACHINE}" ]; then
	echo "MACHINE environment variable not set"
	exit 1
fi

if [ "${MACHINE}" = "raspberrypi2" ]; then
	MACH="rpi2"
elif [ "${MACHINE}" = "raspberrypi" ]; then
	MACH="rpi"
else
	echo "Invalid MACHINE: ${MACHINE}"
	exit 1
fi

HOSTNAME="carhud"

SRCDIR=${OETMP}/deploy/images/${MACHINE}

if [ ! -f "${SRCDIR}/${IMG_LONG}.tar.bz2" ]; then
	echo "File not found: ${SRCDIR}/${IMG_LONG}.tar.bz2"
	exit 1
fi

if [ "${CARDSIZE}" -eq 8 ]; then
	echo -e "\n***** Zeroing 8GB of the SD card *****\n"
	sudo dd if=/dev/zero of=/dev/${DEV} bs=1M count=7400
elif [ "${CARDSIZE}" -eq 4 ]; then
	echo -e "\n***** Zeroing 4GB of the SD card *****\n"
	sudo dd if=/dev/zero of=/dev/${DEV} bs=1M count=3600
elif [ "${CARDSIZE}" -eq 2 ]; then
	echo -e "\n***** Zeroing 2GB of the SD card *****\n"
	sudo dd if=/dev/zero of=/dev/${DEV} bs=1M count=1800
elif [ "${CARDSIZE}" -eq 1 ]; then
        echo -e "\n***** Zeroing 1GB of the SD card *****\n"
        sudo dd if=/dev/zero of=/dev/${DEV} bs=1M count=900
else
	echo "Unsupported card size: ${CARDSIZE}"
	exit 1
fi

echo -e "\n***** Partitioning the SD card *****"
if [ "${CARDSIZE}" -eq 1 ]; then
    sudo ./mk2parts_1gb.sh ${DEV}
else
    sudo ./mk2parts.sh ${DEV}
fi

echo -e "\n***** Copying the boot partition *****"
./copy_boot.sh ${DEV}p 

echo -e "\n***** Copying the rootfs *****"
./copy_rootfs.sh ${DEV}p ${IMG} ${HOSTNAME} 

echo -e "\n***** Done *****\n"
