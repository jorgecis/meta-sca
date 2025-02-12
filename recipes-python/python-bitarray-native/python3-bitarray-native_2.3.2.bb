SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "959dd370b4d471c6088e959ee639704b"
SRC_URI[sha256sum] = "4bee3ba9164b66cef64f1099e9a3b88e99ddcd0c943807e99443613e184b48b4"

inherit pypi
inherit setuptools3
inherit native
