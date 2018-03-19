package github_demo.demo.entity;

import java.io.Serializable;

public class Pbcatedt implements Serializable {
    private String pbeName;

    private String pbeEdit;

    private Short pbeType;

    private Integer pbeCntr;

    private Short pbeSeqn;

    private Integer pbeFlag;

    private String pbeWork;

    private static final long serialVersionUID = 1L;

    public String getPbeName() {
        return pbeName;
    }

    public void setPbeName(String pbeName) {
        this.pbeName = pbeName == null ? null : pbeName.trim();
    }

    public String getPbeEdit() {
        return pbeEdit;
    }

    public void setPbeEdit(String pbeEdit) {
        this.pbeEdit = pbeEdit == null ? null : pbeEdit.trim();
    }

    public Short getPbeType() {
        return pbeType;
    }

    public void setPbeType(Short pbeType) {
        this.pbeType = pbeType;
    }

    public Integer getPbeCntr() {
        return pbeCntr;
    }

    public void setPbeCntr(Integer pbeCntr) {
        this.pbeCntr = pbeCntr;
    }

    public Short getPbeSeqn() {
        return pbeSeqn;
    }

    public void setPbeSeqn(Short pbeSeqn) {
        this.pbeSeqn = pbeSeqn;
    }

    public Integer getPbeFlag() {
        return pbeFlag;
    }

    public void setPbeFlag(Integer pbeFlag) {
        this.pbeFlag = pbeFlag;
    }

    public String getPbeWork() {
        return pbeWork;
    }

    public void setPbeWork(String pbeWork) {
        this.pbeWork = pbeWork == null ? null : pbeWork.trim();
    }
}