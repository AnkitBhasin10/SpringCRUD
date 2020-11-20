package com.example.SpringCRUDdemo.DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.SpringCRUDdemo.users.Users;

@Component
public class UsersDAO {
	
	static List<Users> users = new ArrayList<>();
	int counterId = 2;

	static {
		users.add(new Users(1,"Ankit",new Date()));
		users.add(new Users(2,"Mayank",new Date()));
	}
	
	//retrieve all
	public List<Users> retrieveAll(){
		return users;
	}
	
	//retrieve single user
	public Users returnOneUser(int id) {
		for(Users user:users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
	
	//add a user
	public Users addUser(Users user) {
		if(user.getId() == null) {
			user.setId(++counterId);
		}
		
		users.add(user);
		return user;
	}
	
	//Delete a user
	public Users deleteUser(int id) {
		Iterator<Users> iter = users.iterator();
		while(iter.hasNext()) {
			Users user = iter.next();
			if(user.getId() == id) {
				iter.remove();
				return user;
			}
		}
		
		return null;
	}
}
