package com.oguzyildiz.springboot.JpaRepositoryDemo.service;

import com.oguzyildiz.springboot.JpaRepositoryDemo.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Employee findById(Integer id);
    Employee save(Employee employee);
    void deleteById(Integer id);
}
