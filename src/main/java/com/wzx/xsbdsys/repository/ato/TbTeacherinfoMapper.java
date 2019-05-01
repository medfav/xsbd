package com.wzx.xsbdsys.repository.ato;

import com.wzx.xsbdsys.model.ato.TbTeacherinfo;
import com.wzx.xsbdsys.model.ato.TbTeacherinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTeacherinfoMapper {
    long countByExample(TbTeacherinfoExample example);

    int deleteByExample(TbTeacherinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTeacherinfo record);

    int insertSelective(TbTeacherinfo record);

    List<TbTeacherinfo> selectByExample(TbTeacherinfoExample example);

    TbTeacherinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTeacherinfo record, @Param("example") TbTeacherinfoExample example);

    int updateByExample(@Param("record") TbTeacherinfo record, @Param("example") TbTeacherinfoExample example);

    int updateByPrimaryKeySelective(TbTeacherinfo record);

    int updateByPrimaryKey(TbTeacherinfo record);
}