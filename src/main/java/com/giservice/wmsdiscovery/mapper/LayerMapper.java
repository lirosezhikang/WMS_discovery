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

    @Select("SELECT ID,ServiceID,Title,Name,Abstract,Keywords,URL,ImagePath FROM (select * from layerlist left join imageid_localpath on layerlist.path_ID=imageid_localpath.ID) as t WHERE Title LIKE '%${title}%' AND Name LIKE '%${name}%' AND Abstract LIKE '%${Abstract}%' AND Keywords LIKE '%${keywords}%' AND XMAX <= #{xmax} AND XMIN >= #{xmin} AND YMAX <= #{ymax} AND YMIN >= #{ymin}")
    List<Layer> queryTest(String title,String name,String Abstract,String keywords,float xmax,float xmin,float ymax,float ymin);

}
