package com.devstudent.workshopmongo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devstudent.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("2", "Maria Brown", "maria@gmail.com");
		User alex = new User("3", "Alex Sandro", "alex@gmail.com");
		List<User> list = Arrays.asList(maria, alex);
		
		return ResponseEntity.ok().body(list);
	}
}
