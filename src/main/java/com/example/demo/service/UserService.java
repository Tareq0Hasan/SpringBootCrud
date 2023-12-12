package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Service
public class UserService {
	//with out handle exception and status
	
	
	/*
	 * @Autowired UserDao userdao;
	 * 
	 * public response List<User> getUser() {
	 * 
	 * return userdao.findAll(); }
	 * 
	 * public List<User> getUserByid(Long id) {
	 * 
	 * return userdao.findByid(id); }
	 * 
	 * public Optional<User> getgetUserByid(Long id) {
	 * 
	 * return userdao.findById(id); }
	 * 
	 * public String saveData(User user) {
	 * 
	 * userdao.save(user); return "Success"; }
	 */

	//handle exception and status

	
	@Autowired
	UserDao userdao;

	public ResponseEntity<List<User>>  getUser() {

		try {
		return new ResponseEntity<>(userdao.findAll(),HttpStatus.FOUND);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(userdao.findAll(),HttpStatus.BAD_REQUEST);
	}
	
	
	public List<User> getUserl() {

		return userdao.findAll();

	}
	
	
	
	

	public ResponseEntity<List<User>> getUserByid(Long id) {

		try {
		return new ResponseEntity<>(userdao.findByid(id),HttpStatus.FOUND);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(userdao.findByid(id),HttpStatus.NOT_FOUND);
	}

	public Optional<User> getgetUserByid(Long id) {

		return userdao.findById(id);
	}

	public String saveData(User user) {

		userdao.save(user);
		return "Success";
	}
	
}
