package com.asgard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asgard.model.Permission;
import com.asgard.service.ResourceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/resource")
public class ResourceController {
	@Autowired
	ResourceService rs;
	
	@RequestMapping("/index.do")
	public String listAll(
			@RequestParam(defaultValue="")String resource_name,
			@RequestParam(defaultValue="1")int pageNum,
			Model model) {
		Map<String,Object> map = new HashMap<>();
		map.put("resource_name", resource_name);
		
		PageHelper.startPage(pageNum,4);
		List<Permission> list = rs.listAll(map);
		PageInfo<Permission> pageInfo = new PageInfo<>(list);
		model.addAttribute("resource", pageInfo.getList());
		model.addAttribute("map", map);
		model.addAttribute("page", pageInfo);
		
		return "Resource/index";
	}
	@RequestMapping("/add.do")
	public String turnIntoAdd() {
		return "Resource/add";
	}
	@RequestMapping("/insert.do")
	public String insert(Permission p) {
		rs.insert(p);
		return "forward:/resource/index.do";
	}
	
	@RequestMapping("/delete.do")
	public String delete(int id) {
		rs.delete(id);
		return "forward:/resource/index.do";
	}
	
	@RequestMapping("/detail.do")
	public String detail(int id,Model model) {
		Permission p = rs.selectById(id);
		model.addAttribute("r", p);
		return "Resource/edit";
	}
	@RequestMapping("/edit.do")
	public String update(Permission p) {
		rs.update(p);
		return "forward:/resource/index.do";
	}
	
	
	
	
	
	
	
	
	
	
	
}
