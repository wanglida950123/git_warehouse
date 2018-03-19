package github_demo.demo.entity;

import java.io.Serializable;

public class DownKfdm implements Serializable {
    private String kfdm;

    private String kfxm;

    private Integer kfz;

    private String sm;

    private String jym;

    private static final long serialVersionUID = 1L;

    public String getKfdm() {
        return kfdm;
    }

    public void setKfdm(String kfdm) {
        this.kfdm = kfdm == null ? null : kfdm.trim();
    }

    public String getKfxm() {
        return kfxm;
    }

    public void setKfxm(String kfxm) {
        this.kfxm = kfxm == null ? null : kfxm.trim();
    }

    public Integer getKfz() {
        return kfz;
    }

    public void setKfz(Integer kfz) {
        this.kfz = kfz;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm == null ? null : sm.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}