package corejavatasks.example.model;

import org.example.config.StudentConfig;

import java.util.Arrays;

public class StudentService {
    public void createStudent(Student student) {
        StudentConfig.students[0] = student;
    }

    public void getAllStudents() {
        System.out.println(Arrays.toString(StudentConfig.students));
    }
}
