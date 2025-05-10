package Demo;

import Models.Student;

public class StudentApp_v2 {
    public static void main(String[] args){
        Student studentA = new Student("Jannis","John");
        System.out.println(studentA.toString());

        Student studentB = new Student("Sandro","Warzecha");
        System.out.println(studentB.toString());
    }
}
