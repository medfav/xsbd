package com.wzx.xsbdsys.model.ato;

public class TbAuthority {
    private Integer id;

    private Integer authority;

    private String authorityjson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public String getAuthorityjson() {
        return authorityjson;
    }

    public void setAuthorityjson(String authorityjson) {
        this.authorityjson = authorityjson == null ? null : authorityjson.trim();
    }
}