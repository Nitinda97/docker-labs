package com.sapient.nitin.studentsinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.nitin.studentsinfo.model.StudentsModel;

@Repository
public interface StudentsRepository extends JpaRepository<StudentsModel, Integer>{

	StudentsModel findByRoll(String roll);
	
	StudentsModel findByStudentId(Integer studentId);
}
