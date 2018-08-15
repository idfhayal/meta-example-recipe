#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

#require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

# Needed for build
#DEPENDS = "dtc-native bc-native u-boot-mkimage-native"

# Package names if there are more than one
#PACKAGES = "\
#    gstreamer1.0-meta-base \
#    gstreamer1.0-meta-x11-base \
#    gstreamer1.0-meta-audio \
#    gstreamer1.0-meta-debug \
#    gstreamer1.0-meta-video"

# Needed in root fs for runtime
#RDEPENDS_gstreamer1.0-meta-audio = "\
#    gstreamer1.0-plugins-base-vorbis \
#    gstreamer1.0-plugins-base-ogg \
#    gstreamer1.0-plugins-good-wavparse \
#    gstreamer1.0-plugins-good-flac \
#    ${COMMERCIAL_AUDIO_PLUGINS}"
#RDEPENDS_${PN} = "gstreamer1.0-plugins-base-vorbis"

# Not mandatory but needed for extra functionality
#RRECOMMENDS_gstreamer1.0-meta-x11-base = "\
#    gstreamer1.0-plugins-base-ximagesink \
#    gstreamer1.0-plugins-base-xvimagesink"

# Replace another package
#RREPLACES_${PN} = "some_package"


SUMMARY = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://helloworld.c"

S = "${WORKDIR}"

do_compile() {
	     ${CC} ${LDFLAGS} helloworld.c -o helloworld
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 helloworld ${D}${bindir}
}
