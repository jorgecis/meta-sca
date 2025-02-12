SUMMARY = "Utilities to parse Debian package, copyright and control files"
HOMEPAGE = "https://github.com/nexB/debian-inspector"

LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
    file://bsd-new.LICENSE;md5=7bdbf9caf4687a7e5803382ed7f2dcf6 \
    file://mit.LICENSE;md5=8d18be6409468bae48b33b87db85824a \
"

DEPENDS += "\
            python3-attrs-native \
            python3-chardet-native \
            python3-setuptools-scm-native \
            python3-toml-native \
           "

PYPI_PACKAGE = "debian_inspector"

SRC_URI[md5sum] = "30441d06092d9aa6f604dced6614d895"
SRC_URI[sha256sum] = "5c619eaeb2ebb4b7010eda15141cf6738db3b0171527316d415b4d0038567db4"

inherit pypi
inherit setuptools3
inherit native

UPSTREAM_CHECK_URI = "https://pypi.org/project/debian-inspector/"
UPSTREAM_CHECK_REGEX = "/debian-inspector/(?P<pver>(\d+[\.\-_]*)+)/"
