package com.asgard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asgard.model.CertificateType;
import com.asgard.model.Doctor;
import com.asgard.model.Section;
import com.asgard.service.DoctorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService ds;
	
	@RequestMapping("/index.do")
	public String listAllDoctor(
			@RequestParam(defaultValue="")String id,
			@RequestParam(defaultValue="")String name,
			@RequestParam(defaultValue="")String secco_name,
			@RequestParam(defaultValue="1")int pageNum,Model model) {
			
			Map<String,Object> map = new HashMap<>();
			map.put("id", id);
			map.put("name",name);
			map.put("secco_name",secco_name);
			
			PageHelper.startPage(pageNum,2);
			
			System.out.println("需要查询的数据"+ map);
			List<Doctor> list = ds.listAll(map);
			PageInfo<Doctor> pageInfo = new PageInfo<>(list);
			model.addAttribute("doctor", pageInfo.getList());
			model.addAttribute("map", map);
			model.addAttribute("page", pageInfo);
			return "doctor/index";
	}
	
	@RequestMapping("/delete.do")
	public String deleteDoctor(int id){
		ds.deleteDoctor(id);
		return "forward:/doctor/index.do";
	}
	//详情
	@RequestMapping("/look.do")
	public String look(int id,Model model) {
		Doctor doctor = ds.selectById(id);
		CertificateType  c = ds.selectCertificate_type(id);
		Section s  =ds.selectSection(id);
		model.addAttribute("d", doctor);
		model.addAttribute("c",c);
		model.addAttribute("s", s);
		return "doctor/look";
	}
	
	//更改
	@RequestMapping("/edit.do")
	public String edit(int id,Model model) {
		Doctor doctor = ds.selectById(id);
		model.addAttribute("d", doctor);
		return "doctor/edit";
	}
	@RequestMapping("/editDoctor.do")
	public String editDoctorbyid(Doctor doctor) {
		System.out.println("页面上获取的"+doctor);
		ds.edit(doctor);
		return "forward:/doctor/index.do";
	}
	
	
	
	@RequestMapping("/add.do")
	public String insertDoctor() {
		return "doctor/add";
	}
	@RequestMapping("/addDoctor.do")
	public String insert(Doctor doctor) {
		ds.insertDoctor(doctor);
		
		return "forward:/doctor/index.do";
	}
	
	
}
