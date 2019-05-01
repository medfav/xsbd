package com.wzx.xsbdsys.repository.ato;

import com.wzx.xsbdsys.model.ato.TbDepartment;
import com.wzx.xsbdsys.model.ato.TbDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDepartmentMapper {
    long countByExample(TbDepartmentExample example);

    int deleteByExample(TbDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDepartment record);

    int insertSelective(TbDepartment record);

    List<TbDepartment> selectByExample(TbDepartmentExample example);

    TbDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDepartment record, @Param("example") TbDepartmentExample example);

    int updateByExample(@Param("record") TbDepartment record, @Param("example") TbDepartmentExample example);

    int updateByPrimaryKeySelective(TbDepartment record);

    int updateByPrimaryKey(TbDepartment record);
}