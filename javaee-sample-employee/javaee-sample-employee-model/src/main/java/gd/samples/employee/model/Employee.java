package gd.samples.employee.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private Set<Phone> phones;
    private Employee manager;
    private Set<Employee> subordinates;
}
