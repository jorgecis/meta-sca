SUMMARY = "Extract data from python stack frames and tracebacks for informative displays"
HOMEPAGE = "https://github.com/alexmojaki/stack_data"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a3d6c15f7859ae235a78f2758e5a48cf"

DEPENDS += "\
            ${PYTHON_PN}-setuptools-scm-native\
            ${PYTHON_PN}-toml-native \
            ${PYTHON_PN}-wheel-native \
            "

SRC_URI = "git://github.com/alexmojaki/stack_data.git;protocol=https"
SRCREV = "0303449f41eab7e4064e301bb9eb0d046ba45a84"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native
