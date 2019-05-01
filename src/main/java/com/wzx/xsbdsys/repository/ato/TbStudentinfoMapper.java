package com.wzx.xsbdsys.repository.ato;

import com.wzx.xsbdsys.model.ato.TbStudentinfo;
import com.wzx.xsbdsys.model.ato.TbStudentinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentinfoMapper {
    long countByExample(TbStudentinfoExample example);

    int deleteByExample(TbStudentinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbStudentinfo record);

    int insertSelective(TbStudentinfo record);

    List<TbStudentinfo> selectByExample(TbStudentinfoExample example);

    TbStudentinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbStudentinfo record, @Param("example") TbStudentinfoExample example);

    int updateByExample(@Param("record") TbStudentinfo record, @Param("example") TbStudentinfoExample example);

    int updateByPrimaryKeySelective(TbStudentinfo record);

    int updateByPrimaryKey(TbStudentinfo record);
}