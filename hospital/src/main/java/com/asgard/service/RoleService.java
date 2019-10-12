package com.asgard.service;

import java.util.List;
import java.util.Map;

import com.asgard.model.Role;

public interface RoleService {

	List<Role> listAll(Map<String, Object> map);

}
