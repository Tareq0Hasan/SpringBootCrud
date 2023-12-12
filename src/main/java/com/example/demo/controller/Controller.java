package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("rest")
public class Controller {
	// here we did't handle the error and the response code
	
	/*
	 * @Autowired UserService userservice;
	 * 
	 * @GetMapping("/homee") public List<User> user() { return
	 * userservice.getUser(); }
	 * 
	 * @GetMapping("/category/{id}")
	 * 
	 * public Optional<User> getgetUserByid(@PathVariable Long id) {
	 * 
	 * // return userservice.getUserByid(id); return userservice.getgetUserByid(id);
	 * }
	 * 
	 * @GetMapping("/categoryy/{id}") public List<User> getUserByid(@PathVariable
	 * Long id) {
	 * 
	 * return userservice.getUserByid(id); }
	 * 
	 * @PostMapping("/add") public String saveData(@RequestBody User user) { return
	 * userservice.saveData(user);
	 * 
	 * }
	 */
	
// here we handle the error and the status code	
	@Autowired
	UserService userservice;

	@GetMapping("/homee")
	public ResponseEntity<List<User>>  user() {
		return userservice.getUser();
	}

	@GetMapping("/category/{id}")

	public Optional<User> getgetUserByid(@PathVariable Long id) {

		// return userservice.getUserByid(id);
		return userservice.getgetUserByid(id);
	}

	@GetMapping("/categoryy/{id}")
	public ResponseEntity<List<User>> getUserByid(@PathVariable Long id) {

		return userservice.getUserByid(id);
	}

	@PostMapping("/add")
	public String saveData(@RequestBody User user) {
		return userservice.saveData(user);

	}
	

}
