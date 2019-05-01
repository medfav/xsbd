package com.wzx.xsbdsys.controllers;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;
import com.wzx.xsbdsys.model.dto.TbStudentinfoDto;
import com.wzx.xsbdsys.model.dto.TbTeacherinfoDto;
import com.wzx.xsbdsys.model.dto.TbUserinfoDto;
import com.wzx.xsbdsys.service.NoticeService;
import com.wzx.xsbdsys.service.StuInfoService;
import com.wzx.xsbdsys.service.TeacherInfoService;
import com.wzx.xsbdsys.service.UserInfoService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
@RequestMapping("/api/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private TeacherInfoService teacherInfoService;

    @Autowired
    private StuInfoService stuInfoService;

    @Autowired
    private MapperFacade mapperFacade;

    @PostMapping("/add")
    @ResponseBody
    public String addUser(TbUserinfoDto userinfoDto){
        boolean status = userInfoService.addUserInfo(userinfoDto);
        if(status && userinfoDto.getTeacherid()!=null){
            if(!userinfoDto.getTeacherid().equals("")) {
                status = teacherInfoService.addUTeacherInfo(mapperFacade.map(userinfoDto, TbTeacherinfoDto.class));
            }
        }
        if(status && userinfoDto.getStuid()!=null){
            if (!userinfoDto.getStuid().equals("")){
                status = stuInfoService.addStuInfo(mapperFacade.map(userinfoDto, TbStudentinfoDto.class));
            }
        }
        if (status){
            return "<script>alert('添加用户成功！');window.location.href='/api/user/showlist';</script>";
        }else {
            return "<script>alert('添加用户失败！')；window.location.href='/web/model?au=0&model=2&item=2';</script>";
        }
    }

    @GetMapping("/list")
    @ResponseBody
    public List<TbUserinfoDto> getUserList(){
        return userInfoService.userList();
    }

    @RequestMapping("/showlist")
    public String showList(HttpServletRequest request,Model model){
        String pageNum = request.getParameter("pageNum");
        String pageSize = request.getParameter("pageSize");
        if (pageNum == null){
            pageNum = "1";
        }
        if (pageSize == null){
            pageSize = "5";
        }
        Map<String, Object> map = userInfoService.userListPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        model.addAttribute("list", map.get("list"));
        model.addAttribute("info", map.get("info"));
        return "home/home2-1";
    }

    @RequestMapping("/search")
    public String searchUser(String username,Model model){
        PageHelper.startPage(1, 5);
        List<TbUserinfoDto> userinfoDtos = userInfoService.searchUserByUsername(username);
        PageInfo pageInfo = new PageInfo(userinfoDtos);
        model.addAttribute("list", userinfoDtos);
        model.addAttribute("info", pageInfo);
        return "home/home2-1";
    }

    @PostMapping("/update")
    @ResponseBody
    public boolean updateUserInfo(TbUserinfoDto userinfoDto){
        return userInfoService.updateUserInfo(userinfoDto);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public boolean deleteUserInfo(int id){
        return userInfoService.deleteUserInfoById(id);
    }

    @GetMapping("/searchuser")
    @ResponseBody
    public TbUserinfoDto searchUserByUsername(String username){
        return userInfoService.searchUserByUsername(username).get(0);
    }

    @GetMapping("/selectbyau")
    @ResponseBody
    public TbUserinfoDto searchUserByAu(String username,String userstyle){
        TbUserinfoDto userinfoDto = userInfoService.searchUserByUsername(username).get(0);
        if (userinfoDto.getUserstyle().equals(userstyle)){
            return userinfoDto;
        }else {
            return null;
        }
    }

    @GetMapping("/getuserinfo")
    public String searchUserReternObjByUsername(String username, Model model){
        model.addAttribute("info", userInfoService.searchUserByUsername(username).get(0));
        return "home/home1-1";
    }

    @RequestMapping("/checkuser")
    @ResponseBody
    public String checkUser(String username, String userpwd, int au){
        return userInfoService.checkUser(username, userpwd, au);
    }

    @RequestMapping("/xsbd-system")
    public String loadPage(HttpServletRequest request, Model model){
        if(request.getSession().getAttribute("username")==null){
            return "login/error";
        }
        String username = request.getSession().getAttribute("username").toString();
        TbUserinfoDto userinfoDto = userInfoService.searchUserByUsername(username).get(0);
        model.addAttribute("info", userinfoDto);
        String selectPage="";
        if (userinfoDto.getAuthority()==0){
            selectPage="home";
        }else if (userinfoDto.getAuthority()==1){
            selectPage="home-js";
        }else {
            selectPage="home-xs";
        }
//        if (request.getParameter("style").equals("login")) {
            return selectPage + "/frame";
//        }else {
//            return "home/home1-1";
//        }
    }

    @RequestMapping("/userlogin")
    public String userLogin(HttpServletRequest request, String username, String userpwd,int au){
        String status = userInfoService.checkUser(username, userpwd, au);
        if (status.equals("true")){
            TbUserinfoDto userinfoDto = userInfoService.searchUserByUsername(username).get(0);
            request.getSession().setAttribute("username", username);
            request.getSession().setAttribute("userstatus", "login");
            request.getSession().setAttribute("model", userinfoDto);
        }
        return "redirect:/api/user/xsbd-system";
    }

    @GetMapping("/showuserinfo")
    public String showUserInfo(HttpServletRequest request, Model model){
        if(request.getSession().getAttribute("username")==null){
            return "login/error";
        }
        String username = request.getSession().getAttribute("username").toString();
        TbUserinfoDto userinfoDto = (TbUserinfoDto)request.getSession().getAttribute("model");
        model.addAttribute("info", userInfoService.searchUserByUsername(username).get(0));
        if (userinfoDto.getAuthority().equals("0")) {
            return "home/home1-1";
        }else if (userinfoDto.getAuthority().equals("1")){
            return "home-js/home1-1";
        }else {
            return "home-xs/home1-1";
        }
    }

    @RequestMapping("/changeuser")
    @ResponseBody
    public String updateUser(HttpServletRequest request, TbUserinfoDto userinfoDto){
        boolean status = userInfoService.updateUserInfo(userinfoDto);
        if (status && userinfoDto.getTeacherid()!=null){
            if (!userinfoDto.getTeacherid().equals("")){
                TbTeacherinfoDto teacherinfoDto = mapperFacade.map(userinfoDto, TbTeacherinfoDto.class);
                teacherinfoDto.setId(null);
                status = teacherInfoService.updateTeacherInfo(teacherinfoDto);
            }
        }
        if (status && userinfoDto.getStuid()!=null){
            if(!userinfoDto.getStuid().equals("")) {
                TbStudentinfoDto studentinfoDto = mapperFacade.map(userinfoDto, TbStudentinfoDto.class);
                studentinfoDto.setId(null);
                status = stuInfoService.updateStuInfo(studentinfoDto);
            }
        }
        if (request.getParameter("user").equals("teacher")){
            if (status) {
                return "<script>alert('修改用户信息成功！');window.location.href='/api/teacher/stulist';</script>";
            } else {
                return "<script>alert('修改用户信息失败！');window.location.href='/web/model?au=1&model=2&item=3';</script>";
            }
        }else {
            if (status) {
                return "<script>alert('修改用户信息成功！');window.location.href='/api/user/showlist';</script>";
            } else {
                return "<script>alert('修改用户信息失败！');window.location.href='/web/model?au=0&model=2&item=3';</script>";
            }
        }
    }

    @RequestMapping("/changeinfo")
    @ResponseBody
    public String updateSelfInfo(TbUserinfoDto userinfoDto){
        boolean status = userInfoService.updateUserInfo(userinfoDto);
        if (status){
            return "<script>alert('修改用户信息成功！');window.location.href='/api/user/moreinfo';</script>";
        }else {
            return "<script>alert('修改用户信息失败！');window.location.href='/web/model?au=0&model=1&item=3';</script>";
        }
    }

    @RequestMapping("/stureg")
    @ResponseBody
    public String updateStufRegInfo(HttpServletRequest request){
        if(request.getSession().getAttribute("model")==null){
            return "<script>parent.location.href='/web/login?page=2';</script>";
        }
        TbUserinfoDto model = (TbUserinfoDto) request.getSession().getAttribute("model");
        String username = request.getParameter("username");
        if(model.getUsername().equals(username)){
            model.setRegisterstatic("已报到");
            boolean status = userInfoService.updateUserInfo(model);
            return String.valueOf(status);
        }else {
            return "false";
        }
    }

    @RequestMapping("/deleteuser")
    @ResponseBody
    public String deleteUser(int id){
        boolean status = userInfoService.deleteUserInfoById(id);
        if (status){
            return "<script>alert('删除用户信息成功！');window.location.href='/api/user/showlist';</script>";
        }else {
            return "<script>alert('删除用户信息失败！');window.location.href='/web/model?au=0&model=2&item=4';</script>";
        }
    }

    @RequestMapping("/moreinfo")
    public String showMoreInfo(HttpServletRequest request, Model model){
        if(request.getSession().getAttribute("username")==null){
            return "login/error";
        }
        String username = request.getSession().getAttribute("username").toString();
        List<TbUserinfoDto> userinfoDtos = userInfoService.searchUserByUsername(username);
        model.addAttribute("info", userinfoDtos.get(0));
        return "home/home1-2";
    }

    @RequestMapping("/changepwd")
    @ResponseBody
    public String changeUserPwd(HttpServletRequest request){
        if(request.getSession().getAttribute("username")==null){
            return "<script>parent.location.href='/web/login?page=2';</script>";
        }
        String username = request.getSession().getAttribute("username").toString();
        TbUserinfoDto userinfoDto = (TbUserinfoDto)request.getSession().getAttribute("model");
        String statusStr = userInfoService.checkUser(userinfoDto.getUsername(), request.getParameter("oldpwd"), userinfoDto.getAuthority());
        if (statusStr.equals("true")){
            userinfoDto.setUserpwd(request.getParameter("newpwd"));
            boolean status = userInfoService.updateUserInfo(userinfoDto);
            if (status){
                return "<script>alert('修改密码成功，你需要重新登录！');parent.location.href='/web/login?page=2'</script>";
            }else {
                return "<script>alert('修改密码失败！');window.location.href='/web/model?au=0&model=1&item=4';</script>";
            }
        }else {
            return "<script>alert('原始密码错误！');window.location.href='/web/model?au=0&model=1&item=4';</script>";
        }
    }
}
