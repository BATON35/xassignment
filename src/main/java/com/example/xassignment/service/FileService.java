package com.example.xassignment.service;

import com.example.xassignment.model.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface FileService {
    List<Student> readStudentsFromFile(String path) throws FileNotFoundException;

    List<Student> saveStudentsToFile(List<Student> students) throws IOException;
}
