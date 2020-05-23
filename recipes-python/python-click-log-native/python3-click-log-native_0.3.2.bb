SUMMARY = "Simple and beautiful logging for click applications"
HOMEPAGE = "https://github.com/click-contrib/click-log"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fee2943fdd4d8afbac9ccc1c8ac137d5"

DEPENDS += "${PYTHON_PN}-click-native"

SRC_URI[md5sum] = "5c9244f0fa5b3557220396e32d32daf2"
SRC_URI[sha256sum] = "16fd1ca3fc6b16c98cea63acf1ab474ea8e676849dc669d86afafb0ed7003124"

PYPI_PACKAGE = "click-log"

inherit pypi
inherit setuptools3
inherit native
