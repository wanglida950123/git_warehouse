package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class DownFz implements Serializable {
    private Long fzjhId;

    private String xh;

    private String kskm;

    private Date ksrq;

    private String ksdd;

    private String kcxh;

    private String kscx;

    private Integer kscc;

    private String kchp;

    private String ksy;

    private String ksxm;

    private String glbm;

    private String ksxl;

    private String jym;

    private static final long serialVersionUID = 1L;

    public Long getFzjhId() {
        return fzjhId;
    }

    public void setFzjhId(Long fzjhId) {
        this.fzjhId = fzjhId;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public Date getKsrq() {
        return ksrq;
    }

    public void setKsrq(Date ksrq) {
        this.ksrq = ksrq;
    }

    public String getKsdd() {
        return ksdd;
    }

    public void setKsdd(String ksdd) {
        this.ksdd = ksdd == null ? null : ksdd.trim();
    }

    public String getKcxh() {
        return kcxh;
    }

    public void setKcxh(String kcxh) {
        this.kcxh = kcxh == null ? null : kcxh.trim();
    }

    public String getKscx() {
        return kscx;
    }

    public void setKscx(String kscx) {
        this.kscx = kscx == null ? null : kscx.trim();
    }

    public Integer getKscc() {
        return kscc;
    }

    public void setKscc(Integer kscc) {
        this.kscc = kscc;
    }

    public String getKchp() {
        return kchp;
    }

    public void setKchp(String kchp) {
        this.kchp = kchp == null ? null : kchp.trim();
    }

    public String getKsy() {
        return ksy;
    }

    public void setKsy(String ksy) {
        this.ksy = ksy == null ? null : ksy.trim();
    }

    public String getKsxm() {
        return ksxm;
    }

    public void setKsxm(String ksxm) {
        this.ksxm = ksxm == null ? null : ksxm.trim();
    }

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm == null ? null : glbm.trim();
    }

    public String getKsxl() {
        return ksxl;
    }

    public void setKsxl(String ksxl) {
        this.ksxl = ksxl == null ? null : ksxl.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}