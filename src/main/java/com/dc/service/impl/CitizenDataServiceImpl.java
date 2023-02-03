package com.dc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.entity.CitizenData;
import com.dc.repository.CitizenDataRepository;
import com.dc.service.CitizenDataService;
@Service
public class CitizenDataServiceImpl implements CitizenDataService{

	@Autowired
	private CitizenDataRepository citizenDataRepository;
	
	@Override
	public String saveCitizenData(CitizenData citizenData) {
		if(citizenData!=null) {
			citizenDataRepository.save(citizenData);
			return "Data Saved";
		}
		return "Data Not saved";
	}

}
