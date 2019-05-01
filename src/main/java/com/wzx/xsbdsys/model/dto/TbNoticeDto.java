package com.wzx.xsbdsys.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TbNoticeDto {
    private Integer noticeid;

    private String noticetitle;

    private String userid;

    private Date createdata;

    private Date changedate;

    private String noticetext;

}