package com.learn.springboot.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.springboot.info.model.Employee;

@Repository
//here we dont need to provide @Repository becouse JpaRepository internally provides @Repository annotation for that
public interface EmployeeRepositiry extends JpaRepository<Employee, Long>{

}
