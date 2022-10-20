package com.example.xassignment.controller;

import com.example.xassignment.model.SortType;
import com.example.xassignment.model.Student;
import com.example.xassignment.service.FileService;
import com.example.xassignment.service.SortService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private final SortService sortService;
    private final FileService fileService;

    public StudentController(SortService sortService, FileService fileService) {
        this.sortService = sortService;
        this.fileService = fileService;
    }

    @GetMapping("/{sortType}")
    public ResponseEntity<List<Student>> getSortedStudents(@PathVariable SortType sortType) throws FileNotFoundException {
        return ResponseEntity.ok(sortService.sortStudentsByGrade(sortType));
    }

    @PostMapping("/")
    public ResponseEntity<List<Student>> saveSortedStudents(@RequestBody List<Student> students) throws IOException {
        return ResponseEntity.ok(fileService.saveStudentsToFile(students));
    }

    // TODO: 20.10.2022  write sorted students to file
    // TODO: 20.10.2022 save unsorted students to file ????
}
