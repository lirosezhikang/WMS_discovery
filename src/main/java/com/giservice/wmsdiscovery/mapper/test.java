package com.giservice.wmsdiscovery.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface test {

    @Select("select age from test where name = '李志康'")
    int test();
}
