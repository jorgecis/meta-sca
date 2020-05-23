SUMMARY = "Specifications for callback functions passed in to an API"
HOMEPAGE = "https://github.com/takluyver/backcall"

LICENSE = "Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://backcall/_signatures.py;beginline=10;endline=16;md5=3a27c95a56b90e286a96edb24281ea6a"

PYPI_PACKAGE = "backcall"

SRC_URI[md5sum] = "87ce0c7839808e6a3427d57df6a792e7"
SRC_URI[sha256sum] = "38ecd85be2c1e78f77fd91700c76e14667dc21e2713b63876c0eb901196e01e4"

inherit pypi
inherit native
inherit setuptools3
