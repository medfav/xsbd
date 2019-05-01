package com.wzx.xsbdsys.repository.ato;

import com.wzx.xsbdsys.model.ato.TbMajor;
import com.wzx.xsbdsys.model.ato.TbMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMajorMapper {
    long countByExample(TbMajorExample example);

    int deleteByExample(TbMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMajor record);

    int insertSelective(TbMajor record);

    List<TbMajor> selectByExample(TbMajorExample example);

    TbMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMajor record, @Param("example") TbMajorExample example);

    int updateByExample(@Param("record") TbMajor record, @Param("example") TbMajorExample example);

    int updateByPrimaryKeySelective(TbMajor record);

    int updateByPrimaryKey(TbMajor record);
}