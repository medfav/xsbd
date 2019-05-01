package com.wzx.xsbdsys.service;

import com.wzx.xsbdsys.model.dto.TbStudentinfoDto;

import java.util.List;

public interface StuInfoService {
    List<TbStudentinfoDto> stuList();
    boolean addStuInfo(TbStudentinfoDto studentinfoDto);
    boolean updateStuInfo(TbStudentinfoDto studentinfoDto);
    boolean deleteStuInfoById(String stuid);
    List<TbStudentinfoDto> searchStuByStuid(String stuid);
}
