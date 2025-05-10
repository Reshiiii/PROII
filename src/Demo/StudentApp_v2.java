package Demo;

import Models.Student;

public class StudentApp_v2 {
    public static void main(String[] args){
        Student studentA = new Student("Jannis","John");
        System.out.println(studentA.toString());

        System.out.println("Es gibt noch " + Student.getNoOfAvailableIds() + " IDs");
        System.out.println("Es sind " + Student.getNoOfAssignedIds() + " IDs in Benutzung");

        Student studentB = new Student("Sandro","Warzecha");
        System.out.println(studentB.toString());

        System.out.println("Es gibt noch " + Student.getNoOfAvailableIds() + " IDs");
        System.out.println("Es sind " + Student.getNoOfAssignedIds() + " IDs in Benutzung");

        Student studentC = new Student("Regina", "Weigum");
        System.out.println(studentC.toString());

        System.out.println("Es gibt noch " + Student.getNoOfAvailableIds() + " IDs");
        System.out.println("Es sind " + Student.getNoOfAssignedIds() + " IDs in Benutzung");


    }
}
