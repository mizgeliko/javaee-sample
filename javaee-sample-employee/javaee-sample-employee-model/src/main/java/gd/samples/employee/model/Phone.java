package gd.samples.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode(exclude = "comment")
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Serializable {
    private static final long serialVersionUID = 8129633467519012422L;

    private Type type;
    private String number;
    private String comment;

    public enum Type {
        HOME, WORK, CELL
    }
}
