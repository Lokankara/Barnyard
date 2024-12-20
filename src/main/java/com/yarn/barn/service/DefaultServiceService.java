package com.yarn.barn.service;

import com.yarn.barn.dao.ServiceRepository;
import com.yarn.barn.entity.ServiceEntity;
import com.yarn.barn.web.dto.ServiceDto;
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
