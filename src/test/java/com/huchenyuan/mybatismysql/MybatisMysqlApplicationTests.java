package com.huchenyuan.mybatismysql;

import com.huchenyuan.mybatismysql.entity.MybatisMysql;
import com.huchenyuan.mybatismysql.mappers.MyBatisMysqlMapper;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.time.Instant;

@SpringBootTest
class MybatisMysqlApplicationTests {

    @Autowired
    MyBatisMysqlMapper myBatisMysqlMapper;

    @Test void contextLoads() {

        Instant now = toInstant("2020-02-20T08:45:34.100Z");
        MybatisMysql mybatisMysql = new MybatisMysql(1, "name1", now);
        myBatisMysqlMapper.insert(mybatisMysql);
    }

    private static Instant toInstant(Long time) {
        return Instant.ofEpochMilli(time);
    }

    private static Instant toInstant(String time) {
        return toInstant(new DateTime(time).getMillis());
    }

    private static Long stringToLong(String time) {
        return new DateTime(time).getMillis();
    }

