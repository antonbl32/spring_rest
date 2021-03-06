package by.spring.rest.controller;

import by.spring.rest.entity.Employee;
import by.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){

        return employeeService.getAllEmployees();
    }



}
