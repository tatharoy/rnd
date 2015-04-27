package com.trivialjava.rnd.spring_inttest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trivialjava.rnd.entity.SolutionRequest;

public class SolutionRequestProcessor {

	 private final Logger logger = LoggerFactory.getLogger(SolutionRequestProcessor.class);

		public void prepareName(SolutionRequest request) {
			
				
				logger.info(Thread.currentThread().getName()
						+ " request name #" + request.getName() );
				
				System.out.println(Thread.currentThread().getName()
						+ " request name #" + request.getName() );
		}
}
