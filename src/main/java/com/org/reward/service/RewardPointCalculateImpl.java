package com.org.reward.service;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import com.org.reward.exception.InvalidAmount;
import com.org.reward.model.CustomerDetails;

/**
* The RewardPointCalculateImpl program implements an application that
* simply calculate customer rewards points
*
* @author  Pritee
* @version 1.0
* @since   05-07-2022
*/

@Service
public class RewardPointCalculateImpl implements RewardPointCalculate {
	private static final Logger log = 
		    org.slf4j.LoggerFactory.getLogger(RewardPointCalculateImpl.class);
	

	/** This method is for calculate rewards point of customer in retail shop
	 * @param customerDetails
	 * 
	 * @return Double
	 * 
	 */
	
	@Override
	public Double getRewardPoint(CustomerDetails customerDetails) {
		log.info("execution of getRewardPoint method started...");
		Double reward1=0.0;
		Double reward2=0.0;
		if(customerDetails.getSpentAmount()<=0) {
			throw new InvalidAmount("Please enter valid amount");
		}
        if(customerDetails.getSpentAmount()>50) {
        	reward1=(customerDetails.getSpentAmount()-50)*1;
        }
        if(customerDetails.getSpentAmount()>100) {
        	reward2=(customerDetails.getSpentAmount()-100)*1;
        }
        log.info("execution of getRewardPoint method ended...");
		return reward1+reward2;
	}
}
