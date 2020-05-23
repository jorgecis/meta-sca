SUMMARY = "An open-source C++ library developed and used at Facebook"
HOMEPAGE = "https://github.com/facebook/folly"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=66ebf2d74d339900710c1f776cd41035"

DEPENDS += "\
            binutils-native \
            boost-native \
            double-conversion-native \
            fmt-native \
            gflags-native \
            glog-native \
            libevent-native \
            libunwind-native \
            lz4-native \
            openssl-native \
            snappy-native \
            xz-native \
            zlib-native \
           "

## TODOs 
# libdouble-conversion-native \ ## > https://github.com/google/double-conversion
# libjemalloc-native \ ## > layer index
# snappy-native \ ## > oe

SRC_URI = "git://github.com/facebook/folly.git;protocol=https"
SRCREV = "b14c9ea61cb43665eb6ef6aa600f745483f1fe97"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+(\.\d+)+)"

S = "${WORKDIR}/git"

inherit cmake
inherit pkgconfig
inherit native
