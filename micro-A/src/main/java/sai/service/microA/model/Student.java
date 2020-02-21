package sai.service.microA.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer studentId;

    private String name;

    private String phoneNumber;

    public Student(Integer studentId, String name, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
