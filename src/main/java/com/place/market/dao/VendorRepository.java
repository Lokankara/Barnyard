package com.place.market.dao;

import com.place.market.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<VendorEntity, Long> {

    VendorEntity findByEmail(String email);
}
