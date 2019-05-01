package com.wzx.xsbdsys.controllers;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("/web")
public class WebController {

    @RequestMapping("/login")
    public String index(HttpServletRequest request){
        String resultPage;
        try {
            switch (Integer.parseInt(request.getParameter("page"))){
                case 0:return "forward:/notice/list";
                case 1:resultPage="login/index-link";break;
                case 2:resultPage="login/index-login";break;
                case 3:resultPage="/notice/list";break;
                default:return "forward:/notice/list";
            }
        }catch (Exception e){
            return "forward:/notice/list";
        }
        return resultPage;
    }

    @RequestMapping("/model")
    public String sysPage(HttpServletRequest request){
        String resultPage="";
        try {
            String au = request.getParameter("au");
            String model = request.getParameter("model");
            String item = request.getParameter("item");
            if(au.equals("0")){
                resultPage+="home";
            }else if(au.equals("1")){
                resultPage+="home-js";
            }else{
                resultPage+="home-xs";
            }
            resultPage+="/home"+model+"-"+item;
        }catch (Exception e){
            resultPage="home-xs/home1-1";
        }
        return resultPage;
    }

    @RequestMapping("home/model-1/item-1")
    public String mgrerPage_1(HttpServletRequest request,String username){
        request.getSession().setAttribute("username", username);
        return "forward:/api/user/userlogin";
    }

    @RequestMapping("/upload/excel")
    @ResponseBody
    public String uploadExcel(@RequestParam("file") MultipartFile file){
        if (file.isEmpty()){
            return "<script>alert('上传失败，请选择文件!')</script>";
        }
        String fileName = file.getOriginalFilename();
        String filePath = "G:/upload/";
        File dest = new File(filePath+"upload.xls");
        try {
            file.transferTo(dest);
            return "<script>alert('上传成功!');window.location.href='/io/import/excel/userinfo?filepath="+filePath+"upload.xls';</script>";
        }catch (Exception e){
            return "<script>alert('上传失败!');window.location.href='/web/model?au=0&model=2&item=5';</script>";
        }
    }

    @RequestMapping("/logout")
    public String userLogout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:/web/login?page=2";
    }

    @RequestMapping("/checklogin")
    @ResponseBody
    public boolean checkLogin(HttpServletRequest request){
        if (request.getSession().getAttribute("userstatus")==null){
            return false;
        }else if(request.getSession().getAttribute("userstatus")!="login"){
            return false;
        }else {
            return true;
        }
    }
}
