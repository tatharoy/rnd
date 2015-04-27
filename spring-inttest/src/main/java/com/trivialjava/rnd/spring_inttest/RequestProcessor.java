package com.trivialjava.rnd.spring_inttest;

import org.springframework.integration.annotation.Gateway;

import com.trivialjava.rnd.entity.RequestMessage;

public interface RequestProcessor {
	
	@Gateway(requestChannel="requests")
	void placeRequest(RequestMessage order);

}
