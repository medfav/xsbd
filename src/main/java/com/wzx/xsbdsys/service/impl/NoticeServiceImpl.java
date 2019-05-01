package com.wzx.xsbdsys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzx.xsbdsys.model.ato.TbNotice;
import com.wzx.xsbdsys.model.ato.TbNoticeExample;
import com.wzx.xsbdsys.model.dto.TbNoticeDto;
import com.wzx.xsbdsys.repository.ato.TbNoticeMapper;
import com.wzx.xsbdsys.service.NoticeService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private TbNoticeMapper noticeMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public List<TbNoticeDto> noticeList() {
        TbNoticeExample example = new TbNoticeExample();
        List<TbNotice> notices = noticeMapper.selectByExample(example);
        return mapperFacade.mapAsList(notices, TbNoticeDto.class);
    }

    public Map<String, Object> noticeListBolb(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbNoticeExample example = new TbNoticeExample();
        List<TbNotice> notices = noticeMapper.selectByExampleWithBLOBs(example);
        PageInfo pageInfo = new PageInfo(notices);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", mapperFacade.mapAsList(notices, TbNoticeDto.class));
        map.put("info", pageInfo);
        return map;
    }

    public boolean addNotice(TbNoticeDto noticeDto) {
        int row = noticeMapper.insertSelective(mapperFacade.map(noticeDto, TbNotice.class));
        return row > 0;
    }

    public boolean updateNotice(TbNoticeDto noticeDto) {
        int row = noticeMapper.updateByPrimaryKeyWithBLOBs(mapperFacade.map(noticeDto, TbNotice.class));
        return row > 0;
    }

    public boolean deleteNoticeById(int id) {
        TbNoticeExample example = new TbNoticeExample();
        TbNoticeExample.Criteria criteria = example.createCriteria();
        criteria.andNoticeidEqualTo(id);
        return noticeMapper.deleteByExample(example)>0;
    }

    public List<TbNoticeDto> searchNoticeById(int id) {
        TbNoticeExample example = new TbNoticeExample();
        TbNoticeExample.Criteria criteria = example.createCriteria();
        criteria.andNoticeidEqualTo(id);
        List<TbNotice> notices = noticeMapper.selectByExampleWithBLOBs(example);
        return mapperFacade.mapAsList(notices, TbNoticeDto.class);
    }
}
