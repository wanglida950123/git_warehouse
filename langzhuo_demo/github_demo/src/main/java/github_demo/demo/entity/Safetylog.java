package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Safetylog implements Serializable {
    private Long id;

    private String uid;

    private Date czsj;

    private String ly;

    private String xw;

    private String jg;

    private String nr;

    private String ip;

    private String jym;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Date getCzsj() {
        return czsj;
    }

    public void setCzsj(Date czsj) {
        this.czsj = czsj;
    }

    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly == null ? null : ly.trim();
    }

    public String getXw() {
        return xw;
    }

    public void setXw(String xw) {
        this.xw = xw == null ? null : xw.trim();
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg == null ? null : jg.trim();
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr == null ? null : nr.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}