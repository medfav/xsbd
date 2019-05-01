package com.wzx.xsbdsys.service;

import com.wzx.xsbdsys.model.dto.TbNoticeDto;

import java.util.List;
import java.util.Map;

public interface NoticeService {
    List<TbNoticeDto> noticeList();
    Map<String,Object> noticeListBolb(int pageNum, int pageSize);
    boolean addNotice(TbNoticeDto noticeDto);
    boolean updateNotice(TbNoticeDto noticeDto);
    boolean deleteNoticeById(int id);
    List<TbNoticeDto> searchNoticeById(int id);
}
