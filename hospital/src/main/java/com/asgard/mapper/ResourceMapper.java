package com.asgard.mapper;

import java.util.List;
import java.util.Map;

import com.asgard.model.Permission;

public interface ResourceMapper {

	List<Permission> listAll(Map<String, Object> map);

	void insert(Permission p);

	void delete(int id);

	Permission selectById(int id);

	void update(Permission p);

}
