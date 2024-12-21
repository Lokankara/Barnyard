package com.place.market.service;

import com.place.market.dao.VendorRepository;
import com.place.market.entity.VendorEntity;
import com.place.market.web.dto.VendorDto;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultVendorService extends DefaultBaseService<VendorEntity, Long, VendorDto> implements VendorService {

    private final VendorRepository vendorRepository;

    @Override
    public List<VendorDto> getAll(String email) {
        return StringUtils.hasLength(email) ?
                List.of(toDto(vendorRepository.findByEmail(email)))
                : getRepository().findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    public boolean isIdMatching(VendorEntity entity, Long id) {
        return entity != null && entity.getId() != null && entity.getId().equals(id);
    }

    @Override
    protected JpaRepository<VendorEntity, Long> getRepository() {
        return vendorRepository;
    }

    @Override
    protected VendorDto toDto(VendorEntity entity) {
        return new VendorDto(
                entity.getId(), entity.getName(),
                entity.getContact(), entity.getEmail(),
                entity.getPhone(), entity.getAddress());
    }
}
