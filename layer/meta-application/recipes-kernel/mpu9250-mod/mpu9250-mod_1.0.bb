SUMMARY = "Linux kernel module for mpu9250 sensor"
LICENSE = "CLOSED"
inherit module
SRC_URI = "git://github.com/crispycookies/SSLYocto.git;protocol=https;branch=mpu"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git/mpu9250"
# The inherit of module . bbclass will automatically name module packages with
# " kernel - module -" prefix as required by the oe - core build environment .
