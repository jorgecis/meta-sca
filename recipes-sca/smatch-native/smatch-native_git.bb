SUMMARY = "Static analysis for C"
HOMEPAGE = "http://smatch.sf.net/"

LICENSE = "GPLv2 & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57bc3ea2207bbe46445df8b74e0aea3d"

DEPENDS += "\
            libxml2-native \
            openssl-native \
            sqlite3-native \
           "

SRC_URI = "git://repo.or.cz/smatch.git;protocol=https \
           file://smatch.sca.description"
SRCREV = "72c21a144a812cadbe349801da1b24bc331af256"

PV = "1.60+${SRCREV}"

S = "${WORKDIR}/git"

inherit pkgconfig
inherit native
inherit sca-description

export BUILD_LDFLAGS = "-L${STAGING_LIBDIR_NATIVE} \
                        -L${STAGING_BASE_LIBDIR_NATIVE}"

do_compile() {
    oe_runmake DESTDIR=${D} FILESDIR=${datadir} PREFIX=${prefix}
}

do_install() {
    oe_runmake install DESTDIR=${D} FILESDIR=${datadir} PREFIX=${prefix}
    install ${WORKDIR}/smatch.sca.description ${D}${datadir}
}

FILES_${PN} = "${bindir} ${datadir}"
