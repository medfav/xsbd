package com.wzx.xsbdsys.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TbStudentinfoDto {
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

}