package com.asgard.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asgard.mapper.ResourceMapper;
import com.asgard.model.Permission;

@Service
public class ResourceServiceImpl implements ResourceService {
	@Autowired
	private ResourceMapper mapper;
		
	@Override
	public List<Permission> listAll(Map<String,Object> map) {
		
		return mapper.listAll(map);
	}

	@Override
	public void insert(Permission p) {
		mapper.insert(p);
	}

	@Override
	public void delete(int id) {
		mapper.delete(id);
	}

	@Override
	public Permission selectById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}

	@Override
	public void update(Permission p) {
		mapper.update(p);
	}

}
