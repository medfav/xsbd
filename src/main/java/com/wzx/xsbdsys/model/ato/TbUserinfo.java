package com.wzx.xsbdsys.model.ato;

public class TbUserinfo extends TbUserinfoKey {
    private String stuid;

    private String teacherid;

    private String userpwd;

    private Integer authority;

    private String userstyle;

    private String name;

    private String sex;

    private String registerstatic;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public String getUserstyle() {
        return userstyle;
    }

    public void setUserstyle(String userstyle) {
        this.userstyle = userstyle == null ? null : userstyle.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getRegisterstatic() {
        return registerstatic;
    }

    public void setRegisterstatic(String registerstatic) {
        this.registerstatic = registerstatic == null ? null : registerstatic.trim();
    }
}