package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class ServerSfxxdb implements Serializable {
    private Long sfxxdbId;

    private Long fzmxId;

    private Integer kscs;

    private String lsh;

    private String kskm;

    private String sfzmhm;

    private String ksysfzmhm;

    private Date kssj;

    private String sendzt;

    private String ksxtbh;

    private String mess;

    private String jym;

    private String zp;

    private static final long serialVersionUID = 1L;

    public Long getSfxxdbId() {
        return sfxxdbId;
    }

    public void setSfxxdbId(Long sfxxdbId) {
        this.sfxxdbId = sfxxdbId;
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

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm == null ? null : sfzmhm.trim();
    }

    public String getKsysfzmhm() {
        return ksysfzmhm;
    }

    public void setKsysfzmhm(String ksysfzmhm) {
        this.ksysfzmhm = ksysfzmhm == null ? null : ksysfzmhm.trim();
    }

    public Date getKssj() {
        return kssj;
    }

    public void setKssj(Date kssj) {
        this.kssj = kssj;
    }

    public String getSendzt() {
        return sendzt;
    }

    public void setSendzt(String sendzt) {
        this.sendzt = sendzt == null ? null : sendzt.trim();
    }

    public String getKsxtbh() {
        return ksxtbh;
    }

    public void setKsxtbh(String ksxtbh) {
        this.ksxtbh = ksxtbh == null ? null : ksxtbh.trim();
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