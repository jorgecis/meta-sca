SUMMARY = "Lightweight static analysis for many languages (core)"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

COMPATIBLE_HOST = "^x86_64-linux"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=650b869bd8ff2aed59c62bad2a22a821"

SRC_URI:append = "https://github.com/returntocorp/semgrep/releases/download/v${PV}/semgrep-v${PV}-ubuntu-16.04.tgz;name=app \
                  https://raw.githubusercontent.com/returntocorp/semgrep/v${PV}/LICENSE;name=license;downloadname=${BPN}-LICENSE\
                 "

UPSTREAM_CHECK_URI = "https://github.com/returntocorp/semgrep/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>\d+\.\d+\.\d+)"

SRC_URI[app.sha256sum] = "14f29fe824f9fa288e5e6c0f6e48f0a11dcacd1878073c699873b62df3827e50"
SRC_URI[license.sha256sum] = "7c34d28e784b202aa4998f477fd0aa9773146952d7f6fa5971369fcdda59cf48"

inherit native
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/semgrep-files/semgrep-core ${D}${bindir}/semgrep-core
    install -m 0755 ${WORKDIR}/semgrep-files/spacegrep ${D}${bindir}/spacegrep
}

FILES:${PN} += "${bindir}"
