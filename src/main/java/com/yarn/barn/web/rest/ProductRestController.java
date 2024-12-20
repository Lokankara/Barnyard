package com.yarn.barn.web.rest;

import com.yarn.barn.entity.ProductEntity;
import com.yarn.barn.service.ProductService;
import com.yarn.barn.web.dto.ProductDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductRestController extends BaseController<ProductEntity, Long, ProductDto> {

    public ProductRestController(ProductService productService) {
        super(productService);
    }
}