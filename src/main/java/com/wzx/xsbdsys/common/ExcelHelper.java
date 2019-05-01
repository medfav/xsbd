package com.wzx.xsbdsys.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * Date:2013年1月30日11:39:36
 * Author:leilei
 */
//该类是一个工具类，实现的功能是对execl文件简单读和存的功能
public class ExcelHelper {
    /*该方法实现的功能是读，读的时候全部以String的方式存储，如果小数点后面为0的全部忽略，*/
    public static String[][] poiReader(String filepath,File file) throws Exception{

        String[][] result;
        InputStream is = null;
        if(!filepath.equals("")){
            //输入输出流
            is = new FileInputStream(filepath);
        }else if(file.exists()){
            is = new FileInputStream(file);
        }else{
            System.out.println("输入的路径并且文件为空");
        }

        //创建工作空间
        Workbook wb = WorkbookFactory.create(is);
        //获取工作表
        Sheet sheet = wb.getSheetAt(0);//获取第一个工作表
        //工作行
        Row row ;
        //工作单元格
        Cell cell = null ;
        int rownum;//行
        int columnnum;//列
        rownum=sheet.getLastRowNum()+1;
        columnnum=sheet.getRow(0).getLastCellNum();
        //实例化返回的数组对象
        result= new String[rownum][columnnum];

        System.out.println("rownum:"+rownum);
        System.out.println("columnnum:"+columnnum);
        for(int i=0;i<rownum;i++){
            row= sheet.getRow(i);
            //获取第i行的工作行的第6个单元格的值
            for(int j=0;j<columnnum;j++){
                cell=row.getCell(j);
                if(cell==null){
                    String str="";
                    result[i][j]=str;
                }else{
                    String str=cell.toString();
                    if(str.contains(".")){
                        String[] s=str.split("\\.");
                        if(Integer.parseInt(s[1])==0){
                            result[i][j]=s[0];
                        }else{
                            result[i][j]=str;
                        }
                    }else{
                        result[i][j]=str;
                    }
                }
            }
        }
        return result;
    }
    /*输入二维数组和文件存放的地址，该方法把数组中的内容（包括表头）存入execl文件，返回文件存放地址*/
    /*注：方法本身没有判断文件是否属于execl文件的功能,存的时候不附带任何格式。*/

    public static String poiWrite(String[][] str,String filepath){
        InputStream inp;
        ifexist(filepath);
        try {
            inp = new FileInputStream(filepath);
            int rownum=str.length;
            int columnum=str[0].length;

            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheetAt(0);
            for(int i=0;i<rownum;i++){
                //System.out.println("i:"+i);
                Row row = sheet.createRow(i);
                for(int j=0;j<columnum;j++){
                    /*System.out.println("j:"+j);                */
                    Cell cell=row.createCell(j);
                    //设置格式
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    //设置值
                    cell.setCellValue(str[i][j]);
                }
            }
            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream(filepath);
            wb.write(fileOut);
            fileOut.close();
            inp.close();
            System.out.println("写入完成");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return filepath;
    }
    /*传入文件的地址，判断文件是否存在，如果不存在的话创建该文件*/
    /*这个功能好像还存在一个小BUG，直接createNewFile();的文件不能用，以后找方法解决。*/

    public static void ifexist(String path){
        try {
            File file=new File(path);
            if(!file.exists()){
                System.out.println("文件不存在，创建该文件，文件地址为："+path);
                file.createNewFile();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
