package com.giservice.wmsdiscovery.controller;

import com.giservice.wmsdiscovery.mapper.LayerMapper;
import com.giservice.wmsdiscovery.model.Layer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LayerController {

    @Autowired
    LayerMapper layerMapper;

    @GetMapping("/getLayerByTitle")
    @ResponseBody
    public List<Layer> getLayerByTitle(@RequestParam(name = "title") String title){
        List<Layer> layerList=layerMapper.queryLayerByTitle(title);
        return layerList;
    }

    @GetMapping("/getLayerByName")
    @ResponseBody
    public List<Layer> getLayerByName(@RequestParam(name = "name") String name){
        List<Layer> layerList=layerMapper.queryLayerByName(name);
        return layerList;
    }

    @GetMapping("/getLayerByAbstract")
    @ResponseBody
    public List<Layer> getLayerByAbstract(@RequestParam(name = "abstract") String Abstract){
        List<Layer> layerList=layerMapper.queryLayerByAbstract(Abstract);
        return layerList;
    }

    @GetMapping("/getLayerByServiceId")
    @ResponseBody
    public List<Layer> getLayerByServiceId(@RequestParam(name = "serviceId") Integer serviceId){
        List<Layer> layerList=layerMapper.queryLayerByServiceId(serviceId);
        return layerList;
    }
}
