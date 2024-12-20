package com.yarn.barn.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorDto {

    private Long vendorId;
    private String name;
    private String contact;
    private String emailAddress;
    private String phoneNumber;
    private String address;
}
