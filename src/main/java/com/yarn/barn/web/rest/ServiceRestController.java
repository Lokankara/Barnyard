package com.yarn.barn.web.rest;

import com.yarn.barn.entity.ServiceEntity;
import com.yarn.barn.service.ServiceService;
import com.yarn.barn.web.dto.ServiceDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/services")
public class ServiceRestController extends BaseController<ServiceEntity, Long, ServiceDto> {

    public ServiceRestController(ServiceService service) {
        super(service);
    }
}
