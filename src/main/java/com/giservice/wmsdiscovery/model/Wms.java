package com.giservice.wmsdiscovery.model;

import lombok.Data;

@Data
public class Wms {
    private Integer uniqueId;
    private String contactPerson;
    private String contactOrganization;
    private String contactPosition;
    private String Address;
    private String city;
    private String postCode;
    private String country;
    private String contactVoiceTelephone;
    private String contactElectronicMailAddress;
    private String url;
}
