package com.place.market.service;

import com.place.market.dao.CustomerRepository;
import com.place.market.entity.CustomerEntity;
import com.place.market.web.dto.CustomerDto;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultCustomerService extends DefaultBaseService<CustomerEntity, Long, CustomerDto> implements CustomerService {

    private final CustomerRepository customerRepository;


    @Override
    public List<CustomerDto> getAll(String email) {
        return StringUtils.hasLength(email) ?
                List.of(toDto(customerRepository.findByEmail(email)))
                : customerRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    public boolean isIdMatching(CustomerEntity entity, Long id) {
        return entity != null && entity.getId() != null && entity.getId().equals(id);
    }

    @Override
    protected JpaRepository<CustomerEntity, Long> getRepository() {
        return customerRepository;
    }

    @Override
    protected CustomerDto toDto(CustomerEntity customerEntity) {
        return new CustomerDto(customerEntity.getId(), customerEntity.getFirstName(),
                customerEntity.getLastName(), customerEntity.getEmail(),
                customerEntity.getPhone(), customerEntity.getAddress());
    }
}
