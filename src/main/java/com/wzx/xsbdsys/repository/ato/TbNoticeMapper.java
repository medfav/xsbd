package com.wzx.xsbdsys.repository.ato;

import com.wzx.xsbdsys.model.ato.TbNotice;
import com.wzx.xsbdsys.model.ato.TbNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoticeMapper {
    long countByExample(TbNoticeExample example);

    int deleteByExample(TbNoticeExample example);

    int deleteByPrimaryKey(Integer noticeid);

    int insert(TbNotice record);

    int insertSelective(TbNotice record);

    List<TbNotice> selectByExampleWithBLOBs(TbNoticeExample example);

    List<TbNotice> selectByExample(TbNoticeExample example);

    TbNotice selectByPrimaryKey(Integer noticeid);

    int updateByExampleSelective(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByExample(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByPrimaryKeySelective(TbNotice record);

    int updateByPrimaryKeyWithBLOBs(TbNotice record);

    int updateByPrimaryKey(TbNotice record);
}