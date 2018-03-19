package github_demo.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ServerKsgctp implements Serializable {
    private Long gczpId;

    private Long fzmxId;

    private Integer kscs;

    private String lsh;

    private String sfzmhm;

    private String ksxm;

    private BigDecimal cs;

    private Date zpsj;

    private String sendzt;

    private String mess;

    private Integer printflag;

    private String jym;

    private String zp;

    private static final long serialVersionUID = 1L;

    public Long getGczpId() {
        return gczpId;
    }

    public void setGczpId(Long gczpId) {
        this.gczpId = gczpId;
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

    public BigDecimal getCs() {
        return cs;
    }

    public void setCs(BigDecimal cs) {
        this.cs = cs;
    }

    public Date getZpsj() {
        return zpsj;
    }

    public void setZpsj(Date zpsj) {
        this.zpsj = zpsj;
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

    public Integer getPrintflag() {
        return printflag;
    }

    public void setPrintflag(Integer printflag) {
        this.printflag = printflag;
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