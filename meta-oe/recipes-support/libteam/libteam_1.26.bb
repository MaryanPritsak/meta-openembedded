SUMMARY = "Library for controlling team network device"
HOMEPAGE = "http://www.libteam.org/"
SECTION = "libs/network"

PE = "1"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "libnl libdaemon jansson"
${PN}-utils_RDEPENDS = "bash"

SRC_URI = "git://github.com/jpirko/libteam"
SRCREV = "8c1cea00a21950089058e4e33ea1f7bf4deaddeb"

SRC_URI[md5sum] = "565114d70c41bff6093d8e57be284e8a"
SRC_URI[sha256sum] = "d65286379141db141bea33424ec0507bb0f827a0bf03d9c65004bb593e3d5545"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

FILES_${PN} = "${libdir}/libteam.so.*"

PACKAGES += "${PN}dctl ${PN}-utils"
FILES_${PN}dctl = "${libdir}/libteamdctl.so.* \
"
FILES_${PN}-utils = "${bindir}/bond2team \
                     ${bindir}/teamd \
                     ${bindir}/teamdctl \
                     ${bindir}/teamnl \
"

