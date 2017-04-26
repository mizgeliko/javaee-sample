package gd.sample.employee.repository.entities;

import gd.samples.employee.model.Phone;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phone")
@Access(AccessType.FIELD)
public class PhoneEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "owner_id")
    private Long ownerId;

    @Enumerated(EnumType.STRING)
    @Column(name = "p_type")
    private Phone.Type type;

    @Column(name = "p_number")
    private String number;

    @Column(name = "p_comment")
    private String comment;

}
