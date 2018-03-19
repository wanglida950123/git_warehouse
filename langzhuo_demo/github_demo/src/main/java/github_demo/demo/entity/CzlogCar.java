package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class CzlogCar implements Serializable {
    private Long id;

    private String clxh;

    private Date rqsj;

    private String cName;

    private String cAct;

    private Long fzmxId;

    private Integer kscs;

    private String lsh;

    private String sfzmhm;

    private String ksxm;

    private String mess;

    private String cIp;

    private String cSql;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClxh() {
        return clxh;
    }

    public void setClxh(String clxh) {
        this.clxh = clxh == null ? null : clxh.trim();
    }

    public Date getRqsj() {
        return rqsj;
    }

    public void setRqsj(Date rqsj) {
        this.rqsj = rqsj;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcAct() {
        return cAct;
    }

    public void setcAct(String cAct) {
        this.cAct = cAct == null ? null : cAct.trim();
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

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess == null ? null : mess.trim();
    }

    public String getcIp() {
        return cIp;
    }

    public void setcIp(String cIp) {
        this.cIp = cIp == null ? null : cIp.trim();
    }

    public String getcSql() {
        return cSql;
    }

    public void setcSql(String cSql) {
        this.cSql = cSql == null ? null : cSql.trim();
    }
}