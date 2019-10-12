package com.asgard.mapper;

import java.util.List;
import java.util.Map;

import com.asgard.model.RegistrationInfor;

public interface RegistrationInforMapper {

	int count(Map<String, Object> map);

	List<RegistrationInfor> listAll(Map<String, Object> map);

	RegistrationInfor selectByRecord(String record);

	void edit(RegistrationInfor r);

	void insert(RegistrationInfor r);

	void delete(String record);

}
