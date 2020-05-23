SUMMARY = "Pyre is a performant type checker for python"
HOMEPAGE = "https://github.com/facebook/pyre-check"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://pyre_check-${PV}.dist-info/LICENSE;md5=94f0d486b3ba1dd568004dc5cccd32bc"

COMPATIBLE_HOST = "^x86_64-linux|^i586-linux"

DEPENDS += "\
            python3-click-log-native \
            python3-click-native \
            python3-ipython-native \
            python3-libcst-native \
            python3-munch-native \
            python3-prompt-toolkit-native \
            python3-psutil-native \
            python3-pygments-native \
            python3-mypy-extensions-native \
            python3-pyre-extensions-native \
            python3-pywatchman-native \
            python3-sqlalchemy-native \
            python3-ujson-native \
            python3-xxhash-native \
            typeshed-native \
           "

SRC_URI = "https://files.pythonhosted.org/packages/88/60/75f4649500326c846d0faac306fc37888cecdfb1886fe32b92169dd683a4/pyre_check-0.0.46-py3-none-manylinux1_x86_64.whl;downloadfilename=pyre-${PV}.zip;subdir=${BP} \
           file://pyre.sca.description"
SRC_URI[md5sum] = "371e5d6d38ca8ca770c4f2e95f228989"
SRC_URI[sha256sum] = "5851b8181d2da147b75bb9cbdc30461ebe7f7ebd962f4259cda69d33e034b455"

UPSTREAM_CHECK_URI ?= "https://pypi.python.org/pypi/pyre-check/"
UPSTREAM_CHECK_REGEX = "pyre_check-(?P<pver>\d+\.\d+\.\d+)-py3-none-manylinux1_x86_64\.whl"

do_unpack[depends] += "unzip-native:do_populate_sysroot"

inherit python3native
inherit sca-description
inherit native

do_install() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/pyre_check
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/pyre_check-${PV}.dist-info

    cp -r ${S}/pyre_check/* ${D}${libdir}/${PYTHON_DIR}/site-packages/pyre_check/
    install -m 644 ${S}/pyre_check-${PV}.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/pyre_check-${PV}.dist-info/

    install -d ${D}${datadir}
    install ${WORKDIR}/pyre.sca.description ${D}${datadir}

    cat << EOF > ${WORKDIR}/pyre.bin
#!/bin/sh
nativepython3 -m pyre_check.client.pyre \$@
EOF
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/pyre.bin ${D}${bindir}
}

FILES_${PN} += "${bindir} ${datadir} ${PYTHON_SITEPACKAGES_DIR}"
