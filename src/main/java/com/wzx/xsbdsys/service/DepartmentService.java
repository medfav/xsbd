package com.wzx.xsbdsys.service;

import com.wzx.xsbdsys.model.dto.TbDepartmentDto;

import java.util.List;

public interface DepartmentService {
    List<TbDepartmentDto> departmentList();
    List<TbDepartmentDto> departmentListById(String departmentId);
    boolean addDepartment(TbDepartmentDto departmentDto);
    boolean updateDepartment(TbDepartmentDto departmentDto);
    boolean deleteDepartmentById(int id);
    List<TbDepartmentDto> searchDepartmentById(int id);
}
