package com.hand.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Stewart
 * @create 2022/1/10
 * @Description
 */
@SpringBootApplication
@MapperScan("com.hand.web.dao")
public class HandicraftApplication {
    public static void main(String[] args) {
        SpringApplication.run(HandicraftApplication.class,args);
    }
}
