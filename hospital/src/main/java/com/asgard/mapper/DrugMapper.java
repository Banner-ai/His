package com.asgard.mapper;

import java.util.List;
import java.util.Map;

import com.asgard.model.Drug;

public interface DrugMapper {

	List<Drug> listAll(Map<String, Object> map);

	void insert(Drug drug);

	Drug selectById(String num);

	void edit(Drug drug);

	void delete(String num);

}
