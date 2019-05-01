package com.wzx.xsbdsys.service.impl;

import com.wzx.xsbdsys.model.ato.TbStudentinfo;
import com.wzx.xsbdsys.model.ato.TbStudentinfoExample;
import com.wzx.xsbdsys.model.dto.TbStudentinfoDto;
import com.wzx.xsbdsys.repository.ato.TbStudentinfoMapper;
import com.wzx.xsbdsys.service.StuInfoService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuInfoServiceImpl implements StuInfoService {

    @Autowired
    private TbStudentinfoMapper studentinfoMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public List<TbStudentinfoDto> stuList() {
        TbStudentinfoExample example = new TbStudentinfoExample();
        return mapperFacade.mapAsList(studentinfoMapper.selectByExample(example), TbStudentinfoDto.class);
    }

    public boolean addStuInfo(TbStudentinfoDto studentinfoDto) {
        return studentinfoMapper.insertSelective(mapperFacade.map(studentinfoDto, TbStudentinfo.class))>0;
    }

    public boolean updateStuInfo(TbStudentinfoDto studentinfoDto) {
        TbStudentinfoExample example = new TbStudentinfoExample();
        TbStudentinfoExample.Criteria criteria = example.createCriteria();
        criteria.andStuidEqualTo(studentinfoDto.getStuid());
        int row = studentinfoMapper.updateByExampleSelective(mapperFacade.map(studentinfoDto, TbStudentinfo.class), example);
        return row > 0;
    }

    public boolean deleteStuInfoById(String stuid) {
        TbStudentinfoExample example = new TbStudentinfoExample();
        TbStudentinfoExample.Criteria criteria = example.createCriteria();
        criteria.andStuidEqualTo(stuid);
        return studentinfoMapper.deleteByExample(example)>0;
    }

    public List<TbStudentinfoDto> searchStuByStuid(String stuid) {
        TbStudentinfoExample example = new TbStudentinfoExample();
        TbStudentinfoExample.Criteria criteria = example.createCriteria();
        criteria.andStuidEqualTo(stuid);
        List<TbStudentinfoDto> studentinfoDtos = mapperFacade.mapAsList(studentinfoMapper.selectByExample(example), TbStudentinfoDto.class);
        return studentinfoDtos;
    }
}
