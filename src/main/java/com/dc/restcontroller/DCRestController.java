package com.dc.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dc.entity.EducationDetailsEntity;
import com.dc.entity.IncomeDetailsEntity;
import com.dc.entity.KidsDetailsEntity;
import com.dc.entity.PlanSelectionEntity;
import com.dc.service.CitizenDataService;

@RestController
public class DCRestController {
	
	@Autowired
	private CitizenDataService citizenDataService;
	
	@GetMapping("/search/{caseNumber}")
	public ResponseEntity<Integer> getCaseNumber(@PathVariable Integer caseNumber){
		Integer caseNum = citizenDataService.serachCaseNumber(caseNumber);
		return new ResponseEntity<Integer>(caseNum,HttpStatus.OK);
	}
	@PostMapping("/kiddtail")
	public ResponseEntity<String> kidsData(@RequestBody KidsDetailsEntity[] kidsDetailsEntities){
		List<KidsDetailsEntity> lists=new ArrayList<>();
		for(KidsDetailsEntity kids:kidsDetailsEntities) {
			lists.add(kids);
		}
		String kidDetials = citizenDataService.saveKidDetials(lists);
		return new ResponseEntity<String>(kidDetials,HttpStatus.OK);
	}
	@PostMapping("/incomedtail")
	public ResponseEntity<String> incomeData(@RequestBody IncomeDetailsEntity incomeDetailsEntity){
		String kidDetials = citizenDataService.saveIncomeDetails(incomeDetailsEntity);
		return new ResponseEntity<String>(kidDetials,HttpStatus.OK);
	}
	
	@PostMapping("/educationdtail")
	public ResponseEntity<String> educationData(@RequestBody EducationDetailsEntity educationDetailsEntity){
		String kidDetials = citizenDataService.saveEducationDetails(educationDetailsEntity);
		return new ResponseEntity<String>(kidDetials,HttpStatus.OK);
	}
	@PostMapping("/plan")
	public ResponseEntity<String> planData(@RequestBody PlanSelectionEntity planSelectionEntity){
		String kidDetials = citizenDataService.savePlane(planSelectionEntity);
		return new ResponseEntity<String>(kidDetials,HttpStatus.OK);
	}
	
    
}
