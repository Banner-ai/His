package com.asgard.service;

import java.util.List;
import java.util.Map;

import com.asgard.model.User;

public interface UserService {
	List<User> listAll(Map<String, Object> map);

	int count(Map<String, Object> map);

	User detailUserById(int id);

	void edit(User user);

	void deleteUser(int id);

	void insertUser(User user);

	void insertRoleUser();

	void insertRole(User user);
}
