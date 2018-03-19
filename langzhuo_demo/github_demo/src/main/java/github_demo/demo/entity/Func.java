package github_demo.demo.entity;

import java.io.Serializable;

public class Func implements Serializable {
    private String funcid;

    private String parentid;

    private Integer seq;

    private String title;

    private String objname;

    private String opentype;

    private String openparm;

    private String funType;

    private String coreFlag;

    private String zt;

    private String jym;

    private static final long serialVersionUID = 1L;

    public String getFuncid() {
        return funcid;
    }

    public void setFuncid(String funcid) {
        this.funcid = funcid == null ? null : funcid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getObjname() {
        return objname;
    }

    public void setObjname(String objname) {
        this.objname = objname == null ? null : objname.trim();
    }

    public String getOpentype() {
        return opentype;
    }

    public void setOpentype(String opentype) {
        this.opentype = opentype == null ? null : opentype.trim();
    }

    public String getOpenparm() {
        return openparm;
    }

    public void setOpenparm(String openparm) {
        this.openparm = openparm == null ? null : openparm.trim();
    }

    public String getFunType() {
        return funType;
    }

    public void setFunType(String funType) {
        this.funType = funType == null ? null : funType.trim();
    }

    public String getCoreFlag() {
        return coreFlag;
    }

    public void setCoreFlag(String coreFlag) {
        this.coreFlag = coreFlag == null ? null : coreFlag.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}