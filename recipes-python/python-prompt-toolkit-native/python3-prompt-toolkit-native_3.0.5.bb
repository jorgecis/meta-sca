SUMMARY = "Library for building powerful interactive command lines in Python"
HOMEPAGE = "https://github.com/prompt-toolkit/python-prompt-toolkit"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b2cde7da89f0c1f3e49bf968d00d554f"

DEPENDS += "${PYTHON_PN}-wcwidth-native"

PYPI_PACKAGE = "prompt_toolkit"

SRC_URI[md5sum] = "96ba0be8d3145eb70e3da25654987670"
SRC_URI[sha256sum] = "563d1a4140b63ff9dd587bda9557cffb2fe73650205ab6f4383092fb882e7dc8"

inherit pypi
inherit native
inherit setuptools3
