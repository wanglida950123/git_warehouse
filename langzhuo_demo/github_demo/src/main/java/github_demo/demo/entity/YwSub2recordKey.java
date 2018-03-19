package github_demo.demo.entity;

import java.io.Serializable;

public class YwSub2recordKey implements Serializable {
    private Long fzmxid;

    private Integer kscs;

    private static final long serialVersionUID = 1L;

    public Long getFzmxid() {
        return fzmxid;
    }

    public void setFzmxid(Long fzmxid) {
        this.fzmxid = fzmxid;
    }

    public Integer getKscs() {
        return kscs;
    }

    public void setKscs(Integer kscs) {
        this.kscs = kscs;
    }
}