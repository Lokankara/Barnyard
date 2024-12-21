package com.place.market.web.rest;

import com.place.market.entity.VendorEntity;
import com.place.market.service.VendorService;
import com.place.market.web.dto.VendorDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vendors")
public class VendorRestController extends BaseController<VendorEntity, Long, VendorDto> {

    public VendorRestController(VendorService vendorService) {
        super(vendorService);
    }
}
