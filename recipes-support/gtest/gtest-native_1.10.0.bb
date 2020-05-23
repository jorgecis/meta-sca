# This file is a modified version to found at
# https://github.com/carlesfernandez/meta-gnss-sdr/blob/master/recipes-test/gtest/
#
# The recipe and the provided patches are licensed under the following terms
#s
# Copyright 2016 Carles Fernandez-Prades <carles.fernandez@cttc.es>
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

DESCRIPTION = "Google's framework for writing C++ tests"
HOMEPAGE = "https://github.com/google/googletest"
SECTION = "libs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://googlemock/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a \
                    file://googletest/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a"

PROVIDES += "gmock-native gtest-native"

S = "${WORKDIR}/git"
SRCREV = "703bd9caab50b139428cea1aaff9974ebee5742e"
SRC_URI = "git://github.com/google/googletest.git"

inherit cmake
inherit native

ALLOW_EMPTY_${PN} = "1"
ALLOW_EMPTY_${PN}-dbg = "1"

BCLASSEXTEND = "native nativesdk"
RDEPENDS_${PN}-dev = ""
EXTRA_OECMAKE += "-DBUILD_GTEST=ON"

# GTest developers recommend to use source code instead of linking
# against a prebuilt library.

do_install() {
    _incdir=${includedir}/gtest
    _srcdir=${prefix}/src/gtest

    install -d ${D}${_incdir}/internal
    install -d ${D}${_srcdir}/src
    install -d ${D}${_srcdir}/cmake

    mkdir -p ${D}${_incdir}/internal/custom

    install -v -m 0644 ${S}/googletest/include/gtest/*.h ${D}${_incdir}
    install -v -m 0644 ${S}/googletest/include/gtest/internal/*.h ${D}${_incdir}/internal
    install -v -m 0644 ${S}/googletest/include/gtest/internal/custom/*.h ${D}${_incdir}/internal/custom
    install -v -m 0644 ${S}/googletest/src/* ${D}${_srcdir}/src
    install -v -m 0644 ${S}/CMakeLists.txt ${D}${_srcdir}
    install -v -m 0644 ${S}/googletest/cmake/* ${D}${_srcdir}/cmake
}

sysroot_stage_all_append() {
    sysroot_stage_dir ${D}${prefix}/src ${SYSROOT_DESTDIR}${prefix}/src
}

FILES_${PN}-dev += "${prefix}/src"
