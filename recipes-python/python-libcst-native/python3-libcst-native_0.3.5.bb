SUMMARY = "A concrete syntax tree with AST-like properties for Python"
HOMEPAGE = "https://github.com/Instagram/LibCST"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acf9a070872c4bc6e8cffc2e9fbd4b8e"

DEPENDS += "\
            ${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') < 3.7, '${PYTHON_PN}-dataclasses-native', '')} \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-typing-extensions-native \
            ${PYTHON_PN}-typing-inspect-native \
           "

SRC_URI[md5sum] = "845972f07501d3c0645f35965758a3a6"
SRC_URI[sha256sum] = "c2a7cd82fd1cb5abb32f8e97fd936977a4fa04864c1d94adf513653a7c6209a4"

PYPI_PACKAGE = "libcst"

inherit pypi
inherit native
inherit setuptools3
