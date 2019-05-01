package com.wzx.xsbdsys.model.ato;

import java.util.Date;

public class TbNotice {
    private Integer noticeid;

    private String noticetitle;

    private String userid;

    private Date createdata;

    private Date changedate;

    private String noticetext;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle == null ? null : noticetitle.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getCreatedata() {
        return createdata;
    }

    public void setCreatedata(Date createdata) {
        this.createdata = createdata;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }

    public String getNoticetext() {
        return noticetext;
    }

    public void setNoticetext(String noticetext) {
        this.noticetext = noticetext == null ? null : noticetext.trim();
    }
}