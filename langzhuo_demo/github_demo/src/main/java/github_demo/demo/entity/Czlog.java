package github_demo.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Czlog implements Serializable {
    private Long id;

    private String uid;

    private String cName;

    private Date rqsj;

    private String cAct;

    private String cSql;

    private String cIp;

    private String cKtbs;

    private String cJg;

    private String cSm;

    private String cDatauser;

    private String cTable;

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

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Date getRqsj() {
        return rqsj;
    }

    public void setRqsj(Date rqsj) {
        this.rqsj = rqsj;
    }

    public String getcAct() {
        return cAct;
    }

    public void setcAct(String cAct) {
        this.cAct = cAct == null ? null : cAct.trim();
    }

    public String getcSql() {
        return cSql;
    }

    public void setcSql(String cSql) {
        this.cSql = cSql == null ? null : cSql.trim();
    }

    public String getcIp() {
        return cIp;
    }

    public void setcIp(String cIp) {
        this.cIp = cIp == null ? null : cIp.trim();
    }

    public String getcKtbs() {
        return cKtbs;
    }

    public void setcKtbs(String cKtbs) {
        this.cKtbs = cKtbs == null ? null : cKtbs.trim();
    }

    public String getcJg() {
        return cJg;
    }

    public void setcJg(String cJg) {
        this.cJg = cJg == null ? null : cJg.trim();
    }

    public String getcSm() {
        return cSm;
    }

    public void setcSm(String cSm) {
        this.cSm = cSm == null ? null : cSm.trim();
    }

    public String getcDatauser() {
        return cDatauser;
    }

    public void setcDatauser(String cDatauser) {
        this.cDatauser = cDatauser == null ? null : cDatauser.trim();
    }

    public String getcTable() {
        return cTable;
    }

    public void setcTable(String cTable) {
        this.cTable = cTable == null ? null : cTable.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}