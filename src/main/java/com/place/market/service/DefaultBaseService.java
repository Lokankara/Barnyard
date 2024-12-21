package com.place.market.service;

import com.place.market.web.error.NotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class DefaultBaseService<E, ID, DTO> implements BaseService<E, ID, DTO> {

    protected abstract JpaRepository<E, ID> getRepository();

    @Override
    public List<DTO> getAll() {
        return getRepository().findAll().stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    public DTO getById(ID id) {
        E entity = getRepository().findById(id)
                .orElseThrow(() -> new NotFoundException("Entity not found"));
        return toDto(entity);
    }

    @Override
    public DTO save(E entity) {
        return toDto(getRepository().save(entity));
    }

    @Override
    public void delete(ID id) {
        if (!getRepository().existsById(id)) {
            throw new NotFoundException("Entity not found");
        }
        getRepository().deleteById(id);
    }

    protected abstract DTO toDto(E entity);

}
