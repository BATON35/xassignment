package com.example.xassignment.service;

import com.example.xassignment.model.Student;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class FileServiceImplementation implements FileService {

    @Override
    public List<Student> readStudentsFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);

        ArrayList<Student> students = new ArrayList<>();
        while (in.hasNextLine()) {
            String data = in.nextLine();
            String[] split = data.split(",");
            students.add(new Student(split[0], Double.valueOf(split[1])));
            System.out.println(data);
        }

        return students;
    }

    @Override
    public List<Student> saveStudentsToFile(List<Student> students) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(("note.txt")));
        writer.write(students.toString());
        writer.close();

        return students;
    }
}

