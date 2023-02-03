package com.dc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.entity.CitizenData;

public interface CitizenDataRepository extends JpaRepository<CitizenData,Serializable>{

}
