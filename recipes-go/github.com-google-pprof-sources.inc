SRC_URI += "https://proxy.golang.org/github.com/google/pprof/@v/v0.0.0-20210804190019-f964ff605595.zip;srcoutput=github.com/google/pprof;srcinput=github.com/google/pprof@v0.0.0-20210804190019-f964ff605595;downloadfilename=github-com-google-pprof-0.0.0-20210804190019-f964ff605595.zip;name=github-com-google-pprof"
SRC_URI[github-com-google-pprof.sha256sum] = "224fc981d9fa6bcb28b24fa17db61274e0ff43cd00593b4bc7bad57c59b6812e"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-2-Clause-Views \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/pprof/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/google/pprof/third_party/d3/LICENSE;md5=0679931d76eb2f1dd1915249da84a722 \
    file://src/github.com/google/pprof/third_party/d3flamegraph/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
    file://src/github.com/google/pprof/third_party/svgpan/LICENSE;md5=d461adb153ae3553b5106ae77fd4d1db \
"

GOSRC_INCLUDEGUARD += "github.com-google-pprof-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-chzyer-readline-sources.inc', '', 'github.com-chzyer-readline-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ianlancetaylor-demangle-sources.inc', '', 'github.com-ianlancetaylor-demangle-sources.inc', d)}
