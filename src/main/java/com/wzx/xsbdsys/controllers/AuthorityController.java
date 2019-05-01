package com.wzx.xsbdsys.controllers;

import com.wzx.xsbdsys.model.dto.TbAuthorityDto;
import com.wzx.xsbdsys.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/au")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @RequestMapping("get")
    public String searchAuthority(int au){
        TbAuthorityDto authorityDto = authorityService.searchAuthorityByAuthority(au);
        return authorityDto.getAuthorityjson();
    }
}
