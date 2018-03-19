package github_demo.demo.entity;

import java.io.Serializable;

public class Pbcatfmt implements Serializable {
    private String pbfName;

    private String pbfFrmt;

    private Short pbfType;

    private Integer pbfCntr;

    private static final long serialVersionUID = 1L;

    public String getPbfName() {
        return pbfName;
    }

    public void setPbfName(String pbfName) {
        this.pbfName = pbfName == null ? null : pbfName.trim();
    }

    public String getPbfFrmt() {
        return pbfFrmt;
    }

    public void setPbfFrmt(String pbfFrmt) {
        this.pbfFrmt = pbfFrmt == null ? null : pbfFrmt.trim();
    }

    public Short getPbfType() {
        return pbfType;
    }

    public void setPbfType(Short pbfType) {
        this.pbfType = pbfType;
    }

    public Integer getPbfCntr() {
        return pbfCntr;
    }

    public void setPbfCntr(Integer pbfCntr) {
        this.pbfCntr = pbfCntr;
    }
}