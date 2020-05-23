SUMMARY = "Watches files and records, or triggers actions, when they change"
HOMEPAGE = "https://github.com/facebook/watchman"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS += "\
            boost-native \
            fmt-native \
            folly-native \
            gflags-native \
            glog-native \
            gmock-native \
            libevent-native \
            pcre-native \
           "

SRC_URI = "git://github.com/facebook/watchman.git;protocol=https"
SRCREV = "3dc28870833c5c4e4684a2b03e88ed0feaa85517"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+(\.\d+)+)"

S = "${WORKDIR}/git"

inherit cmake
inherit native

# disable python, node and yarn support
EXTRA_OECMAKE_append = " -DPYTHON3='' -DNODE='' -DYARN=''"
