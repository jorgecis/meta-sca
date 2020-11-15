SUMMARY = "Lightweight static analysis for many languages (core)"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

COMPATIBLE_HOST = "^x86_64-linux"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=650b869bd8ff2aed59c62bad2a22a821"

SRC_URI_append = "https://github.com/returntocorp/semgrep/releases/download/v${PV}/semgrep-v${PV}-ubuntu-16.04.tgz;name=app \
                  https://raw.githubusercontent.com/returntocorp/semgrep/v${PV}/LICENSE;name=license;downloadname=${BPN}-LICENSE\
                 "
SRC_URI[app.md5sum] = "dcf48ddac91138d424a955661ec0b07f"
SRC_URI[app.sha256sum] = "29130d2e92a95f35d37843a1e2788f7896d41012c3588da9b3dbfff6a2e09804"
SRC_URI[license.md5sum] = "650b869bd8ff2aed59c62bad2a22a821"
SRC_URI[license.sha256sum] = "7c34d28e784b202aa4998f477fd0aa9773146952d7f6fa5971369fcdda59cf48"

inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/semgrep-files/semgrep-core ${D}${bindir}/semgrep-core
    install -m 0755 ${WORKDIR}/semgrep-files/spacegrep ${D}${bindir}/spacegrep
}

FILES_${PN} += "${bindir}"
