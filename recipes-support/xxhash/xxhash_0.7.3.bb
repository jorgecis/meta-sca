# This file is a modified version to found at
# http://cgit.openembedded.org/meta-openembedded/plain/meta-oe/recipes-support/xxhash
#
# The recipe and the provided patches are licensed under the following terms
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:

# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.

# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.

SUMMARY = "Extremely fast non-cryptographic hash algorithm"
DESCRIPTION = "xxHash is an extremely fast non-cryptographic hash algorithm, \
working at speeds close to RAM limits."
HOMEPAGE = "http://www.xxhash.com/"
LICENSE = "BSD-2-Clause & GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01a7eba4212ef1e882777a38585e7a9b"

SRC_URI = "git://github.com/Cyan4973/xxHash.git"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+(\.\d+)+)"

SRCREV = "d408e9b0606d07b1ddc5452ffc0ec8512211b174"

S = "${WORKDIR}/git"

do_compile () {
	oe_runmake all
}

do_install () {
	oe_runmake DESTDIR=${D} install
}

BBCLASSEXTEND = "native"
