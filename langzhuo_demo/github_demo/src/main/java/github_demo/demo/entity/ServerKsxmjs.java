package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class ServerKsxmjs implements Serializable {
    private Long xmjsId;

    private Long fzmxId;

    private Integer kscs;

    private String lsh;

    private String sfzmhm;

    private String ksxm;

    private String sbxh;

    private Date jssj;

    private String sendzt;

    private String mess;

    private String jym;

    private static final long serialVersionUID = 1L;

    public Long getXmjsId() {
        return xmjsId;
    }

    public void setXmjsId(Long xmjsId) {
        this.xmjsId = xmjsId;
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

    public String getSbxh() {
        return sbxh;
    }

    public void setSbxh(String sbxh) {
        this.sbxh = sbxh == null ? null : sbxh.trim();
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