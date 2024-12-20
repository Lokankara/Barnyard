package com.yarn.barn.dao;

import com.yarn.barn.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<VendorEntity, Long> {

    VendorEntity findByEmail(String email);
}
