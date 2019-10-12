package com.asgard.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asgard.mapper.UserMapper;
import com.asgard.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper mapper;
	
	@Override
	public List<User> listAll(Map<String, Object> map) {
		
		return mapper.listAll(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		
		return mapper.count(map);
	}

	@Override
	public User detailUserById(int id) {
		
		return mapper.detailUserById(id);
	}

	@Override
	public void edit(User user) {
		mapper.editUser(user);
	}

	@Override
	public void deleteUser(int id) {
		mapper.deleteUser(id);
	}

	@Override
	public void insertUser(User user) {
		mapper.insertUser(user);
	}

	@Override
	public void insertRoleUser() {
		mapper.insertRoleUser();
	}

	@Override
	public void insertRole(User user) {
		mapper.insertRole(user);
	}

}
