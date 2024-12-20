package com.yarn.barn.web.rest;

import com.yarn.barn.entity.CustomerEntity;
import com.yarn.barn.service.CustomerService;
import com.yarn.barn.web.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController extends BaseController<CustomerEntity, Long, CustomerDto> {

    public CustomerRestController(CustomerService customerService) {
        super(customerService);
    }
}
