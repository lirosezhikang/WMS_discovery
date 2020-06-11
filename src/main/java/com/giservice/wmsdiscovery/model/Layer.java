package com.giservice.wmsdiscovery.model;

import lombok.Data;

@Data
public class Layer {
    private Integer id;
    private Integer serviceId;
    private String title;
    private String name;
    private String Abstract;
    private String url;
    private String extCrs;
}
