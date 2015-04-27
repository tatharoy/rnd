package com.trivialjava.rnd.spring_inttest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trivialjava.rnd.entity.InstanceRequest;

public class InstanceDescRequestProcessor {
	
	private final Logger logger = LoggerFactory.getLogger(InstanceDescRequestProcessor.class);
	
	public void prepareDesc(String request){
		System.out.println(Thread.currentThread().getName()
				+ " request desc #" + request );
		logger.info(Thread.currentThread().getName()
				+ " request desc #" + request );
		//return request;
	}

}
