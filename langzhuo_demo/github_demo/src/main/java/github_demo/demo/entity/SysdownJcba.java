package github_demo.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysdownJcba implements Serializable {
    private String xh;

    private String jxmc;

    private String jxjc;

    private String jxdm;

    private String jxdz;

    private String lxdh;

    private String lxr;

    private String frdb;

    private BigDecimal zczj;

    private String jxjb;

    private String kpxcx;

    private String fzjg;

    private String jxzt;

    private String shr;

    private Date cjsj;

    private Date gxsj;

    private String jym;

    private static final long serialVersionUID = 1L;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getJxmc() {
        return jxmc;
    }

    public void setJxmc(String jxmc) {
        this.jxmc = jxmc == null ? null : jxmc.trim();
    }

    public String getJxjc() {
        return jxjc;
    }

    public void setJxjc(String jxjc) {
        this.jxjc = jxjc == null ? null : jxjc.trim();
    }

    public String getJxdm() {
        return jxdm;
    }

    public void setJxdm(String jxdm) {
        this.jxdm = jxdm == null ? null : jxdm.trim();
    }

    public String getJxdz() {
        return jxdz;
    }

    public void setJxdz(String jxdz) {
        this.jxdz = jxdz == null ? null : jxdz.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    public String getFrdb() {
        return frdb;
    }

    public void setFrdb(String frdb) {
        this.frdb = frdb == null ? null : frdb.trim();
    }

    public BigDecimal getZczj() {
        return zczj;
    }

    public void setZczj(BigDecimal zczj) {
        this.zczj = zczj;
    }

    public String getJxjb() {
        return jxjb;
    }

    public void setJxjb(String jxjb) {
        this.jxjb = jxjb == null ? null : jxjb.trim();
    }

    public String getKpxcx() {
        return kpxcx;
    }

    public void setKpxcx(String kpxcx) {
        this.kpxcx = kpxcx == null ? null : kpxcx.trim();
    }

    public String getFzjg() {
        return fzjg;
    }

    public void setFzjg(String fzjg) {
        this.fzjg = fzjg == null ? null : fzjg.trim();
    }

    public String getJxzt() {
        return jxzt;
    }

    public void setJxzt(String jxzt) {
        this.jxzt = jxzt == null ? null : jxzt.trim();
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr == null ? null : shr.trim();
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Date getGxsj() {
        return gxsj;
    }

    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}