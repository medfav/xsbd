package com.wzx.xsbdsys.controllers;

import com.wzx.xsbdsys.model.dto.*;
import com.wzx.xsbdsys.service.DepartmentService;
import com.wzx.xsbdsys.service.MajorService;
import com.wzx.xsbdsys.service.StuInfoService;
import com.wzx.xsbdsys.service.UserInfoService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/api/stu")
public class StuInfoController {

    @Autowired
    private StuInfoService stuInfoService;

    @Autowired
    private MajorService majorService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private MapperFacade mapperFacade;

    @RequestMapping("/moreinfo")
    public String getStuMoreInfo(HttpServletRequest request, Model model){
        if(request.getSession().getAttribute("username")==null){
            return "login/error";
        }
        String username = request.getSession().getAttribute("username").toString();
        TbUserinfoDto userinfoDto = userInfoService.searchUserByUsername(username).get(0);
        TbStudentinfoDto studentinfoDto = stuInfoService.searchStuByStuid(userinfoDto.getStuid()).get(0);
        TbMajorDto majorDto = majorService.majorListBymajorId(studentinfoDto.getMajorid()).get(0);
        model.addAttribute("user", userinfoDto);
        model.addAttribute("stu", studentinfoDto);
        model.addAttribute("maj", majorDto);
        if (request.getParameter("type").equals("show")) {
            return "home-xs/home1-2";
        } else {
            return "home-xs/home1-3";
        }
    }

//    @GetMapping("/showuserinfo")
//    public String showUserInfo(HttpServletRequest request, Model model){
//        String username = request.getSession().getAttribute("username").toString();
//        model.addAttribute("info", userInfoService.searchUserByUsername(username).get(0));
//        return "home/home1-1";
//    }

    @RequestMapping("/changeStu")
    @ResponseBody
    public String changeStuInfo(MoreStudentInfoDto moreStudentInfoDto){
        try {
            moreStudentInfoDto.setDateofbirth(new SimpleDateFormat("yyyy-MM-dd").parse(moreStudentInfoDto.getStringdateofbirth()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        TbUserinfoDto userinfoDto = mapperFacade.map(moreStudentInfoDto, TbUserinfoDto.class);
        TbStudentinfoDto studentinfoDto = mapperFacade.map(moreStudentInfoDto, TbStudentinfoDto.class);
        studentinfoDto.setId(null);
        boolean userStatus = userInfoService.updateUserInfo(userinfoDto);
        if (userStatus){
            boolean stuStatus = stuInfoService.updateStuInfo(studentinfoDto);
            if (stuStatus){
                return "<script>alert('修改信息成功！');window.location.href='/api/stu/moreinfo?type=show';</script>";
            }
        }
        return "<script>alert('修改信息失败！');window.location.href='/api/stu/moreinfo?type=change';</script>";
    }

}
