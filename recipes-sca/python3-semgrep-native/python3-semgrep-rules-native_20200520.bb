SUMMARY = "standard library for Semgrep rules"
HOMEPAGE = "https://github.com/returntocorp/semgrep-rules"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"

SRC_URI = "git://github.com/returntocorp/semgrep-rules.git;protocol=https"
SRCREV = "ce887a3919da7fef543c56271375338ed61d6c5a"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}/semgrep-rules
    for folder in $(find ${S} -type d -mindepth 1 -maxdepth 1 -not -name ".*" -exec basename {} \;); do
        cp -r ${S}/$folder ${D}${datadir}/semgrep-rules/$folder
    done
}

FILES_${PN} = "${datadir}"
