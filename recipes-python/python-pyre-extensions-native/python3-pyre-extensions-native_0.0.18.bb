SUMMARY = "Type system extensions for use with the pyre type checker"
HOMEPAGE = "https://pyre-check.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94f0d486b3ba1dd568004dc5cccd32bc"

PYPI_PACKAGE = "pyre-extensions"

SRC_URI[md5sum] = "1640deff6a207e5957bbc93bfec36680"
SRC_URI[sha256sum] = "60e0411e91ecbeaf1fd5d8851ffce42baf6a74ec7ccd01db545c7a97f15aac30"

inherit pypi
inherit native
inherit setuptools3
