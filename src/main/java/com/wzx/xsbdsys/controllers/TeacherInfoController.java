package com.wzx.xsbdsys.controllers;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzx.xsbdsys.model.ato.TbTeacherinfo;
import com.wzx.xsbdsys.model.ato.TbUserinfo;
import com.wzx.xsbdsys.model.dto.*;
import com.wzx.xsbdsys.service.*;
import javafx.beans.property.IntegerProperty;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/teacher")
public class TeacherInfoController {

    @Autowired
    private TeacherInfoService teacherInfoService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private  StuInfoService stuInfoService;

    @Autowired
    private MajorService majorService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private MapperFacade mapperFacade;

    @RequestMapping("/moreinfo")
    public String moreInfo(HttpServletRequest request, Model model){
        if(request.getSession().getAttribute("username")==null){
            return "login/error";
        }
        TbUserinfoDto userinfoDto = (TbUserinfoDto)request.getSession().getAttribute("model");
        TbTeacherinfoDto teacherinfoDto = teacherInfoService.searchTeacherByTeacherId(userinfoDto.getTeacherid()).get(0);
        TbMajorDto majorDto = majorService.majorListBymajorId(teacherinfoDto.getMajorid()).get(0);
        TbDepartmentDto departmentDto = departmentService.departmentListById(majorDto.getDepartmentid()).get(0);
        model.addAttribute("user", userinfoDto);
        model.addAttribute("teacher", teacherinfoDto);
        model.addAttribute("maj", majorDto);
        model.addAttribute("dep", departmentDto);
        if(request.getParameter("type").equals("show")) {
            return "home-js/home1-2";
        }else {
            List<TbMajorDto> majorDtos = majorService.majorList();
            model.addAttribute("majlist", majorDtos);
            return "home-js/home1-3";
        }
    }

    @RequestMapping("/changeteacher")
    @ResponseBody
    public String changeStuInfo(MoreTeacherInfoDto moreTeacherInfoDto){
        TbUserinfoDto userinfoDto = mapperFacade.map(moreTeacherInfoDto, TbUserinfoDto.class);
        TbTeacherinfoDto teacherinfoDto = mapperFacade.map(moreTeacherInfoDto, TbTeacherinfoDto.class);
        teacherinfoDto.setId(null);
        boolean userStatus = userInfoService.updateUserInfo(userinfoDto);
        if (userStatus){
            boolean stuStatus = teacherInfoService.updateTeacherInfo(teacherinfoDto);
            if (stuStatus){
                return "<script>alert('修改信息成功！');window.location.href='/api/teacher/moreinfo?type=show';</script>";
            }
        }
        return "<script>alert('修改信息失败！');window.location.href='/api/teacher/moreinfo?type=change';</script>";
    }


    @RequestMapping("/stulist")
    public String showStuList(HttpServletRequest request, Model model){
        String pageNum = request.getParameter("pageNum");
        String pageSize = request.getParameter("pageSize");
        if (pageNum == null){
            pageNum = "1";
        }
        if (pageSize == null){
            pageSize = "5";
        }
        Map<String, Object> map = userInfoService.stuUserListPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        model.addAttribute("stulist", map.get("list"));
        model.addAttribute("pageinfo", map.get("info"));
        return "home-js/home2-1";
    }

    @RequestMapping("/searchstu")
    public String searchUser(String username,Model model){
        PageHelper.startPage(1, 5);
        List<TbUserinfoDto> userinfoDtos = userInfoService.searchUserByUsername(username);
        PageInfo pageInfo = new PageInfo(userinfoDtos);
        try {
            if (userinfoDtos.get(0).getAuthority() != 2) {
                userinfoDtos.clear();
            }
        }catch (Exception e){}
        model.addAttribute("stulist", userinfoDtos);
        model.addAttribute("pageinfo", pageInfo);
        return "home-js/home2-1";
    }

    @RequestMapping("/addstu")
    @ResponseBody
    public String addStuUser(MoreStudentInfoDto moreStudentInfoDto){
        boolean userStatus = userInfoService.addUserInfo(mapperFacade.map(moreStudentInfoDto, TbUserinfoDto.class));
        if (userStatus) {
            boolean stuStatus = stuInfoService.addStuInfo(mapperFacade.map(moreStudentInfoDto, TbStudentinfoDto.class));
            if (userStatus){
                return "<script>alert('添加用户信息成功！');window.location.href='/api/teacher/stulist';</script>";
            }
        }
        return "<script>alert('添加用户信息成功！');window.location.href='/web/model?au=1&model=2&item=2';</script>";
    }

    @RequestMapping("/delstu")
    @ResponseBody
    public String deleteStu(int id,String stuid){
            boolean userStatus = userInfoService.deleteUserInfoById(id);
            if (userStatus){
                boolean stuStatus = stuInfoService.deleteStuInfoById(stuid);
                if (stuStatus){
                    return "<script>alert('删除学生信息成功！');window.location.href='/api/teacher/stulist';</script>";
                }
            }
        return "<script>alert('删除学生信息失败！');window.location.href='/web/model?au=1&model=2&item=4';</script>";
    }
}
