package com.asgard.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asgard.mapper.RegistrationInforMapper;
import com.asgard.model.RegistrationInfor;
@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationInforMapper mapper;
	
	@Override
	public int count(Map<String, Object> map) {
		
		return mapper.count(map);
	}

	@Override
	public List<RegistrationInfor> listAll(Map<String, Object> map) {
	
		return mapper.listAll(map);
	}

	@Override
	public RegistrationInfor selectByRecord(String record) {
		// TODO Auto-generated method stub
		return mapper.selectByRecord(record);
	}

	@Override
	public void edit(RegistrationInfor r) {
		mapper.edit(r);
	}

	@Override
	public void insert(RegistrationInfor r) {
		mapper.insert(r);
	}

	@Override
	public void delete(String record) {
		mapper.delete(record);
	}

}
