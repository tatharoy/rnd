package com.trivialjava.rnd.spring_inttest;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trivialjava.rnd.entity.InstanceRequest;
import com.trivialjava.rnd.exception.IllegalNameException;


public class InstanceNameRequestProcessor {
	
    private final Logger logger = LoggerFactory.getLogger(InstanceNameRequestProcessor.class);

	public String prepareName(InstanceRequest request) throws Exception {
		
			System.out.println(Thread.currentThread().getName()
					+ " request name #" + request.getName() );
			logger.info(Thread.currentThread().getName()
					+ " request name #" + request.getName() );
			if(!request.getName().equals("Tatha")){
				throw new IllegalNameException("Not a valid Name");
			}
			//throw new Exception("forced");
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
