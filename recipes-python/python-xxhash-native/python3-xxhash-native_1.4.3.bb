SUMMARY = "Python binding for xxHash"
HOMEPAGE = "https://github.com/ifduyue/python-xxhash"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5a8d76283514a1b7e6a414aba38629b5"

DEPENDS += "xxhash-native"

PYPI_PACKAGE = "xxhash"

SRC_URI[md5sum] = "ce9cbbcc89620fd47a2468badd08dcf0"
SRC_URI[sha256sum] = "8b6b1afe7731d7d9cbb0398b4a811ebb5e6be5c174f72c68abf81f919a435de9"

inherit pypi
inherit native
inherit setuptools3
