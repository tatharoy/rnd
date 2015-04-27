package com.trivialjava.rnd.spring_inttest;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trivialjava.rnd.entity.InstanceRequest;


public class InstanceNameRequestProcessor {
	
    private final Logger logger = LoggerFactory.getLogger(InstanceNameRequestProcessor.class);

	public String prepareName(InstanceRequest request) {
		
			System.out.println(Thread.currentThread().getName()
					+ " request name #" + request.getName() );
			logger.info(Thread.currentThread().getName()
					+ " request name #" + request.getName() );
			return request.getDescription();
		
	}
	
	/*public InstanceRequest prepareDesc(InstanceRequest request){
		System.out.println(Thread.currentThread().getName()
				+ " request desc #" + request.getDescription() );
		logger.info(Thread.currentThread().getName()
				+ " request desc #" + request.getDescription() );
		return request;
	}*/

}
