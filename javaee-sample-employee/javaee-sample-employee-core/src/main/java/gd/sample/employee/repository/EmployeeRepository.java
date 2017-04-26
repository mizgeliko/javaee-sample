package gd.sample.employee.repository;

import gd.samples.employee.model.Employee;

public interface EmployeeRepository {

    Employee findEmployeeById(Long employeeId);

}
