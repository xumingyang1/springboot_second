package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jk.*"})
@MapperScan("com.jk.mapper")

public class SpringbootSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecondApplication.class, args);
    }

}
