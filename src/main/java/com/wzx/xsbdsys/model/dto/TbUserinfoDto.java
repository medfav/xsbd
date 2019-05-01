package com.wzx.xsbdsys.model.dto;

import lombok.Data;

@Data
public class TbUserinfoDto extends TbUserinfoKey {
    private Integer id;

    private String username;

    private String stuid;

    private String teacherid;

    private String userpwd;

    private Integer authority;

    private String userstyle;

    private String name;

    private String sex;

    private String registerstatic;


}