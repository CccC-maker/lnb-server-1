package com.example.lnb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.lnb.mapper")  //指定要扫描的mapper的位置
@SpringBootApplication

public class LnbApplication {

    public static void main(String[] args) {
        SpringApplication.run(LnbApplication.class, args);
    }

}
