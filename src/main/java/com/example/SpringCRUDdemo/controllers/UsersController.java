package com.example.SpringCRUDdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringCRUDdemo.DAO.UsersDAO;
import com.example.SpringCRUDdemo.exception.UserNotFoundException;
import com.example.SpringCRUDdemo.users.Users;

@RestController
public class UsersController {

	@Autowired
	UsersDAO userService;
	
	@GetMapping("/users")
	public List<Users> retrieveAll(){
		return userService.retrieveAll();
	}
	
	@GetMapping("/users/{id}")
	public Users retrieveOneUser(@PathVariable int id) {
		return userService.returnOneUser(id);
	}
	
	@PostMapping("/users")
	public Users createUser(@RequestBody Users user) {
		return userService.addUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		Users user = userService.deleteUser(id);
	
		if(user == null) {
			throw new UserNotFoundException("User does not exist.");
		}
	}
}
