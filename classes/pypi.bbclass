# This a backport copy of upstream poky class of the same name
def pypi_package(d):
    bpn = d.getVar('BPN', True)
    if bpn.startswith('python-'):
        return bpn[7:]
    elif bpn.startswith('python3-'):
        return bpn[8:]
    return bpn

PYPI_PACKAGE ?= "${@pypi_package(d)}"
PYPI_PACKAGE_EXT ?= "tar.gz"

def pypi_src_uri(d):
    package = d.getVar('PYPI_PACKAGE', True)
    package_ext = d.getVar('PYPI_PACKAGE_EXT', True)
    pv = d.getVar('PV', True)
    return 'https://files.pythonhosted.org/packages/source/%s/%s/%s-%s.%s' % (package[0], package, package, pv, package_ext)

PYPI_SRC_URI ?= "${@pypi_src_uri(d)}"

HOMEPAGE ?= "https://pypi.python.org/pypi/${PYPI_PACKAGE}/"
SECTION = "devel/python"
SRC_URI += "${PYPI_SRC_URI}"
S = "${WORKDIR}/${PYPI_PACKAGE}-${PV}"

UPSTREAM_CHECK_URI ?= "https://pypi.python.org/pypi/${PYPI_PACKAGE}/"
UPSTREAM_CHECK_REGEX ?= "/${PYPI_PACKAGE}/(?P<pver>(\d+[\.\-_]*)+)"
