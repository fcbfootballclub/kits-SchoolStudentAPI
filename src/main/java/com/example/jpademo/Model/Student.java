package com.example.jpademo.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Student")
@Table(name = "student",uniqueConstraints = @UniqueConstraint(name = "student_email", columnNames = "email"))
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "first_Name", nullable = false, columnDefinition = "TEXT")
    private String firstName;
    @Column(name = "last_Name", nullable = false, columnDefinition = "TEXT")
    private String lastName;
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;
    @Column(name = "age", nullable = false)
    private Integer age;


    public Student(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
