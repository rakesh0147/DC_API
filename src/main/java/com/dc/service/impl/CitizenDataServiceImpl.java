package com.dc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.dc.entity.EducationDetailsEntity;
import com.dc.entity.IncomeDetailsEntity;
import com.dc.entity.KidsDetailsEntity;
import com.dc.entity.PlanSelectionEntity;
import com.dc.repository.EducationDetailsEntityRepository;
import com.dc.repository.IncomeDetailsEntityRepository;
import com.dc.repository.KidsDetailsEntityRepository;
import com.dc.repository.PlanSelectionEntityRepository;
import com.dc.service.CitizenDataService;
@Service
public class CitizenDataServiceImpl implements CitizenDataService{

	@Autowired
	private PlanSelectionEntityRepository planSelectionEntityRepository;
	@Autowired
	private IncomeDetailsEntityRepository incomeDetailsEntityRepository;
	@Autowired
	private KidsDetailsEntityRepository kidsDetailsEntityRepository;
	@Autowired
	private EducationDetailsEntityRepository educationDetailsEntityRepository;
	@Override
	public Integer serachCaseNumber(Integer caseNumber) {
		WebClient webClient=WebClient.create();
		Integer appId=webClient.get().uri("",caseNumber).retrieve().bodyToMono(Integer.class).block();
		return appId;
	}

	@Override
	public String savePlane(PlanSelectionEntity planSelectionEntity) {
		if(planSelectionEntity!=null) {
			planSelectionEntityRepository.save(planSelectionEntity);
		}
		return null;
	}

	@Override
	public String saveEducationDetails(EducationDetailsEntity educationDetailsEntity) {
		educationDetailsEntityRepository.save(educationDetailsEntity);
		return null;
	}

	@Override
	public String saveIncomeDetails(IncomeDetailsEntity incomeDetailsEntity) {
		incomeDetailsEntityRepository.save(incomeDetailsEntity);
		return null;
	}

	@Override
	public String saveKidDetials(List<KidsDetailsEntity> kids) {
		kidsDetailsEntityRepository.saveAll(kids);
		return null;
	}


}
