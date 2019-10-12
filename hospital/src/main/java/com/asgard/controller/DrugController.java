package com.asgard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asgard.model.Drug;
import com.asgard.service.DrugService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/medicine")
public class DrugController {
	@Autowired
	private DrugService ds;
	
	@RequestMapping("/index.do")
	public String listAll(
			@RequestParam(defaultValue="")String drug_name,
			@RequestParam(defaultValue="") String drug_type,
			@RequestParam(defaultValue="1") int pageNum,
			Model model) {
				
		Map<String,Object> map = new  HashMap<>();
		map.put("drug_name", drug_name);
		map.put("drug_type",drug_type);
		PageHelper.startPage(pageNum,3);
		
		List<Drug> list = ds.listAll(map);
		PageInfo<Drug> pageInfo = new PageInfo<>(list);
		model.addAttribute("drug", pageInfo.getList());
		model.addAttribute("map", map);
		model.addAttribute("page",pageInfo);
		return "medicine/index";
	}
	
	@RequestMapping("/add.do")
	public String turnToAdd() {
		return "medicine/add";
	}
	@RequestMapping("/insert.do")
	public String insert(Drug drug) {
		ds.insert(drug);
		return "forward:/medicine/index.do";	
	}
	
	
	@RequestMapping("/detail.do")
	public String turnToEdit(String num,Model model) {
		Drug drug = ds.selectById(num);
		model.addAttribute("d", drug);
		return "medicine/edit";
	}
	@RequestMapping("/edit.do")
	public String edit(Drug drug) {
		ds.edit(drug);
		return "forward:/medicine/index.do";
	}
	
	@RequestMapping("/look.do")
	public String turnToLook(String num,Model model) {
		Drug drug = ds.selectById(num);
		model.addAttribute("d", drug);
		return "medicine/look";
	}
	
	@RequestMapping("/delete.do")
	public String deleteDrug(String num) {
		ds.delete(num);
		return "forward:/medicine/index.do";
	}
	
	
	
	
	
}
