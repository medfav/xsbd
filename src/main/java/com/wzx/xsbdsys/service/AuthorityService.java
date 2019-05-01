package com.wzx.xsbdsys.service;

import com.wzx.xsbdsys.model.dto.TbAuthorityDto;

import java.util.List;

public interface AuthorityService {
    List<TbAuthorityDto> authorityList();
    boolean addAuthority(TbAuthorityDto authorityDto);
    boolean updateAuthority(TbAuthorityDto authorityDto);
    boolean deleteAuthorityById(int id);
    TbAuthorityDto searchAuthorityByAuthority(int id);
}
