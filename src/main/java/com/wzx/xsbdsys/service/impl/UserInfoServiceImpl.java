package com.wzx.xsbdsys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.javafx.collections.MappingChange;
import com.wzx.xsbdsys.model.ato.TbUserinfo;
import com.wzx.xsbdsys.model.ato.TbUserinfoExample;
import com.wzx.xsbdsys.model.dto.TbTeacherinfoDto;
import com.wzx.xsbdsys.model.dto.TbUserinfoDto;
import com.wzx.xsbdsys.repository.ato.TbUserinfoMapper;
import com.wzx.xsbdsys.service.UserInfoService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private MapperFacade mapperFacade;

    @Autowired
    private TbUserinfoMapper userinfoMapper;

    public List<TbUserinfoDto> userList() {
        TbUserinfoExample example = new TbUserinfoExample();
        return mapperFacade.mapAsList(userinfoMapper.selectByExample(example), TbUserinfoDto.class);
    }

    public Map<String,Object> stuUserListPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbUserinfoExample example = new TbUserinfoExample();
        TbUserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andAuthorityEqualTo(2);
        List<TbUserinfo> userinfos = userinfoMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(userinfos);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("list", mapperFacade.mapAsList(userinfos, TbUserinfoDto.class));
        map.put("info", pageInfo);
        return map;
    }

    public Map<String,Object> userListPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbUserinfoExample example = new TbUserinfoExample();
        List<TbUserinfo> userinfos = userinfoMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(userinfos);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("list", mapperFacade.mapAsList(userinfos, TbUserinfoDto.class));
        map.put("info", pageInfo);
        return map;
    }

    public boolean addUserInfo(TbUserinfoDto userinfoDto) {
        return userinfoMapper.insertSelective(mapperFacade.map(userinfoDto, TbUserinfo.class)) > 0;
    }

    public boolean updateUserInfo(TbUserinfoDto userinfoDto) {
        TbUserinfoExample example = new TbUserinfoExample();
        TbUserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(userinfoDto.getId());
        return userinfoMapper.updateByExampleSelective(mapperFacade.map(userinfoDto, TbUserinfo.class), example) > 0;
    }

    public boolean deleteUserInfoById(int id) {
        TbUserinfoExample example = new TbUserinfoExample();
        TbUserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        return userinfoMapper.deleteByExample(example) > 0;
    }

    public List<TbUserinfoDto> searchUserByUsername(String username) {
        TbUserinfoExample example = new TbUserinfoExample();
        TbUserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        return mapperFacade.mapAsList(userinfoMapper.selectByExample(example), TbUserinfoDto.class);
    }

    public String checkUser(String username, String userpwd,int au) {
        TbUserinfoExample example = new TbUserinfoExample();
        TbUserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<TbUserinfo> users = userinfoMapper.selectByExample(example);
        if (users.size()>0){
            TbUserinfo user = users.get(0);
            if (user.getAuthority()==au && user.getUserpwd().equals(userpwd)){
                return "true";
            }else {
                return "error";
            }
        }else {
            return "nouser";
        }
    }
}
