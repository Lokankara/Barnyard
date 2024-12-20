package com.yarn.barn.web.rest;

import com.yarn.barn.entity.VendorEntity;
import com.yarn.barn.service.VendorService;
import com.yarn.barn.web.dto.VendorDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vendors")
public class VendorRestController extends BaseController<VendorEntity, Long, VendorDto> {

    public VendorRestController(VendorService vendorService) {
        super(vendorService);
    }
}
