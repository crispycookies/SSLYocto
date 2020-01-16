SUMMARY = "Linux kernel module for Display"
LICENSE = "GPLv3"
inherit module
SRC_URI = "git://github.com/crispycookies/SSLYocto.git; \
protocol=https;branch=ssg-sense"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git/ssg-sense"
# The inherit of module . bbclass will automatically name module packages with
# " kernel - module -" prefix as required by the oe - core build environment .
