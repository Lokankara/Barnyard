package com.place.market.web.rest;

import com.place.market.entity.ProductEntity;
import com.place.market.service.ProductService;
import com.place.market.web.dto.ProductDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductRestController extends BaseController<ProductEntity, Long, ProductDto> {

    public ProductRestController(ProductService productService) {
        super(productService);
    }
}