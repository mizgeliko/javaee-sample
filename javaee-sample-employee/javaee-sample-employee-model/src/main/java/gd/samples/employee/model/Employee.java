package gd.samples.employee.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<Phone> phones;
    private LocalDate hireDate;
    private Employee manager;
    private Set<Employee> subordinates;
}
