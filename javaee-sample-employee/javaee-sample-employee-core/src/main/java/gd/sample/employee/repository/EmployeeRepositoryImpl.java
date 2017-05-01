package gd.sample.employee.repository;

import gd.sample.employee.annotation.EmployeeQualifier;
import gd.sample.employee.repository.entities.EmployeeEntity;
import gd.samples.employee.model.Employee;
import ma.glasnost.orika.MapperFacade;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Stateless
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Inject
    @EmployeeQualifier
    private EntityManager em;

    @Inject
    private MapperFacade mapperFacade;

    @Override
    public List<Employee> findAll() {
        return em.createQuery("from EmployeeEntity", EmployeeEntity.class).getResultList()
                .stream().map(e -> mapperFacade.map(e, Employee.class)).collect(toList());
    }

    @Override
    public Employee findEmployeeById(Long employeeId) {
        EmployeeEntity entity = em.find(EmployeeEntity.class, employeeId);
        return mapperFacade.map(entity, Employee.class);
    }

}
