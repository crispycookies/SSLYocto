SUMMARY = "Linux kernel module for hc-sensor"
LICENSE = "CLOSED"
inherit module
SRC_URI = "git://github.com/crispycookies/SSLYocto.git;protocol=https;branch=hc-sensor"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git/hc-sensor"
# The inherit of module . bbclass will automatically name module packages with
# " kernel - module -" prefix as required by the oe - core build environment .
