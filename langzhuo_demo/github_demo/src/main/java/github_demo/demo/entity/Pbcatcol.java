package github_demo.demo.entity;

import java.io.Serializable;

public class Pbcatcol implements Serializable {
    private String pbcTnam;

    private Integer pbcTid;

    private String pbcOwnr;

    private String pbcCnam;

    private Short pbcCid;

    private String pbcLabl;

    private Short pbcLpos;

    private String pbcHdr;

    private Short pbcHpos;

    private Short pbcJtfy;

    private String pbcMask;

    private Short pbcCase;

    private Short pbcHght;

    private Short pbcWdth;

    private String pbcPtrn;

    private String pbcBmap;

    private String pbcInit;

    private String pbcCmnt;

    private String pbcEdit;

    private String pbcTag;

    private static final long serialVersionUID = 1L;

    public String getPbcTnam() {
        return pbcTnam;
    }

    public void setPbcTnam(String pbcTnam) {
        this.pbcTnam = pbcTnam == null ? null : pbcTnam.trim();
    }

    public Integer getPbcTid() {
        return pbcTid;
    }

    public void setPbcTid(Integer pbcTid) {
        this.pbcTid = pbcTid;
    }

    public String getPbcOwnr() {
        return pbcOwnr;
    }

    public void setPbcOwnr(String pbcOwnr) {
        this.pbcOwnr = pbcOwnr == null ? null : pbcOwnr.trim();
    }

    public String getPbcCnam() {
        return pbcCnam;
    }

    public void setPbcCnam(String pbcCnam) {
        this.pbcCnam = pbcCnam == null ? null : pbcCnam.trim();
    }

    public Short getPbcCid() {
        return pbcCid;
    }

    public void setPbcCid(Short pbcCid) {
        this.pbcCid = pbcCid;
    }

    public String getPbcLabl() {
        return pbcLabl;
    }

    public void setPbcLabl(String pbcLabl) {
        this.pbcLabl = pbcLabl == null ? null : pbcLabl.trim();
    }

    public Short getPbcLpos() {
        return pbcLpos;
    }

    public void setPbcLpos(Short pbcLpos) {
        this.pbcLpos = pbcLpos;
    }

    public String getPbcHdr() {
        return pbcHdr;
    }

    public void setPbcHdr(String pbcHdr) {
        this.pbcHdr = pbcHdr == null ? null : pbcHdr.trim();
    }

    public Short getPbcHpos() {
        return pbcHpos;
    }

    public void setPbcHpos(Short pbcHpos) {
        this.pbcHpos = pbcHpos;
    }

    public Short getPbcJtfy() {
        return pbcJtfy;
    }

    public void setPbcJtfy(Short pbcJtfy) {
        this.pbcJtfy = pbcJtfy;
    }

    public String getPbcMask() {
        return pbcMask;
    }

    public void setPbcMask(String pbcMask) {
        this.pbcMask = pbcMask == null ? null : pbcMask.trim();
    }

    public Short getPbcCase() {
        return pbcCase;
    }

    public void setPbcCase(Short pbcCase) {
        this.pbcCase = pbcCase;
    }

    public Short getPbcHght() {
        return pbcHght;
    }

    public void setPbcHght(Short pbcHght) {
        this.pbcHght = pbcHght;
    }

    public Short getPbcWdth() {
        return pbcWdth;
    }

    public void setPbcWdth(Short pbcWdth) {
        this.pbcWdth = pbcWdth;
    }

    public String getPbcPtrn() {
        return pbcPtrn;
    }

    public void setPbcPtrn(String pbcPtrn) {
        this.pbcPtrn = pbcPtrn == null ? null : pbcPtrn.trim();
    }

    public String getPbcBmap() {
        return pbcBmap;
    }

    public void setPbcBmap(String pbcBmap) {
        this.pbcBmap = pbcBmap == null ? null : pbcBmap.trim();
    }

    public String getPbcInit() {
        return pbcInit;
    }

    public void setPbcInit(String pbcInit) {
        this.pbcInit = pbcInit == null ? null : pbcInit.trim();
    }

    public String getPbcCmnt() {
        return pbcCmnt;
    }

    public void setPbcCmnt(String pbcCmnt) {
        this.pbcCmnt = pbcCmnt == null ? null : pbcCmnt.trim();
    }

    public String getPbcEdit() {
        return pbcEdit;
    }

    public void setPbcEdit(String pbcEdit) {
        this.pbcEdit = pbcEdit == null ? null : pbcEdit.trim();
    }

    public String getPbcTag() {
        return pbcTag;
    }

    public void setPbcTag(String pbcTag) {
        this.pbcTag = pbcTag == null ? null : pbcTag.trim();
    }
}