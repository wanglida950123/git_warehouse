package github_demo.demo.entity;

import java.io.Serializable;

public class Pbcatvld implements Serializable {
    private String pbvName;

    private String pbvVald;

    private Short pbvType;

    private Integer pbvCntr;

    private String pbvMsg;

    private static final long serialVersionUID = 1L;

    public String getPbvName() {
        return pbvName;
    }

    public void setPbvName(String pbvName) {
        this.pbvName = pbvName == null ? null : pbvName.trim();
    }

    public String getPbvVald() {
        return pbvVald;
    }

    public void setPbvVald(String pbvVald) {
        this.pbvVald = pbvVald == null ? null : pbvVald.trim();
    }

    public Short getPbvType() {
        return pbvType;
    }

    public void setPbvType(Short pbvType) {
        this.pbvType = pbvType;
    }

    public Integer getPbvCntr() {
        return pbvCntr;
    }

    public void setPbvCntr(Integer pbvCntr) {
        this.pbvCntr = pbvCntr;
    }

    public String getPbvMsg() {
        return pbvMsg;
    }

    public void setPbvMsg(String pbvMsg) {
        this.pbvMsg = pbvMsg == null ? null : pbvMsg.trim();
    }
}