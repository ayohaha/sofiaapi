package com.example.sofiaapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.sofiaapi")
public class SofiaapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofiaapiApplication.class, args);
    }

}
