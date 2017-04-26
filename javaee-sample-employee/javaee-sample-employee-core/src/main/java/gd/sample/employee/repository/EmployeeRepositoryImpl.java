package gd.sample.employee.repository;

import gd.sample.employee.annotation.EmployeeQualifier;
import gd.samples.employee.model.Employee;
import gd.samples.employee.model.Phone;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.HashSet;

@ApplicationScoped
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Inject
    @EmployeeQualifier
    private EntityManager manager;

    @Override
    public Employee findEmployeeById(Long employeeId) {
        Employee emp = new Employee();
        emp.setId(employeeId);
        emp.setFirstName("John");
        emp.setLastName("Doe");
        emp.setPhones(new HashSet<Phone>(){{
            add(new Phone(Phone.Type.CELL, "111111", "comment"));
            add(new Phone(Phone.Type.HOME, "222222", "don't disturb"));
        }});
        return emp;
    }
}
