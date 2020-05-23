SUMMARY = "Efficient binary-decimal and decimal-binary conversion routines for IEEE doubles"
HOMEPAGE = "https://github.com/google/double-conversion"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ea35644f0ec0d9767897115667e901f"

SRC_URI = "git://github.com/google/double-conversion.git;protocol=https"
SRCREV = "5fa81e88ef24e735b4283b8f7454dc59693ac1fc"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+(\.\d+)+)"

S = "${WORKDIR}/git"

inherit cmake
inherit pkgconfig
inherit native
