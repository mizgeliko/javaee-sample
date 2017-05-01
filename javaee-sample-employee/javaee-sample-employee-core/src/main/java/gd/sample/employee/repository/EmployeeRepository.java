package gd.sample.employee.repository;

import gd.samples.employee.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();
    Employee findEmployeeById(Long employeeId);

}
