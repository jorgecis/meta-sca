SUMMARY = "A Python Parser"
DESCRIPTION = "Parso is a Python parser that supports error recovery and round-trip parsing for different \
               Python versions (in multiple Python versions). Parso is also able to list multiple syntax \
               errors in your python file"
HOMEPAGE = "https://github.com/davidhalter/parso"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbaa2675b2424d771451332a7a69503f"

PYPI_PACKAGE = "parso"

SRC_URI[md5sum] = "d3a892fb4d9a0ffed838b0a3416145bf"
SRC_URI[sha256sum] = "908e9fae2144a076d72ae4e25539143d40b8e3eafbaeae03c1bfe226f4cdf12c"

inherit pypi
inherit native
inherit setuptools3
