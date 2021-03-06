require u-boot-socfpga-common.inc
require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

PR = "2"

FILESEXTRAPATHS =. "${THISDIR}/files/v2019.07:"

SRCREV = "7e090b466c5ba874d31c1bf22c3a130d516cdc32"

SRC_URI_append = "\
	file://0001-ARM-socfpga-stratix10-Enable-PSCI-system-reset.patch \
	file://0002-ARM-socfpga-stratix10-Enable-PSCI-CPU_ON.patch \
	file://0003-ARM-socfpga-stratix10-Enable-PSCI-support-for-Strati.patch \
	file://0004-ARM-socfpga-stratix10-Enable-SMC-PSCI-calls-from-sla.patch \
	file://0005-ARM-socfpga-stratix10-Add-SOCFPGA-bridges-reset-supp.patch \
	file://0006-ARM-socfpga-stratix10-Add-Stratix10-FPGA-configurati.patch \
	file://0007-mmc-dwmmc-Enable-small-delay-before-returning-error.patch \
	file://0008-ARM-socfpga-stratix10-Enable-DMA330-DMA-controller.patch \
	file://0009-ARM-socfpga-Stratix10-Fix-el3_exception_vectors-relo.patch \
	file://0010-Makefile-Add-target-to-generate-hex-output-for-combi.patch \
	file://0011-ARM-socfpga-stratix10-Remove-CONFIG_OF_EMBED.patch \
	file://0012-ARM-socfpga-stratix10-Temporarily-revert-to-2GB-DRAM.patch \
	file://0001-ARM-socfpga-Stratix10-Disable-CONFIG_PSCI_RESET.patch \
    "

DEPENDS += "dtc-native bc-native bison-native u-boot-mkimage-native"
