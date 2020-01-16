SUMMARY = "Linux kernel module for apds9301 sensor"
LICENSE = "GPLv3"
inherit module
SRC_URI = "git:/github.com/crispycookies/SSLYocto.git; \
protocol = https ; branch = light-sense"
SRCREV = "$ { AUTOREV }"
S = "${WORKDIR}/git/apds9301"
# The inherit of module . bbclass will automatically name module packages with
# " kernel - module -" prefix as required by the oe - core build environment .
