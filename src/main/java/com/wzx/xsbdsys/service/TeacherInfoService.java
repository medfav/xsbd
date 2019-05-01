package com.wzx.xsbdsys.service;

import com.wzx.xsbdsys.model.dto.TbTeacherinfoDto;

import java.util.List;

public interface TeacherInfoService {
    List<TbTeacherinfoDto> teacherList();
    boolean addUTeacherInfo(TbTeacherinfoDto teacherinfoDto);
    boolean updateTeacherInfo(TbTeacherinfoDto teacherinfoDto);
    boolean deleteTeacherInfoById(int id);
    List<TbTeacherinfoDto> searchTeacherByTeacherId(String teacherid);
}
