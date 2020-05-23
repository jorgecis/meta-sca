SUMMARY = "Runtime inspection utilities for typing module"
HOMEPAGE = "https://github.com/ilevkivskyi/typing_inspect"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38939e40df14ccacab135b023198167a"

PYPI_PACKAGE = "typing_inspect"

UPSTREAM_CHECK_REGEX ?= "/typing-inspect/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "987fa620fd0ac7b6be9c8f6d71eeea2e"
SRC_URI[sha256sum] = "8f1b1dd25908dbfd81d3bebc218011531e7ab614ba6e5bf7826d887c834afab7"

inherit pypi
inherit native
inherit setuptools3
