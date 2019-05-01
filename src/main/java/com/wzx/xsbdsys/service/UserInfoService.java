package com.wzx.xsbdsys.service;

import com.wzx.xsbdsys.model.dto.TbUserinfoDto;

import java.util.List;
import java.util.Map;

public interface UserInfoService {
    List<TbUserinfoDto> userList();
    Map<String,Object> stuUserListPage(int pageNum, int pageSize);
    Map<String,Object> userListPage(int pageNum, int pageSize);
    boolean addUserInfo(TbUserinfoDto userinfo);
    boolean updateUserInfo(TbUserinfoDto userinfoDto);
    boolean deleteUserInfoById(int id);
    List<TbUserinfoDto> searchUserByUsername(String username);
    String checkUser(String username, String userPwd,int au);
}
