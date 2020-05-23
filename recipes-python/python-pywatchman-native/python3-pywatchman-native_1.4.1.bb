SUMMARY = "Watchman client for python"
HOMEPAGE = "https://github.com/facebook/watchman"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://pywatchman/__init__.py;endline=27;md5=b796016b1af2c03b44731656c09d2965"

DEPENDS += "watchman-native"

PYPI_PACKAGE = "pywatchman"

SRC_URI[md5sum] = "d770d09bd105e83013f63492fce70c6f"
SRC_URI[sha256sum] = "d0047eb275deafb0011eda0a1a815fbd9742478c3d2b5ad6956d300e447dc2f9"

inherit pypi
inherit native
inherit setuptools3
