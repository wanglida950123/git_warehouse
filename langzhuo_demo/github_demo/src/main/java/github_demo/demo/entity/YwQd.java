package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class YwQd implements Serializable {
    private Long id;

    private Date qdrq;

    private Long fzmxId;

    private String sfzmhm;

    private String kskm;

    private String kcxh;

    private Short kscc;

    private String qdxm;

    private String zt;

    private String mess;

    private String jym;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getQdrq() {
        return qdrq;
    }

    public void setQdrq(Date qdrq) {
        this.qdrq = qdrq;
    }

    public Long getFzmxId() {
        return fzmxId;
    }

    public void setFzmxId(Long fzmxId) {
        this.fzmxId = fzmxId;
    }

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm == null ? null : sfzmhm.trim();
    }

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public String getKcxh() {
        return kcxh;
    }

    public void setKcxh(String kcxh) {
        this.kcxh = kcxh == null ? null : kcxh.trim();
    }

    public Short getKscc() {
        return kscc;
    }

    public void setKscc(Short kscc) {
        this.kscc = kscc;
    }

    public String getQdxm() {
        return qdxm;
    }

    public void setQdxm(String qdxm) {
        this.qdxm = qdxm == null ? null : qdxm.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess == null ? null : mess.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}