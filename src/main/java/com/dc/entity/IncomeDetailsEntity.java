package com.dc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class IncomeDetailsEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer caseNumber;
	private Double monthlyIncome;
	private Double rentIncome;
	private Double propertyIncome;

}
