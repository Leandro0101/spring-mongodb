package com.devstudent.workshopmongo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String id){
		super("Not found object with id: "+id);
	}
}
