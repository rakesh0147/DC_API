package com.dc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CitizenData {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Long appId;
	private String planName;
	private Double monthlySalaryIncome;
	private Double rentIncome;
	private Double propertyIncome;
	private String highestDegree;
	private Integer graduationYear;
	private String universityName;

}
