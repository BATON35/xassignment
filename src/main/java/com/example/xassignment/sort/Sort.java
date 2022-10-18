package com.example.xassignment.sort;

import com.example.xassignment.model.Student;

import java.util.List;

public interface Sort {
    List<Student> sortStudentsByPerformance(List<Student> unsortedStudents);
}
