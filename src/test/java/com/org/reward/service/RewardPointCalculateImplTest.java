package com.org.reward.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import com.org.reward.test.StudbData;

class RewardPointCalculateImplTest {
StudbData stubData=new StudbData(); 
	
	@InjectMocks
	RewardPointCalculateImpl rewardPointCalculateImpl=new RewardPointCalculateImpl();
	
	
	@Test
	void testGetRewardPoint() {
		Double result=rewardPointCalculateImpl.getRewardPoint(stubData.getCustomerDetails());
		assertEquals(90.00, result);
	}
}
