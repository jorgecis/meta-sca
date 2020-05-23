SUMMARY = "An autocompletion tool for Python that can be used for text editors"
HOMEPAGE = "https://github.com/davidhalter/jedi"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5ed06eebfcb244cd66ebf6cef9c23ab4"

DEPENDS += "${PYTHON_PN}-parso-native"

SRC_URI[md5sum] = "d6a8e5832939c51dceda474b720696f6"
SRC_URI[sha256sum] = "df40c97641cb943661d2db4c33c2e1ff75d491189423249e989bcea4464f3030"

PYPI_PACKAGE = "jedi"

inherit setuptools3
inherit native
inherit pypi
