package com.dc.service;

import java.util.List;

import com.dc.entity.EducationDetailsEntity;
import com.dc.entity.IncomeDetailsEntity;
import com.dc.entity.KidsDetailsEntity;
import com.dc.entity.PlanSelectionEntity;

public interface CitizenDataService {
	
	public Integer serachCaseNumber(Integer caseNumber);
	public String savePlane(PlanSelectionEntity planSelectionEntity);
	public String saveEducationDetails(EducationDetailsEntity educationDetailsEntity);
	public String saveIncomeDetails(IncomeDetailsEntity incomeDetailsEntity);
	public String saveKidDetials(List<KidsDetailsEntity> kids);

}
