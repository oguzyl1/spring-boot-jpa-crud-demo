package com.oguzyildiz.springboot.JpaRepositoryDemo.rest;

import com.oguzyildiz.springboot.JpaRepositoryDemo.entity.Employee;
import com.oguzyildiz.springboot.JpaRepositoryDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable Integer employeeId){
        Employee emp = employeeService.findById(employeeId);

        if(emp == null){
            throw new RuntimeException("verilen id'ye sahip kullanıcı bulunamadı id: " + employeeId );
        }
        return emp;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee emp = employeeService.save(employee);
        return emp;
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee emp = employeeService.save(employee);
        return emp;
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable Integer employeeId){
        Employee emp = employeeService.findById(employeeId);
        if(emp == null){
            throw new RuntimeException("verilen id'ye sahip kullanıcı bulunamadı id: " + employeeId );
        }
        employeeService.deleteById(employeeId);
        return "Verilen id'ye sahip kişi silindi: " +employeeId;

    }
}
