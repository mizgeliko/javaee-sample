package gd.samples.employee.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = "comment")
public class Phone {
    private Long id;
    private Long ownerId;

    private Type type;
    private String number;
    private String comment;

    public enum Type {
        HOME, WORK, CELL
    }
}
