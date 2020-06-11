package com.giservice.wmsdiscovery.model;

import lombok.Data;

@Data
public class Wms {
    private Integer id;
    private String url;
    private String country;
    private String title;
    private String request;
    private String format;
    private String version;
}
