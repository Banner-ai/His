package com.asgard.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asgard.mapper.DrugMapper;
import com.asgard.model.Drug;

@Service
public class DrugServiceImpl implements DrugService {

	@Autowired	
	DrugMapper mapper;
	

	@Override
	public List<Drug> listAll(Map<String, Object> map) {
		
		return mapper.listAll(map);
	}


	@Override
	public void insert(Drug drug) {
		mapper.insert(drug);
		
	}


	@Override
	public Drug selectById(String num) {
		
		return mapper.selectById(num);
	}


	@Override
	public void edit(Drug drug) {
		mapper.edit(drug);
	}


	@Override
	public void delete(String num) {
		mapper.delete(num);
	}

}
