package gd.samples.employee.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 8825344715705873962L;

    private Long id;
    private String firstName;
    private String lastName;
    private Set<Phone> phones;
    private Employee manager;
    private Set<Employee> subordinates;
}
