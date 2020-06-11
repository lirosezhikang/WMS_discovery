package com.giservice.wmsdiscovery.controller;

import com.giservice.wmsdiscovery.mapper.WmsMapper;
import com.giservice.wmsdiscovery.model.Wms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WmsController {

    @Autowired
    WmsMapper wmsMapper;

    @GetMapping("/getWmsByCountry")
    @ResponseBody
    public List<Wms> GetWmsByCountry(@RequestParam(name = "country") String country){
        List<Wms> wmsList=wmsMapper.queryWmsByCountry(country);
        return wmsList;
    }

    @GetMapping("/getWmsByTitle")
    @ResponseBody
    public List<Wms> GetWmsByTitle(@RequestParam(name = "title") String title){
        List<Wms> wmsList=wmsMapper.queryWmsByTitle(title);
        return wmsList;
    }
}
