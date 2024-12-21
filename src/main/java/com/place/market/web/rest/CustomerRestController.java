package com.place.market.web.rest;

import com.place.market.entity.CustomerEntity;
import com.place.market.service.CustomerService;
import com.place.market.web.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController extends BaseController<CustomerEntity, Long, CustomerDto> {

    public CustomerRestController(CustomerService customerService) {
        super(customerService);
    }
}
