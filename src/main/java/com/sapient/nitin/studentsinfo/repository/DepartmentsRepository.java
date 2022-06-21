package com.sapient.nitin.studentsinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.nitin.studentsinfo.model.DepartmentsModel;

@Repository
public interface DepartmentsRepository extends JpaRepository<DepartmentsModel, Integer>{

}
