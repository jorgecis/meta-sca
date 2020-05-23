SUMMARY = "Ultra fast JSON encoder and decoder for Python"
HOMEPAGE = "https://github.com/ultrajson/ultrajson"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=28e8a9bd90d4afa9505f7ccea0b1ec1a"

DEPENDS += "\
            ${PYTHON_PN}-setuptools-scm-native \
            ${PYTHON_PN}-wheel-native \
           "

PYPI_PACKAGE = "ujson"

SRC_URI[md5sum] = "80d288c186dd02579e1561494b45aa41"
SRC_URI[sha256sum] = "bd2deffc983827510e5145fb66e4cc0f577480c62fe0b4882139f8f7d27ae9a3"

inherit pypi
inherit native
inherit setuptools3
