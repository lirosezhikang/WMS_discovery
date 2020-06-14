package com.giservice.wmsdiscovery.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MatterMapper {

    @Insert("INSERT INTO matter(title,url,description,email) VALUES(#{title},#{url},#{description},#{email})")
    void addMatter(String title,String url,String description,String email);
}
