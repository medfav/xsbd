package com.wzx.xsbdsys.service.impl;

import com.wzx.xsbdsys.model.ato.TbMajor;
import com.wzx.xsbdsys.model.ato.TbMajorExample;
import com.wzx.xsbdsys.model.dto.TbMajorDto;
import com.wzx.xsbdsys.repository.ato.TbMajorMapper;
import com.wzx.xsbdsys.service.MajorService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private TbMajorMapper majorMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public List<TbMajorDto> majorList() {
        TbMajorExample example = new TbMajorExample();
        List<TbMajor> majors = majorMapper.selectByExample(example);
        return mapperFacade.mapAsList(majors, TbMajorDto.class);
    }

    public List<TbMajorDto> majorListBymajorId(String majorId) {
        TbMajorExample example = new TbMajorExample();
        TbMajorExample.Criteria criteria = example.createCriteria();
        criteria.andMajoridEqualTo(majorId);
        List<TbMajor> majors = majorMapper.selectByExample(example);
        return mapperFacade.mapAsList(majors, TbMajorDto.class);
    }

    public boolean addMajor(TbMajorDto majorDto) {
        return false;
    }

    public boolean updateMajor(TbMajorDto majorDto) {
        return false;
    }

    public boolean deleteMajorById(int id) {
        return false;
    }

    public List<TbMajorDto> searchMajorByName(String name) {
        return null;
    }
}
