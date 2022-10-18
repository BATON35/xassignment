package com.example.xassignment.service;

import com.example.xassignment.model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileServiceImplementation implements FileService {

    @Override
    public List<Student> readStudentsFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        // TODO: 17.10.2022 zaimplementować
        return null;
    }
}

