SRC_URI += "https://proxy.golang.org/github.com/klauspost/compress/@v/v1.13.4.zip;srcoutput=github.com/klauspost/compress;srcinput=github.com/klauspost/compress@v1.13.4;downloadfilename=github-com-klauspost-compress-1.13.4.zip;name=github-com-klauspost-compress"
SRC_URI[github-com-klauspost-compress.sha256sum] = "8128fc0616e89da12b2948c7343ff486c350194b6d47772338c699ea5b6d3988"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/klauspost/compress/LICENSE;md5=f6eed50d75781660de81b193021f14a2 \
    file://src/github.com/klauspost/compress/gzhttp/LICENSE;md5=69b0fc8968f6bb69f0abba8730fddff9 \
    file://src/github.com/klauspost/compress/s2/LICENSE;md5=2460814a2b25a7277556c2d89de915d1 \
    file://src/github.com/klauspost/compress/s2/cmd/internal/readahead/LICENSE;md5=42a7f8bb0a8aa77348e7e5817f10976a \
    file://src/github.com/klauspost/compress/snappy/LICENSE;md5=b8b79c7d4cda128290b98c6a21f9aac6 \
    file://src/github.com/klauspost/compress/zstd/internal/xxhash/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
"

GOSRC_INCLUDEGUARD += "github.com-klauspost-compress-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-snappy-sources.inc', '', 'github.com-golang-snappy-sources.inc', d)}
