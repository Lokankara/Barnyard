package com.place.market.service;

import java.util.List;

public interface BaseService<E, ID, DTO> {

    List<DTO> getAll(String email);

    List<DTO> getAll();

    DTO getById(ID id);

    DTO save(E entity);

    void delete(ID id);

    boolean isIdMatching(E entity, ID id);

}