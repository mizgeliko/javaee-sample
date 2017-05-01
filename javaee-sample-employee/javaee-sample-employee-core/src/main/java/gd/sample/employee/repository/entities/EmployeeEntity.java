package gd.sample.employee.repository.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "employee")
@Access(AccessType.FIELD)
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "hire_date")
    @Temporal(TemporalType.DATE)
    private Date hireDate;

    @OneToMany(orphanRemoval=true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="owner_id")
    private Set<PhoneEntity> phones;

    // @ManyToOne
    // @JoinColumn(name="mrg_id")
    // private EmployeeEntity manager;
    //
    // @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    // private Set<EmployeeEntity> subordinates;

    @Column(name="mrg_id")
    private Long managerId;

}
