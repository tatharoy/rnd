package com.trivialjava.rnd.entity;

public class RequestMessage<T extends Request> {
	
	T t = null;
	
	public T getRequest(){
		return t;
	}

	public void setRequest(T t) {
		this.t = t;
	}
	
	

}
