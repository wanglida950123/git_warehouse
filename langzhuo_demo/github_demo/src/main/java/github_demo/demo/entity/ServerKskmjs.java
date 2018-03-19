package github_demo.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ServerKskmjs implements Serializable {
    private Long kmjsId;

    private Long fzmxId;

    private Integer kscs;

    private String lsh;

    private String sfzmhm;

    private Date jssj;

    private String sendzt;

    private BigDecimal kscj;

    private String mess;

    private String jym;

    private String zp;

    private static final long serialVersionUID = 1L;

    public Long getKmjsId() {
        return kmjsId;
    }

    public void setKmjsId(Long kmjsId) {
        this.kmjsId = kmjsId;
    }

    public Long getFzmxId() {
        return fzmxId;
    }

    public void setFzmxId(Long fzmxId) {
        this.fzmxId = fzmxId;
    }

    public Integer getKscs() {
        return kscs;
    }

    public void setKscs(Integer kscs) {
        this.kscs = kscs;
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

    public Date getJssj() {
        return jssj;
    }

    public void setJssj(Date jssj) {
        this.jssj = jssj;
    }

    public String getSendzt() {
        return sendzt;
    }

    public void setSendzt(String sendzt) {
        this.sendzt = sendzt == null ? null : sendzt.trim();
    }

    public BigDecimal getKscj() {
        return kscj;
    }

    public void setKscj(BigDecimal kscj) {
        this.kscj = kscj;
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

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp == null ? null : zp.trim();
    }
}