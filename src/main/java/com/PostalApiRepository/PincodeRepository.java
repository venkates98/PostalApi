package com.PostalApiRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PostalApiEntity.PincodeEntity;

public interface PincodeRepository extends JpaRepository<PincodeEntity, String> {

}
