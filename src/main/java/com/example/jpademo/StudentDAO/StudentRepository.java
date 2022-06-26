package com.example.jpademo.StudentDAO;

import com.example.jpademo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
