package com.asgard.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asgard.mapper.RoleMapper;
import com.asgard.model.Role;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleMapper mapper;
	
	@Override
	public List<Role> listAll(Map<String, Object> map) {
		
		return mapper.listAll(map);
	}

}
