package com.asgard.mapper;

import java.util.List;
import java.util.Map;

import com.asgard.model.Role;

public interface RoleMapper {

	List<Role> listAll(Map<String, Object> map);

}
