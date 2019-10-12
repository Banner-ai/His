package com.asgard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asgard.model.RegistrationInfor;
import com.asgard.service.RegistrationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
	@Autowired
	RegistrationService rs;
	
	@RequestMapping("/index.do")
	public String listAll(
			@RequestParam(defaultValue="")String medical_record,
			@RequestParam(defaultValue="")String name,
			@RequestParam(defaultValue="")String secco_name,
			@RequestParam(defaultValue="")String starttime,
			@RequestParam(defaultValue="")String endtime,
			@RequestParam(defaultValue="1")int pageNum,Model model ) {
		Map<String,Object> map = new HashMap<>(); 
		map.put("medical_record", medical_record);
		map.put("name",name);
		map.put("secco_name",secco_name);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		map.put("starttime",starttime);
		map.put("endtime",endtime);
		PageHelper.startPage(pageNum,4);
		List<RegistrationInfor> list = rs.listAll(map);
		PageInfo<RegistrationInfor> pageInfo = new PageInfo<>(list);
		//System.out.println("list集合"+pageInfo.getList());
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("map", map);
		model.addAttribute("page", pageInfo);
		
		return "registration/index";
	}
	
	@RequestMapping("/look.do")
	public String  look(String medical_record,Model model) {
		RegistrationInfor r = rs.selectByRecord(medical_record);
		model.addAttribute("r", r);
		return "registration/look";
	}
	
	@RequestMapping("/detail.do")
	public String  detail(String medical_record,Model model) {
		RegistrationInfor r = rs.selectByRecord(medical_record);
		model.addAttribute("r", r);
		return "registration/edit";
	}
	@RequestMapping("/edit.do")
	public String edit(RegistrationInfor r) {
		System.out.println("页面获取到的"+r);
		rs.edit(r);
		return "forward:/registration/index.do";
	}
	
	@RequestMapping("/add.do")
	public String turnToAdd() {
		
		return "registration/add";
	}
	
	@RequestMapping("/insert.do")
	public String insert(RegistrationInfor r) {
		rs.insert(r);
		return "forward:/registration/index.do";
	}
	
	@RequestMapping("/delete.do")
	public String delete(String medical_record) {
		rs.delete(medical_record);
		return "forward:/registration/index.do";
	}
	
}
