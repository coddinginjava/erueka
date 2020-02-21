package sai.service.microB.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
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
