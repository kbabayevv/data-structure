package corejavatasks.tasks9;



import corejavatasks.tasks9.exception.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static List<Student> students = new ArrayList<>();

    public void createStudent() {
        var student = new Student();
        student.setName("Kamran");
        student.setSurName("Babayev");
        student.setAge(24);
        student.setClassNumber(2);

        var student1 = new Student();
        student1.setName("Nurlan");
        student1.setSurName("Babayev");
        student1.setAge(26);
        student1.setClassNumber(4);

        students.add(student);
        students.add(student1);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentByName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students.get(i);
            }
        }
        throw new StudentNotFoundException("Student Not Found");
    }
}
