package course.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "teachers")
@PrimaryKeyJoinColumn(name = "teacher_id", referencedColumnName = "id")
@Getter
@Setter
public class Teacher extends User {
    private String phone;
    private int experiences;

    public Teacher() {
        super();
    }
}
