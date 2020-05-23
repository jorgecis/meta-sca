SUMMARY = "Cross-platform lib for process and system monitoring in Python"
HOMEPAGE = "https://github.com/giampaolo/psutil"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e35fd9f271d19d5f742f20a9d1f8bb8b"

PYPI_PACKAGE = "psutil"

SRC_URI[md5sum] = "ed7b0f11ed214bcabbe76b7cf52f3ae3"
SRC_URI[sha256sum] = "685ec16ca14d079455892f25bd124df26ff9137664af445563c1bd36629b5e0e"

inherit pypi
inherit native
inherit setuptools3
