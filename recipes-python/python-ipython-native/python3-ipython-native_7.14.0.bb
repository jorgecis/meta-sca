SUMMARY = "IPython: Productive Interactive Computing"
HOMEPAGE = "https://github.com/ipython/ipython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96c7b03c4a9d8babd9ec57b1f0613d78"

DEPENDS += "\
            ${PYTHON_PN}-backcall-native \
            ${PYTHON_PN}-decorator-native \
            ${PYTHON_PN}-jedi-native \
            ${PYTHON_PN}-pickleshare-native \
            ${PYTHON_PN}-prompt-toolkit-native \
            ${PYTHON_PN}-pygments-native \
            ${PYTHON_PN}-stack-data-native \
            ${PYTHON_PN}-traitlets-native \
           "

PYPI_PACKAGE = "ipython"

SRC_URI[md5sum] = "57cc2a5064d86bcd8fee1293df1ef861"
SRC_URI[sha256sum] = "f0126781d0f959da852fb3089e170ed807388e986a8dd4e6ac44855845b0fb1c"

inherit pypi
inherit setuptools3
inherit native
