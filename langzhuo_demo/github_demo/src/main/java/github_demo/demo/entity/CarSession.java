package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class CarSession implements Serializable {
    private String kcxh;

    private String ip;

    private Date czsj;

    private String fwqsy;

    private String fwqgy;

    private String khdgy;

    private String desys;

    private String jmbs;

    private static final long serialVersionUID = 1L;

    public String getKcxh() {
        return kcxh;
    }

    public void setKcxh(String kcxh) {
        this.kcxh = kcxh == null ? null : kcxh.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getCzsj() {
        return czsj;
    }

    public void setCzsj(Date czsj) {
        this.czsj = czsj;
    }

    public String getFwqsy() {
        return fwqsy;
    }

    public void setFwqsy(String fwqsy) {
        this.fwqsy = fwqsy == null ? null : fwqsy.trim();
    }

    public String getFwqgy() {
        return fwqgy;
    }

    public void setFwqgy(String fwqgy) {
        this.fwqgy = fwqgy == null ? null : fwqgy.trim();
    }

    public String getKhdgy() {
        return khdgy;
    }

    public void setKhdgy(String khdgy) {
        this.khdgy = khdgy == null ? null : khdgy.trim();
    }

    public String getDesys() {
        return desys;
    }

    public void setDesys(String desys) {
        this.desys = desys == null ? null : desys.trim();
    }

    public String getJmbs() {
        return jmbs;
    }

    public void setJmbs(String jmbs) {
        this.jmbs = jmbs == null ? null : jmbs.trim();
    }
}