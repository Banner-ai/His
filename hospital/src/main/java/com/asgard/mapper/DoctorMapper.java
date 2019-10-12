package com.asgard.mapper;

import java.util.List;
import java.util.Map;

import com.asgard.model.CertificateType;
import com.asgard.model.Doctor;
import com.asgard.model.Section;

public interface DoctorMapper {


	List<Doctor> listAll(Map<String, Object> map);

	void deleteDoctor(int id);

	void insertDoctor(Doctor doctor);

	Doctor selectById(int id);

	void edit(Doctor doctor);

	CertificateType selectCertificate_type(int id);

	Section selectSection(int id);

}
