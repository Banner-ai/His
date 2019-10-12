package com.asgard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asgard.model.Role;
import com.asgard.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/Role")
public class RoleController {
	@Autowired
	private RoleService rs;
	
	@RequestMapping("/index.do")
	public String ListAll(
			@RequestParam(defaultValue="")String role_name,
			@RequestParam(defaultValue="1")int pageNum,
			Model model) {
		Map<String,Object> map = new HashMap<>();
		map.put("role_name",role_name);
		
		PageHelper.startPage(pageNum,3);
		List<Role> list = rs.listAll(map);
		PageInfo<Role> pageInfo =new PageInfo<>(list);
		model.addAttribute("page",pageInfo);
		model.addAttribute("map", map);
		model.addAttribute("role", pageInfo.getList());
		return "Role/index";
	}
	
	
	
	
	
}
