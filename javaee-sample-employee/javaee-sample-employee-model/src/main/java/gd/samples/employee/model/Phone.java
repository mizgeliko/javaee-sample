package gd.samples.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(exclude = "comment")
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    private Type type;
    private String number;
    private String comment;

    public enum Type {
        HOME, WORK, CELL
    }
}
