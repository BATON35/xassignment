package com.example.xassignment.controller;

import com.example.xassignment.model.SortType;
import com.example.xassignment.model.Student;
import com.example.xassignment.service.SortService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("students")
public class SortServiceController {
    private final SortService sortService;

    public SortServiceController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/{sortType}")
    public ResponseEntity<List<Student>> getSortedStudents(@PathVariable SortType sortType) throws FileNotFoundException {
        return ResponseEntity.ok(sortService.sortStudentsByGrade(sortType));
    }
    // TODO: 20.10.2022  write sorted students to file
    // TODO: 20.10.2022 save unsorted students to file ????
}
