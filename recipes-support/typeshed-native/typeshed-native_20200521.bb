SUMMARY = "Collection of library stubs for Python, with static types"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ea35644f0ec0d9767897115667e901f"

SRC_URI = "git://github.com/python/typeshed.git;protocol=https"
SRCREV = "e1e99245bb46223928eba68d4fc74962240ba5b4"

S = "${WORKDIR}/git"

inherit native

do_install() {
    install -d ${D}${datadir}/typeshed
    cp -ra ${S}/stdlib ${D}${datadir}/typeshed/
    cp -ra ${S}/third_party ${D}${datadir}/typeshed/
}

FILES_${PN} = "${datadir}"
