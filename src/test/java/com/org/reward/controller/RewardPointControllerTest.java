package com.org.reward.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.org.reward.service.RewardPointCalculateImpl;
import com.org.reward.test.StudbData;

@SpringBootTest
class RewardPointControllerTest {

	StudbData stubData = new StudbData();
	

	@Mock
	RewardPointCalculateImpl rewardPointCalculateImpl;

	@InjectMocks
	RewardPointController rewardPointController = new RewardPointController();

@Test
void testGetRewardPoint() {

    MockHttpServletRequest request = new MockHttpServletRequest();
    RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    
	Mockito.when(rewardPointCalculateImpl.getRewardPoint(stubData.getCustomerDetails())).thenReturn(90.00);
	       ResponseEntity<Double> responseEntity=rewardPointController.getRewardPoint(stubData.getCustomerDetails());
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
      
}

}
