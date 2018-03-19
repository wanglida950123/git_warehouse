package github_demo.demo.entity;

import java.io.Serializable;

public class Role implements Serializable {
    private String roleId;

    private String roleName;

    private String roleMs;

    private String roleType;

    private String jym;

    private static final long serialVersionUID = 1L;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleMs() {
        return roleMs;
    }

    public void setRoleMs(String roleMs) {
        this.roleMs = roleMs == null ? null : roleMs.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }
}