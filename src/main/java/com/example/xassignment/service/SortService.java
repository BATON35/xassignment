package com.example.xassignment.service;

import com.example.xassignment.model.SortType;
import com.example.xassignment.model.Student;

import java.io.FileNotFoundException;
import java.util.List;

public interface SortService {
    List<Student> sortStudentsByGrade(SortType type) throws FileNotFoundException;
}
