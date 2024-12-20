package com.yarn.barn.service;

import com.yarn.barn.dao.ProductRepository;
import com.yarn.barn.entity.ProductEntity;
import com.yarn.barn.web.dto.ProductDto;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultProductService extends DefaultBaseService<ProductEntity, Long, ProductDto> implements ProductService {

    private final ProductRepository productRepository;

    @Override
    protected JpaRepository<ProductEntity, Long> getRepository() {
        return productRepository;
    }

    @Override
    public List<ProductDto> getAll(String email) {
        return getAll();
    }

    @Override
    public boolean isIdMatching(ProductEntity entity, Long id) {
        return entity != null && entity.getId() != null && entity.getId().equals(id);
    }

    @Override
    protected ProductDto toDto(ProductEntity productEntity) {
        return new ProductDto(productEntity.getId() == null ? 0
                : productEntity.getId(),
                productEntity.getName(),
                productEntity.getPrice(),
                productEntity.getVendorId());
    }
}
