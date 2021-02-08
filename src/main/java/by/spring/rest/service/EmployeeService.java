package by.spring.rest.service;

import by.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void deleteEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void addEmployee(Employee employee);
    public  Employee getEmployeeById(int id);
}
