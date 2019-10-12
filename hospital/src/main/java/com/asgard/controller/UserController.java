package com.asgard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.asgard.model.User;
import com.asgard.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping("/index.do")
	public String listAll(@RequestParam(defaultValue="1")int pageNo,@RequestParam(defaultValue="")String user_name,Model model) {
		Map<String,Object> map = new HashMap<>();
		map.put("user_name", user_name);
		System.out.println("需要查询的用户名称"+user_name);
		//查找全部的数据条数
		int total = us.count(map);
		System.out.println("全部数据个数"+total);
		PageHelper.startPage(pageNo,5);
		//展现全部用户
		List<User> list = us.listAll(map);
		PageInfo<User> pageInfo = new PageInfo<>(list);
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("map",map);
		model.addAttribute("page",pageInfo);
		return "User/index";
	}
	
	@RequestMapping("/delete.do")
	public String deleteUser(int id) {
		System.out.println("需要删除的id"+id);
		us.deleteUser(id);
		return "forward:/User/index.do";
	}
	
	@RequestMapping("/edit.do")
	public String editUser(int id ,Model model) {
	//	System.out.println("查找所需要的id"+id);
		User user  = us.detailUserById(id);
		model.addAttribute("user", user);
		return "User/editUser";
	}
	
	@RequestMapping("/editUser.do")
	public String edit(User user) {
		System.out.println("页面上获取到的"+user);
		us.edit(user);
		return "forward:/User/index.do";
	}
	
	@RequestMapping("/addUser.do")
	public String toAddUserUI() {
		return "/User/addUser" ;
	}
	
	@RequestMapping("/add.do")
	public String insertUser(User user) {
		System.out.println("页面需要存入的 ："+user);
		us.insertUser(user);
		//向RoleUser里插入user_id
		us.insertRoleUser();
		//向RoleUser里插入 role_id
		us.insertRole(user);
		
		return "forward:/User/index.do";
	}
	
}
