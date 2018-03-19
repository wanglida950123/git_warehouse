package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String uid;

    private String xm;

    private String sfzmhm;

    private String mm;

    private String yhbh;

    private String lx;

    private String ip;

    private Date dlsjks;

    private Date dlsjjs;

    private Date mmyxsjks;

    private Date mmyxsjjs;

    private Integer mmsbcs;

    private Date zhjsks;

    private Date zhjsjs;

    private Date sdsjks;

    private Date sdsjjs;

    private String zt;

    private String tcqx;

    private String roleId;

    private String passflag;

    private String jym;

    private static final long serialVersionUID = 1L;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm == null ? null : sfzmhm.trim();
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm == null ? null : mm.trim();
    }

    public String getYhbh() {
        return yhbh;
    }

    public void setYhbh(String yhbh) {
        this.yhbh = yhbh == null ? null : yhbh.trim();
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx == null ? null : lx.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getDlsjks() {
        return dlsjks;
    }

    public void setDlsjks(Date dlsjks) {
        this.dlsjks = dlsjks;
    }

    public Date getDlsjjs() {
        return dlsjjs;
    }

    public void setDlsjjs(Date dlsjjs) {
        this.dlsjjs = dlsjjs;
    }

    public Date getMmyxsjks() {
        return mmyxsjks;
    }

    public void setMmyxsjks(Date mmyxsjks) {
        this.mmyxsjks = mmyxsjks;
    }

    public Date getMmyxsjjs() {
        return mmyxsjjs;
    }

    public void setMmyxsjjs(Date mmyxsjjs) {
        this.mmyxsjjs = mmyxsjjs;
    }

    public Integer getMmsbcs() {
        return mmsbcs;
    }

    public void setMmsbcs(Integer mmsbcs) {
        this.mmsbcs = mmsbcs;
    }

    public Date getZhjsks() {
        return zhjsks;
    }

    public void setZhjsks(Date zhjsks) {
        this.zhjsks = zhjsks;
    }

    public Date getZhjsjs() {
        return zhjsjs;
    }

    public void setZhjsjs(Date zhjsjs) {
        this.zhjsjs = zhjsjs;
    }

    public Date getSdsjks() {
        return sdsjks;
    }

    public void setSdsjks(Date sdsjks) {
        this.sdsjks = sdsjks;
    }

    public Date getSdsjjs() {
        return sdsjjs;
    }

    public void setSdsjjs(Date sdsjjs) {
        this.sdsjjs = sdsjjs;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getTcqx() {
        return tcqx;
    }

    public void setTcqx(String tcqx) {
        this.tcqx = tcqx == null ? null : tcqx.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getPassflag() {
        return passflag;
    }

    public void setPassflag(String passflag) {
        this.passflag = passflag == null ? null : passflag.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}