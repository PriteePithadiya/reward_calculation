package com.org.reward.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.reward.model.CustomerDetails;
import com.org.reward.service.RewardPointCalculate;

import lombok.extern.slf4j.Slf4j;
/**
* The RewardPointController program that redirect flow of application
*
* @author  Pritee
* @version 1.0
* @since   05-07-2022
*/

@Slf4j
@RestController
@RequestMapping("/rewards")
public class RewardPointController {
	private static final Logger log = 
		    org.slf4j.LoggerFactory.getLogger(RewardPointController.class);
	
	
	@Autowired
	RewardPointCalculate rewardPointCaculate;
	
	@GetMapping("/getpoint")
   public ResponseEntity<Double> getRewardPoint(@RequestBody CustomerDetails customerDetails){
		log.info("Exceution of getRewardPoint started..");
	
		Double Result=rewardPointCaculate.getRewardPoint(customerDetails);
		log.info("Exceution of getRewardPoint ended..");
		return new ResponseEntity<Double>(Result,HttpStatus.OK);
	}
}
