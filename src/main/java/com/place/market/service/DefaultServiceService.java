package com.place.market.service;

import com.place.market.dao.ServiceRepository;
import com.place.market.entity.ServiceEntity;
import com.place.market.web.dto.ServiceDto;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultServiceService extends DefaultBaseService<ServiceEntity, Long, ServiceDto> implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Override
    protected JpaRepository<ServiceEntity, Long> getRepository() {
        return serviceRepository;
    }

    @Override
    protected ServiceDto toDto(ServiceEntity serviceEntity) {
        return ServiceDto.builder()
                .serviceId(serviceEntity.getId())
                .name(serviceEntity.getName())
                .price(serviceEntity.getPrice())
                .build();
    }

    @Override
    public List<ServiceDto> getAll(String email) {
        return getAll();
    }

    @Override
    public boolean isIdMatching(ServiceEntity entity, Long id) {
        return entity != null && entity.getId() != null && entity.getId().equals(id);
    }
}
