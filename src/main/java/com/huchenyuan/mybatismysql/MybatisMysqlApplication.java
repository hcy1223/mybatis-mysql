package com.huchenyuan.mybatismysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huchenyuan.mybatismysql.mappers")
public class MybatisMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisMysqlApplication.class, args);
    }

}
