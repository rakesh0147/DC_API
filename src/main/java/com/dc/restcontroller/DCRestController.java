package com.dc.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dc.entity.CitizenData;
import com.dc.service.CitizenDataService;

@RestController
public class DCRestController {
	
	@Autowired
	private CitizenDataService citizenDataService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody CitizenData citizenData){
		String saveCitizenData = citizenDataService.saveCitizenData(citizenData);
		return new ResponseEntity<String>(saveCitizenData,HttpStatus.OK);
	}

}
