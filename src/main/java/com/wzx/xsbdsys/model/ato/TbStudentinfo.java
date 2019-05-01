package com.wzx.xsbdsys.model.ato;

import java.util.Date;

public class TbStudentinfo {
    private Integer id;

    private String stuid;

    private String name;

    private String sex;

    private Date dateofbirth;

    private String idcard;

    private String nation;

    private String enrollmentnumber;

    private String nativeplace;

    private String address;

    private String formerschool;

    private String tel;

    private String qq;

    private String email;

    private String parentname;

    private String parenttel;

    private String majorid;

    private String classid;

    private String dormitoryid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
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

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getEnrollmentnumber() {
        return enrollmentnumber;
    }

    public void setEnrollmentnumber(String enrollmentnumber) {
        this.enrollmentnumber = enrollmentnumber == null ? null : enrollmentnumber.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFormerschool() {
        return formerschool;
    }

    public void setFormerschool(String formerschool) {
        this.formerschool = formerschool == null ? null : formerschool.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getParenttel() {
        return parenttel;
    }

    public void setParenttel(String parenttel) {
        this.parenttel = parenttel == null ? null : parenttel.trim();
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getDormitoryid() {
        return dormitoryid;
    }

    public void setDormitoryid(String dormitoryid) {
        this.dormitoryid = dormitoryid == null ? null : dormitoryid.trim();
    }
}