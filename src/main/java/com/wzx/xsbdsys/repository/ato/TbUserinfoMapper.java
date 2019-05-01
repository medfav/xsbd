package com.wzx.xsbdsys.repository.ato;

import com.wzx.xsbdsys.model.ato.TbUserinfo;
import com.wzx.xsbdsys.model.ato.TbUserinfoExample;
import com.wzx.xsbdsys.model.ato.TbUserinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserinfoMapper {
    long countByExample(TbUserinfoExample example);

    int deleteByExample(TbUserinfoExample example);

    int deleteByPrimaryKey(TbUserinfoKey key);

    int insert(TbUserinfo record);

    int insertSelective(TbUserinfo record);

    List<TbUserinfo> selectByExample(TbUserinfoExample example);

    TbUserinfo selectByPrimaryKey(TbUserinfoKey key);

    int updateByExampleSelective(@Param("record") TbUserinfo record, @Param("example") TbUserinfoExample example);

    int updateByExample(@Param("record") TbUserinfo record, @Param("example") TbUserinfoExample example);

    int updateByPrimaryKeySelective(TbUserinfo record);

    int updateByPrimaryKey(TbUserinfo record);
}