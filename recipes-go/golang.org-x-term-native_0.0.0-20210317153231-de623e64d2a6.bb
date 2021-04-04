SUMMARY = "go.mod: golang.org/x/term"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/term"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-term-sources.inc

GO_IMPORT = "golang.org/x/term"

inherit gosrc
inherit native
