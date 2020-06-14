package com.giservice.wmsdiscovery.mapper;

import com.giservice.wmsdiscovery.model.Wms;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WmsMapper {

    @Select("SELECT ID,URL,Country,Title,Request,Format,Version FROM wms WHERE Country=#{country}")
    List<Wms> queryWmsByCountry(String country);

    @Select("SELECT ID,URL,Country,Title,Request,Format,Version FROM wms WHERE Title like '%${title}%'")
    List<Wms> queryWmsByTitle(String title);

    @Select("SELECT uniqueId,contactperson,ContactOrganization,ContactPosition,Address,City,PostCode,Country,ContactVoiceTelephone,ContactElectronicMailAddress,URL FROM contactperson WHERE uniqueId=#{uniqueId}")
    Wms queryWmsByUniqueId(Integer uniqueId);

}
