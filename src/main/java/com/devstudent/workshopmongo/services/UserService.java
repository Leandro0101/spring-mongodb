package com.devstudent.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devstudent.workshopmongo.domain.User;
import com.devstudent.workshopmongo.repositories.UserRepository;
import com.devstudent.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		User user = repository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));
		
		return user;
	}
}
