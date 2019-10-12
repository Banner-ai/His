package com.asgard.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asgard.mapper.LoginMapper;
import com.asgard.model.Permission;
import com.asgard.model.Role;
import com.asgard.model.User;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginMapper mapper;
	@Override
	public User loginUser(String username, String password) {
		Map<String,String> map = new HashMap<>();
		map.put("username", username);
		map.put("password", password);
		User user = mapper.loginUser(map);
		return user;
	}
	@Override
	public Role   jurisdiction(int id) {
		
		return mapper.jurisdiction(id);
	}

}
