package com.youtube.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo.dao.UserRepository;
import com.youtube.demo.model.Rol;
import com.youtube.demo.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	protected UserRepository userRepository;
	
	@Override
	public User save(User user)
	{
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return (List<User>) this.userRepository.findAll();
	}

	@Override
	public void delete(User user) {
		this.userRepository.delete(user);
	}

	@Override
	public List<Rol> findAllRoles() {
		
		return userRepository.findAllRoles();
	}

}
