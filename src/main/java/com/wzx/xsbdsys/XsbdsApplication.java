package com.wzx.xsbdsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzx.xsbdsys.repository")
public class XsbdsApplication {

    public static void main(String[] args){
        SpringApplication.run(XsbdsApplication.class,args);
    }
}
