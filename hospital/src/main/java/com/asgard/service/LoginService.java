package com.asgard.service;


import com.asgard.model.Role;
import com.asgard.model.User;

public interface LoginService {

	User loginUser(String username, String password);

	Role  jurisdiction(int id);

}
