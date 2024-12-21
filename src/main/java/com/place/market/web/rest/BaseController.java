package com.place.market.web.rest;

import com.place.market.service.BaseService;
import com.place.market.web.error.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<E, ID, DTO> {

    protected final BaseService<E, ID, DTO> service;

    protected BaseController(BaseService<E, ID, DTO> service) {
        this.service = service;
    }

    @GetMapping
    public List<DTO> getAll(@RequestParam(name = "email", required = false) String email) {
        if (email != null && !email.isEmpty()) {
            return service.getAll(email);
        } else {
            return service.getAll();
        }
    }

    @GetMapping("/{id}")
    public DTO getById(@PathVariable ID id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DTO create(@RequestBody E entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public DTO update(@PathVariable ID id, @RequestBody E entity) {
        if (!service.isIdMatching(entity, id)) {
            throw new BadRequestException("ID in path does not match ID in request body");
        }
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ID id) {
        service.delete(id);
    }
}
