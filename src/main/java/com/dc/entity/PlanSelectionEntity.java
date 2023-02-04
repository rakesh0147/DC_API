package com.dc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PlanSelectionEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer caseNumber;
	private String planName;

}
