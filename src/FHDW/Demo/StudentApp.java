package FHDW.Demo;

import FHDW.Models.Student;

public class StudentApp {
    public static void main(String[] args){
        Student student = new Student();
        student.setId(10000);
        student.setName("Heinz, Peter");

        System.out.println(student.getId());
        System.out.println(student.getName());

        student.setId(10001);

        System.out.println(student.getId());
        System.out.println(student.getName());

        Student student1 = new Student(15000, "Jannis", "John");
        System.out.println(student1.getId());
        System.out.println(student1.getName());

        System.out.println(student.equals(student1));
        Student student2 = new Student(10001, "Werner");
        System.out.println(student.equals(student2));

        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
