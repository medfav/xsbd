package com.wzx.xsbdsys.controllers;

import com.wzx.xsbdsys.common.ExcelHelper;
import com.wzx.xsbdsys.common.ExportExcelUtil;
import com.wzx.xsbdsys.common.ExportExcelWrapper;
import com.wzx.xsbdsys.model.ato.TbStudentinfo;
import com.wzx.xsbdsys.model.dto.TbStudentinfoDto;
import com.wzx.xsbdsys.model.dto.TbTeacherinfoDto;
import com.wzx.xsbdsys.model.dto.TbUserinfoDto;
import com.wzx.xsbdsys.service.StuInfoService;
import com.wzx.xsbdsys.service.TeacherInfoService;
import com.wzx.xsbdsys.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/io")
public class IOExcelControl {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private StuInfoService stuInfoService;

    @Autowired
    private TeacherInfoService teacherInfoService;

    @RequestMapping("/export/excel/userinfo")
    public void exportUserinfoToExcel(HttpServletResponse response){
        List<TbUserinfoDto> userinfoDtos = userInfoService.userList();
        String[] columnNames = {"编号","用户名","学号","教师工号","用户密码","用户权限","用户类型","姓名","性别","报到状态"};
        String filename = "用户信息表";
        ExportExcelWrapper<TbUserinfoDto> excelWrapper = new ExportExcelWrapper<TbUserinfoDto>();
        excelWrapper.exportExcel(filename, filename, columnNames, userinfoDtos, response, ExportExcelUtil.EXCEL_FILE_2003);
    }

    @RequestMapping("/import/excel/userinfo")
    @ResponseBody
    public String importUserExcel(String filepath){
//        String filepath = "G:/upload/"+filename;
        File file = new File(filepath);
        String[][] reader;
        try {
            reader = ExcelHelper.poiReader(filepath, file);
        } catch (Exception e) {
            return "<script>alert('导入失败!');window.location.href='/web/model?au=0&model=2&item=5';</script>";
        }
        boolean status=false;
        int count = -1;
        TbUserinfoDto userinfoDto = new TbUserinfoDto();
        TbStudentinfoDto studentinfoDto = new TbStudentinfoDto();
        TbTeacherinfoDto teacherinfoDto = new TbTeacherinfoDto();
        for (String[] row:reader) {
            if(count==-1){
                count++;
                continue;
            }
            if (row[1].equals("")||row[1]==null){
                break;
            }
//            userinfoDto.setId(Integer.parseInt(row[0]));
            userinfoDto.setUsername(row[1]);
            userinfoDto.setStuid(row[2]);
            userinfoDto.setTeacherid(row[3]);
            userinfoDto.setUserpwd(row[4]);
            userinfoDto.setAuthority(Integer.parseInt(row[5]));
            userinfoDto.setUserstyle(row[6]);
            userinfoDto.setName(row[7]);
            userinfoDto.setSex(row[8]);
            userinfoDto.setRegisterstatic(row[9]);
            //学生信息
            studentinfoDto.setStuid(row[2]);
            studentinfoDto.setName(row[7]);
            studentinfoDto.setSex(row[8]);
            //教师信息
            teacherinfoDto.setTeacherid(row[3]);
            teacherinfoDto.setName(row[7]);
            teacherinfoDto.setSex(row[8]);

            status = userInfoService.addUserInfo(userinfoDto);
            if (status && !row[2].equals("")){
                status = stuInfoService.addStuInfo(studentinfoDto);
            }
            if (status && !row[3].equals("")){
                status = teacherInfoService.addUTeacherInfo(teacherinfoDto);
            }
            if(status){
                count++;
            }else {
                break;
            }
        }
        if (status){
            return "<script>alert('导入成功!共导入"+count+"行数据');window.location.href='/api/user/showlist';</script>";
        }else if (count==0){
            return "<script>alert('导入失败!');window.location.href='/web/model?au=0&model=2&item=5';</script>";
        }else {
            return "<script>alert('导入失败!成功导入"+count+"行数据');window.location.href='/web/model?au=0&model=2&item=5';</script>";
        }
    }


    @RequestMapping("/export/excel/stuinfo")
    public void exportStuinfoToExcel(HttpServletResponse response){
        List<TbStudentinfoDto> studentinfoDtos = stuInfoService.stuList();
        String[] columnNames = {"编号","学号","姓名","性别","出生年月","身份证号","民族","录取通知书编号","籍贯","家庭住址","原就读学校","联系电话","QQ账号","电子邮箱","家长姓名","家长电话","专业编号","班级编号","宿舍编号"};
        String filename = "学生信息表";
        ExportExcelWrapper<TbStudentinfoDto> excelWrapper = new ExportExcelWrapper<TbStudentinfoDto>();
        excelWrapper.exportExcel(filename, filename, columnNames, studentinfoDtos, response, ExportExcelUtil.EXCEL_FILE_2003);
    }

//    @RequestMapping("/import/excel/stuinfo")
//    @ResponseBody
//    public String importStuExcel(String filepath){
////        String filepath = "G:/upload/"+filename;
//        File file = new File(filepath);
//        String[][] reader;
//        try {
//            reader = ExcelHelper.poiReader(filepath, file);
//        } catch (Exception e) {
//            return "<script>alert('导入失败!');window.location.href='/web/model?au=0&model=2&item=5';</script>";
//        }
//        boolean status=false;
//        int count = -1;
//        TbUserinfoDto userinfoDto = new TbUserinfoDto();
//        TbStudentinfoDto studentinfoDto = new TbStudentinfoDto();
//
//        for (String[] row:reader) {
//            if(count==-1){
//                count++;
//                continue;
//            }
//            if (row[0].equals("")){
//                break;
//            }
//            userinfoDto.setId(Integer.parseInt(row[0]));
//            userinfoDto.setUsername(row[1]);
//            userinfoDto.setStuid(row[2]);
//            userinfoDto.setTeacherid(row[3]);
//            userinfoDto.setUserpwd(row[4]);
//            userinfoDto.setAuthority(Integer.parseInt(row[5]));
//            userinfoDto.setUserstyle(row[6]);
//            userinfoDto.setName(row[7]);
//            userinfoDto.setSex(row[8]);
//            userinfoDto.setRegisterstatic(row[9]);
//
//            studentinfoDto.setStuid(row[2]);
//            studentinfoDto.setName(row[7]);
//            studentinfoDto.setSex(row[8]);
//
//            status = userInfoService.addUserInfo(userinfoDto);
//            if (status){
//                status = stuInfoService.addStuInfo(studentinfoDto);
//            }
//            if(status){
//                count++;
//            }
//        }
//        if (status){
//            return "<script>alert('导入成功!共导入"+count+"行数据');window.location.href='/api/user/showlist';</script>";
//        }else {
//            return "<script>alert('导入失败!');window.location.href='/web/model?au=0&model=2&item=5';</script>";
//        }
//    }
}
