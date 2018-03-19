package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class ServerKskf implements Serializable {
    private Long kskfId;

    private Long fzmxId;

    private Integer kscs;

    private String lsh;

    private String sfzmhm;

    private String ksxm;

    private String kfxm;

    private Date kfsj;

    private String kflx;

    private String ms;

    private String sendzt;

    private String mess;

    private String jym;

    private static final long serialVersionUID = 1L;

    public Long getKskfId() {
        return kskfId;
    }

    public void setKskfId(Long kskfId) {
        this.kskfId = kskfId;
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

    public String getKsxm() {
        return ksxm;
    }

    public void setKsxm(String ksxm) {
        this.ksxm = ksxm == null ? null : ksxm.trim();
    }

    public String getKfxm() {
        return kfxm;
    }

    public void setKfxm(String kfxm) {
        this.kfxm = kfxm == null ? null : kfxm.trim();
    }

    public Date getKfsj() {
        return kfsj;
    }

    public void setKfsj(Date kfsj) {
        this.kfsj = kfsj;
    }

    public String getKflx() {
        return kflx;
    }

    public void setKflx(String kflx) {
        this.kflx = kflx == null ? null : kflx.trim();
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms == null ? null : ms.trim();
    }

    public String getSendzt() {
        return sendzt;
    }

    public void setSendzt(String sendzt) {
        this.sendzt = sendzt == null ? null : sendzt.trim();
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