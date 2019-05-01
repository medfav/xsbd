package com.wzx.xsbdsys.service.impl;

import com.wzx.xsbdsys.model.ato.TbTeacherinfo;
import com.wzx.xsbdsys.model.ato.TbTeacherinfoExample;
import com.wzx.xsbdsys.model.dto.TbTeacherinfoDto;
import com.wzx.xsbdsys.repository.ato.TbTeacherinfoMapper;
import com.wzx.xsbdsys.service.TeacherInfoService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherInfoServiceImpl implements TeacherInfoService {

    @Autowired
    private TbTeacherinfoMapper teacherinfoMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public List<TbTeacherinfoDto> teacherList() {
        return null;
    }

    public boolean addUTeacherInfo(TbTeacherinfoDto teacherinfoDto) {
        return false;
    }

    public boolean updateTeacherInfo(TbTeacherinfoDto teacherinfoDto) {
        TbTeacherinfo teacherinfo = mapperFacade.map(teacherinfoDto, TbTeacherinfo.class);
        TbTeacherinfoExample example = new TbTeacherinfoExample();
        TbTeacherinfoExample.Criteria criteria = example.createCriteria();
        criteria.andTeacheridEqualTo(teacherinfoDto.getTeacherid());
        return teacherinfoMapper.updateByExampleSelective(teacherinfo, example)>0;
    }

    public boolean deleteTeacherInfoById(int id) {
        return false;
    }

    public List<TbTeacherinfoDto> searchTeacherByTeacherId(String teacherid) {
        TbTeacherinfoExample example = new TbTeacherinfoExample();
        TbTeacherinfoExample.Criteria criteria = example.createCriteria();
        criteria.andTeacheridEqualTo(teacherid);
        List<TbTeacherinfo> teacherinfos = teacherinfoMapper.selectByExample(example);
        return mapperFacade.mapAsList(teacherinfos, TbTeacherinfoDto.class);
    }
}
