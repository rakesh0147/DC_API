package com.dc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EducationDetailsEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer caseNumber;
	private String highestDegree;
	private String graduationYear;
	private String universityName;

}
