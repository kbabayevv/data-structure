package corejavatasks.example;


import corejavatasks.example.model.StudentService;
import corejavatasks.example.model.Student;

import java.util.Scanner;

public class Default {


    static StudentService studentService = new StudentService();

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select menu:" +
                    "\n1. Create Student" +
                    "\n2. Get all students" +
                    "\n3. Exit system");
            int menu = sc.nextInt();


            if (menu == 1) {
                sc = new Scanner(System.in);
                System.out.println("Enter student's name surname and age");
                String name = sc.nextLine();
                String surname = sc.nextLine();
                Integer age = sc.nextInt();

                Student student = new Student();
                student.setName(name);
                student.setSurname(surname);
                student.setAge(age);


                studentService.createStudent(student);

                System.out.println();
            } else if (menu == 2) {

                studentService.getAllStudents();

            } else if (menu == 3) {
                System.exit(0);
            }
        }
    }


}




















