package com.wzx.xsbdsys.controllers;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzx.xsbdsys.model.dto.TbNoticeDto;
import com.wzx.xsbdsys.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/list")
    public String list(Model model){
        List<TbNoticeDto> noticeDtos = noticeService.noticeList();
        model.addAttribute("list",noticeDtos);
        return "login/index";
    }

    @RequestMapping("/text")
    public String getNotice(int id,Model model){
        List<TbNoticeDto> noticeDtos = noticeService.searchNoticeById(id);
        model.addAttribute("select", noticeDtos.get(0));
        noticeDtos = noticeService.noticeList();
        model.addAttribute("list", noticeDtos);
        return "login/notice";
    }

    @RequestMapping("/showlist")
    public String showList(HttpServletRequest request, Model model){
        String pageNum = request.getParameter("pageNum");
        String pageSize = request.getParameter("pageSize");
        if (pageNum==null) {
            pageNum = "1";
        }
        if (pageSize==null) {
            pageSize = "5";
        }
        Map<String,Object> map = noticeService.noticeListBolb(Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        model.addAttribute("list", map.get("list"));
        model.addAttribute("info", map.get("info"));
        return "home/home3-1";
    }

    @RequestMapping("/search")
    public String searchById(String id,Model model){
        PageHelper.startPage(1, 5);
        List<TbNoticeDto> noticeDtos = noticeService.searchNoticeById(Integer.parseInt(id));
        PageInfo pageInfo = new PageInfo(noticeDtos);
        model.addAttribute("list", noticeDtos);
        model.addAttribute("info", pageInfo);
        return "home/home3-1";
    }

    @RequestMapping("/change")
    @ResponseBody
    public TbNoticeDto changeById(String id, Model model){
        List<TbNoticeDto> noticeDtos = noticeService.searchNoticeById(Integer.parseInt(id));
//        model.addAttribute("model", noticeDtos.get(0));
        return noticeDtos.get(0);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(TbNoticeDto noticeDto){
        Date date = new Date();
        noticeDto.setCreatedata(date);
        noticeDto.setChangedate(date);
        if (noticeService.addNotice(noticeDto)) {
            return "<script>alert('发布公告成功！');window.location.href='/notice/showlist';</script>";
        }else {
            return "<script>alert('发布公告失败！')；window.location.href='/web/model?au=0&model=3&item=2';</script>";
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(TbNoticeDto noticeDto) {
        noticeDto.setChangedate(new Date());
        boolean status = noticeService.updateNotice(noticeDto);
        if (status){
            return "<script>alert('修改公告成功！');window.location.href='/notice/showlist';</script>";
        }else {
            return "<script>alert('修改公告失败！')；window.location.href='/web/model?au=0&model=3&item=3';</script>";
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(int id){
        boolean status = noticeService.deleteNoticeById(id);
        if (status){
            return "<script>alert('删除公告成功！');window.location.href='/notice/showlist';</script>";
        }else {
            return "<script>alert('删除公告失败！')；window.location.href='/web/model?au=0&model=3&item=3';</script>";
        }
    }
}
