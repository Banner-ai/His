package com.asgard.mapper;

import java.util.Map;

import com.asgard.model.Role;
import com.asgard.model.User;

public interface LoginMapper {

	User loginUser(Map<String,String> map);

	Role  jurisdiction(int id);

}
