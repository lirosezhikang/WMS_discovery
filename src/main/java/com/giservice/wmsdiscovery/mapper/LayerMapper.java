package com.giservice.wmsdiscovery.mapper;

import com.giservice.wmsdiscovery.model.Layer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LayerMapper {

    @Select("SELECT ID,ServiceID,Title,Name,Abstract,URL,ExtCRS FROM layerlist WHERE Title LIKE '%${title}%'")
    List<Layer> queryLayerByTitle(String title);

    @Select("SELECT ID,ServiceID,Title,Name,Abstract,URL,ExtCRS FROM layerlist WHERE Name LIKE '%${name}%'")
    List<Layer> queryLayerByName(String name);

    @Select("SELECT ID,ServiceID,Title,Name,Abstract,URL,ExtCRS FROM layerlist WHERE Abstract LIKE '%${Abstract}%'")
    List<Layer> queryLayerByAbstract(String Abstract);

    @Select("SELECT ID,ServiceID,Title,Name,Abstract,URL,ExtCRS FROM layerlist WHERE ServiceID = #{serviceId}")
    List<Layer> queryLayerByServiceId(Integer serviceId);

}
