package com.wzx.xsbdsys.service.impl;

import com.wzx.xsbdsys.model.ato.TbDepartment;
import com.wzx.xsbdsys.model.ato.TbDepartmentExample;
import com.wzx.xsbdsys.model.dto.TbDepartmentDto;
import com.wzx.xsbdsys.repository.ato.TbDepartmentMapper;
import com.wzx.xsbdsys.service.DepartmentService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private TbDepartmentMapper departmentMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public List<TbDepartmentDto> departmentList() {
        return null;
    }

    public List<TbDepartmentDto> departmentListById(String departmentId) {
        TbDepartmentExample example = new TbDepartmentExample();
        TbDepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andDepartmentidEqualTo(departmentId);
        List<TbDepartment> departments = departmentMapper.selectByExample(example);
        return mapperFacade.mapAsList(departments, TbDepartmentDto.class);
    }

    public boolean addDepartment(TbDepartmentDto departmentDto) {
        return false;
    }

    public boolean updateDepartment(TbDepartmentDto departmentDto) {
        return false;
    }

    public boolean deleteDepartmentById(int id) {
        return false;
    }

    public List<TbDepartmentDto> searchDepartmentById(int id) {
        return null;
    }
}
