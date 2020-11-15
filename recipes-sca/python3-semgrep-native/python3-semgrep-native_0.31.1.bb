SUMMARY = "Lightweight static analysis for many languages"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=650b869bd8ff2aed59c62bad2a22a821"

COMPATIBLE_HOST = "^x86_64-linux"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-colorama-native \
            ${PYTHON_PN}-jsonschema-native \
            ${PYTHON_PN}-junit-xml-native \
            ${PYTHON_PN}-packaging-native \
            ${PYTHON_PN}-requests-native \
            ${PYTHON_PN}-semgrep-rules-native \
            ${PYTHON_PN}-ruamelyaml-native \
            ${PYTHON_PN}-tqdm-native \
            ${PYTHON_PN}-wheel-native \
           "

SRC_URI_append = " file://semgrep.sca.description \
                  https://raw.githubusercontent.com/returntocorp/semgrep/v${PV}/LICENSE;name=license;downloadname=${BPN}-LICENSE\
                  https://github.com/returntocorp/semgrep/releases/download/v${PV}/semgrep-v${PV}-ubuntu-16.04.tgz;name=app \
                 "
SRC_URI[md5sum] = "786fca5874ac20c7980057be6221f598"
SRC_URI[sha256sum] = "f428d93c2b8a1ea2b640d9a613e6cd3b55249271bbb578acc526be16d880dbc9"
SRC_URI[app.md5sum] = "dcf48ddac91138d424a955661ec0b07f"
SRC_URI[app.sha256sum] = "29130d2e92a95f35d37843a1e2788f7896d41012c3588da9b3dbfff6a2e09804"
SRC_URI[license.md5sum] = "650b869bd8ff2aed59c62bad2a22a821"
SRC_URI[license.sha256sum] = "7c34d28e784b202aa4998f477fd0aa9773146952d7f6fa5971369fcdda59cf48"

PYPI_PACKAGE = "semgrep"

inherit pypi
inherit sca-description
inherit native
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/semgrep.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
# binary blobs are obviously pre-stripped
INSANE_SKIP_${PN} += "already-stripped"
