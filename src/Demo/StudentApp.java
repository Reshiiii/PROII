package Demo;

import Models.Student;

public class StudentApp {
    public static void main(String[] args){
        Student student = new Student();
        student.setId(10000);
        student.setName("Heinz, Peter");

        System.out.println(student.getId());
        System.out.println(student.getName());

        student.setId(10001);

        System.out.println(student.getId());
    }
}
