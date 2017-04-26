package gd.sample.employee.service;

import gd.sample.employee.repository.EmployeeRepository;
import gd.samples.employee.model.Employee;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
@NoArgsConstructor
class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Inject
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return repository.findEmployeeById(id);
    }
}
