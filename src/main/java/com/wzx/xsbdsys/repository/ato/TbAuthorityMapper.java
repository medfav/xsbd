package com.wzx.xsbdsys.repository.ato;

import com.wzx.xsbdsys.model.ato.TbAuthority;
import com.wzx.xsbdsys.model.ato.TbAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAuthorityMapper {
    long countByExample(TbAuthorityExample example);

    int deleteByExample(TbAuthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAuthority record);

    int insertSelective(TbAuthority record);

    List<TbAuthority> selectByExampleWithBLOBs(TbAuthorityExample example);

    List<TbAuthority> selectByExample(TbAuthorityExample example);

    TbAuthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAuthority record, @Param("example") TbAuthorityExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAuthority record, @Param("example") TbAuthorityExample example);

    int updateByExample(@Param("record") TbAuthority record, @Param("example") TbAuthorityExample example);

    int updateByPrimaryKeySelective(TbAuthority record);

    int updateByPrimaryKeyWithBLOBs(TbAuthority record);

    int updateByPrimaryKey(TbAuthority record);
}