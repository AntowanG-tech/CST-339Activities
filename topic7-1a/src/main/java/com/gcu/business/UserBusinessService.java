package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.UserEntity;
import com.gcu.data.repository.UsersRepository;
import com.gcu.model.UserModel;

@Service
public class UserBusinessService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	/**
	 * Non-Default constructor for constructor injection.
	 * 
	 */
	public UserBusinessService(UsersRepository usersRepository) {
		
		this.usersRepository = usersRepository;
	}
	
	/**
	 * Get all Users from the database.
	 * 
	 */
	public List<UserModel> getAllUsers() {
		
		//Get all of the Entity Users
		List<UserEntity> usersEntity = usersRepository.findAll();
		
		//Iterate over the Entity Users and create a list of Domain Users
		List<UserModel> usersDomain = new ArrayList<UserModel>();
		for(UserEntity user : usersEntity) {
			
			usersDomain.add(new UserModel(user.getId(), user.getUsername(), user.getPassword()));
			
		}
		
		// Return list of Domain Users
		return usersDomain;
		
	}

}
