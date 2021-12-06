package com.student.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mohamed Gabr",
                        "mo.gabr1994@gmail.com",
                        LocalDate.of(1994, Month.SEPTEMBER,13),
                        27
                )
        );
    }
}
