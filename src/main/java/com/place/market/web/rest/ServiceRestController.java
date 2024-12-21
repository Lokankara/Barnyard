package com.place.market.web.rest;

import com.place.market.entity.ServiceEntity;
import com.place.market.service.ServiceService;
import com.place.market.web.dto.ServiceDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/services")
public class ServiceRestController extends BaseController<ServiceEntity, Long, ServiceDto> {

    public ServiceRestController(ServiceService service) {
        super(service);
    }
}
