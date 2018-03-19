package github_demo.demo.entity;

import java.io.Serializable;

public class DownFzmx implements Serializable {
    private Long fzmxId;

    private Long fzjhId;

    private String lsh;

    private String sfzmhm;

    private String xm;

    private String dlr;

    private String kchp;

    private String jxxh;

    private Integer kscs;

    private String zt;

    private String jym;

    private static final long serialVersionUID = 1L;

    public Long getFzmxId() {
        return fzmxId;
    }

    public void setFzmxId(Long fzmxId) {
        this.fzmxId = fzmxId;
    }

    public Long getFzjhId() {
        return fzjhId;
    }

    public void setFzjhId(Long fzjhId) {
        this.fzjhId = fzjhId;
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh == null ? null : lsh.trim();
    }

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm == null ? null : sfzmhm.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getDlr() {
        return dlr;
    }

    public void setDlr(String dlr) {
        this.dlr = dlr == null ? null : dlr.trim();
    }

    public String getKchp() {
        return kchp;
    }

    public void setKchp(String kchp) {
        this.kchp = kchp == null ? null : kchp.trim();
    }

    public String getJxxh() {
        return jxxh;
    }

    public void setJxxh(String jxxh) {
        this.jxxh = jxxh == null ? null : jxxh.trim();
    }

    public Integer getKscs() {
        return kscs;
    }

    public void setKscs(Integer kscs) {
        this.kscs = kscs;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}