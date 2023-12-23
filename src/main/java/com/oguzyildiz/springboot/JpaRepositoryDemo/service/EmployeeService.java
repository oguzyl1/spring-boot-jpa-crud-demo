package com.oguzyildiz.springboot.JpaRepositoryDemo.service;

import com.oguzyildiz.springboot.JpaRepositoryDemo.dao.EmployeeRepository;
import com.oguzyildiz.springboot.JpaRepositoryDemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id){
        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee = null;

        if(result.isPresent()){
            employee = result.get();
        }
        else {
            throw new RuntimeException("verilen id'ye sahip kişi bulunamadı");
        }
        return employee;
    }

    @Override
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }
}
