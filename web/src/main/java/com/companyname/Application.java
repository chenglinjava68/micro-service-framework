package com.companyname;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 应用入口
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = "com.companyname.*")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
