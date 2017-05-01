package gd.sample.employee.service;

import gd.samples.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findEmployeeById(Long id);

}
