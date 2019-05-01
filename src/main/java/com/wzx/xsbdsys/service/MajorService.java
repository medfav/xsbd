package com.wzx.xsbdsys.service;

import com.wzx.xsbdsys.model.dto.TbMajorDto;

import java.util.List;

public interface MajorService {
    List<TbMajorDto> majorList();
    List<TbMajorDto> majorListBymajorId(String majorId);
    boolean addMajor(TbMajorDto majorDto);
    boolean updateMajor(TbMajorDto majorDto);
    boolean deleteMajorById(int id);
    List<TbMajorDto> searchMajorByName(String name);
}
