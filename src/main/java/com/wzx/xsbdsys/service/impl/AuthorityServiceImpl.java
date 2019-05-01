package com.wzx.xsbdsys.service.impl;

import com.wzx.xsbdsys.model.ato.TbAuthority;
import com.wzx.xsbdsys.model.ato.TbAuthorityExample;
import com.wzx.xsbdsys.model.dto.TbAuthorityDto;
import com.wzx.xsbdsys.repository.ato.TbAuthorityMapper;
import com.wzx.xsbdsys.service.AuthorityService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private MapperFacade mapperFacade;

    @Autowired
    private TbAuthorityMapper authorityMapper;

    public List<TbAuthorityDto> authorityList() {
        return null;
    }

    public boolean addAuthority(TbAuthorityDto authorityDto) {
        return false;
    }

    public boolean updateAuthority(TbAuthorityDto authorityDto) {
        return false;
    }

    public boolean deleteAuthorityById(int id) {
        return false;
    }

    public TbAuthorityDto searchAuthorityByAuthority(int au) {
        TbAuthorityExample example = new TbAuthorityExample();
        TbAuthorityExample.Criteria criteria = example.createCriteria();
        criteria.andAuthorityEqualTo(au);
        List<TbAuthority> authorities = authorityMapper.selectByExampleWithBLOBs(example);
        return mapperFacade.map(authorities.get(0), TbAuthorityDto.class);
    }

}
