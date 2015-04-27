package com.trivialjava.rnd.spring_inttest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.trivialjava.rnd.entity.InstanceRequest;
import com.trivialjava.rnd.entity.RequestMessage;
import com.trivialjava.rnd.entity.SolutionRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:instance-request-demo.xml" })
public class RequestChannelTest {
	
	 @Autowired(required = true)
	 private RequestProcessor requestProcessor;
	 
	 
	
	@Test
	public void sendInstanceRequest(){
		InstanceRequest req= new InstanceRequest();
		req.setName("TathaInstance");
		req.setDescription("developerInstance");
		RequestMessage<InstanceRequest> message = new RequestMessage<InstanceRequest>();
		message.setRequest(req);
		requestProcessor.placeRequest(message);
		
	}
	
	@Test
	public void sendSolutionRequest(){
		SolutionRequest req= new SolutionRequest();
		req.setName("TathaSolution");
		req.setDescription("developerSolution");
		RequestMessage<SolutionRequest> message = new RequestMessage<SolutionRequest>();
		message.setRequest(req);
		requestProcessor.placeRequest(message);
		
	}

}
