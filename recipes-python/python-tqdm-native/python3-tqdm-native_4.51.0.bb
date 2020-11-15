SUMMARY = "Fast, Extensible Progress Meter"
HOMEPAGE = "https://github.com/tqdm/tqdm"

LICENSE = "MIT & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENCE;md5=7ea57584e3f8bbde2ae3e1537551de25"

PYPI_PACKAGE = "tqdm"

SRC_URI[md5sum] = "b188c2dc7802c19b262971e566c265ce"
SRC_URI[sha256sum] = "ef54779f1c09f346b2b5a8e5c61f96fbcb639929e640e59f8cf810794f406432"

inherit pypi
inherit native
inherit setuptools3
