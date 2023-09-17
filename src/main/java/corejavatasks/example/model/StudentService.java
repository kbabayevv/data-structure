package corejavatasks.example.model;

import corejavatasks.example.config.StudentConfig;
import corejavatasks.example.model.Student;

import java.util.Arrays;

public class StudentService {
    public void createStudent(Student student) {
        StudentConfig.students[0] = student;
    }

    public void getAllStudents() {
        System.out.println(Arrays.toString(StudentConfig.students));
    }
}
