SUMMARY = "Traitlets Python config system"
HOMEPAGE = "http://ipython.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=eec4de4d599518742e54e75954e33b46"

PYPI_PACKAGE = "traitlets"

SRC_URI[md5sum] = "3a4f263af65d3d79f1c279f0247077ef"
SRC_URI[sha256sum] = "d023ee369ddd2763310e4c3eae1ff649689440d4ae59d7485eb4cfbbe3e359f7"

inherit pypi
inherit native
inherit setuptools3

