package com.example.xassignment.service;

import com.example.xassignment.model.SortType;
import com.example.xassignment.model.Student;

import java.util.List;

public interface SortService {
    List<Student> sortStudentsByGrade(List<Student> students, SortType type);
}
