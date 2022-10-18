package com.example.xassignment.service;

import com.example.xassignment.model.SortType;
import com.example.xassignment.model.Student;
import com.example.xassignment.sort.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SortServiceImplementation implements SortService{
    private final Sort bubbleSort;
    private final Sort heapSort;
    private final Sort mergeSort;

    public SortServiceImplementation(@Qualifier("bubbleSort") Sort bubbleSort,
                                     @Qualifier("heapSort") Sort heapSort,
                                     @Qualifier("mergeSort") Sort mergeSort) {
        this.bubbleSort = bubbleSort;
        this.heapSort = heapSort;
        this.mergeSort = mergeSort;
    }
    @Override
    public List<Student> sortStudentsByGrade(List<Student> students, SortType type) {
        List<Student> sortedStudents = new ArrayList<>();
        switch (type) {
            case HEAP:
                sortedStudents = heapSort.sortStudentsByPerformance(students);
                break;
            case BUBBLE:
                sortedStudents = bubbleSort.sortStudentsByPerformance(students);
                break;
            case MERGE:
                sortedStudents = mergeSort.sortStudentsByPerformance(students);
                break;
            default:
                // TODO: 17.10.2022 dodać obsługę błędu.
        }
        return sortedStudents;
    }
}
