package com.asgard.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asgard.mapper.DoctorMapper;
import com.asgard.model.CertificateType;
import com.asgard.model.Doctor;
import com.asgard.model.Section;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorMapper mapper;

	@Override
	public List<Doctor> listAll(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return  mapper.listAll(map);
	}

	@Override
	public void deleteDoctor(int id) {
		mapper.deleteDoctor(id);
	}

	@Override
	public void insertDoctor(Doctor doctor) {
		mapper.insertDoctor(doctor);
	}

	@Override
	public Doctor selectById(int id) {
		
		return mapper.selectById(id);
	}

	@Override
	public void edit(Doctor doctor) {
		mapper.edit(doctor);
	}

	@Override
	public CertificateType selectCertificate_type(int id) {
		
		return mapper.selectCertificate_type(id);
	}

	@Override
	public Section selectSection(int id) {
		
		return mapper.selectSection(id);
	}

	
	
	
	
}
