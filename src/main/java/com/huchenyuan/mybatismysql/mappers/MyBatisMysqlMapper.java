package com.huchenyuan.mybatismysql.mappers;

import com.huchenyuan.mybatismysql.entity.MybatisMysql;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MyBatisMysqlMapper {

    void insert(@Param("mybatisMysql") MybatisMysql mybatisMysql);
}
