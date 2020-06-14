package com.giservice.wmsdiscovery.controller;

import com.giservice.wmsdiscovery.mapper.MatterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MatterController {

    @Autowired
    MatterMapper matterMapper;

    @GetMapping("/postMatter")
    @ResponseBody
    @CrossOrigin
    public void postMatter(@RequestParam(name = "title") String name,
                           @RequestParam(name = "url") String url,
                           @RequestParam(name = "description") String description,
                           @RequestParam(name = "email") String email){

        matterMapper.addMatter(name,url,description,email);
    }
}
