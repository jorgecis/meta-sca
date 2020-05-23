SUMMARY = "The Python SQL Toolkit and Object Relational Mapper"
HOMEPAGE = "https://github.com/sqlalchemy/sqlalchemy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c19467890539ff718c00a019c9c7a7b2"

PYPI_PACKAGE = "SQLAlchemy"

SRC_URI[md5sum] = "478214152b9293bf5652815d7312c890"
SRC_URI[sha256sum] = "156a27548ba4e1fed944ff9fcdc150633e61d350d673ae7baaf6c25c04ac1f71"

inherit pypi
inherit setuptools3
inherit native

