package com.oguzyildiz.springboot.JpaRepositoryDemo.dao;

import com.oguzyildiz.springboot.JpaRepositoryDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
