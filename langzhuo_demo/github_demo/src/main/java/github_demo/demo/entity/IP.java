package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class IP implements Serializable {
    private String id;

    private Integer ipsbcs;

    private Integer ipmax;

    private Date sdsjks;

    private Date sdsjjs;

    private String jym;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getIpsbcs() {
        return ipsbcs;
    }

    public void setIpsbcs(Integer ipsbcs) {
        this.ipsbcs = ipsbcs;
    }

    public Integer getIpmax() {
        return ipmax;
    }

    public void setIpmax(Integer ipmax) {
        this.ipmax = ipmax;
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

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}