package Demo;

import Models.Location;
import Models.Student;

public class StudentApp_v2 {
    public static void main(String[] args){
        Location locationA = new Location("Detmolder Straße", 33604, "Bielefeld");
        Student studentA = new Student("Jannis","John", locationA);
        System.out.println(studentA.toString());

        System.out.println("Es gibt noch " + Student.getNoOfAvailableIds() + " IDs");
        System.out.println("Es sind " + Student.getNoOfAssignedIds() + " IDs in Benutzung");

        Location locationB = new Location("Brackweder Straße", 33601, "Bielefeld");
        Student studentB = new Student("Sandro","Warzecha", locationB);
        System.out.println(studentB.toString());

        System.out.println("Es gibt noch " + Student.getNoOfAvailableIds() + " IDs");
        System.out.println("Es sind " + Student.getNoOfAssignedIds() + " IDs in Benutzung");

        Location locationC = new Location("Neue Wiese", 32760, "Detmold");
        Student studentC = new Student("Regina", "Weigum", locationC);
        System.out.println(studentC.toString());

        System.out.println("Es gibt noch " + Student.getNoOfAvailableIds() + " IDs");
        System.out.println("Es sind " + Student.getNoOfAssignedIds() + " IDs in Benutzung");


    }
}
