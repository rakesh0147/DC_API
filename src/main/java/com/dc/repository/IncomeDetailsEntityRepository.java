package com.dc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.entity.IncomeDetailsEntity;

public interface IncomeDetailsEntityRepository extends JpaRepository<IncomeDetailsEntity,Serializable>{

}
