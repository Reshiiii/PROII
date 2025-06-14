package FHDW.Controller;

import FHDW.Models.Student;
import FHDW.Utilities.*;
import FHDW.Models.Students;

public class StudentsCtr {

    public static void printStudents(Students students){
        if(students.getNo() == 0){
            Console.printlnMessage("*** No Students available ***");
        }else{
            for(Student student : students.getALl()){
                Console.printlnMessage(" " + student);
            }
        }
    }

    public static void runMainDialogue(){
        Console.startDialogueSection();
        Students students = new Students();
        for(boolean goOn = true; goOn;){
            printStudents(students);
            String choice = Console.readChoice("Add Student", "Edit Student", "Remove Student", "Exit");
            int id;
            switch (choice){
                case "Add Student":
                    students.addStudent(StudentCtr.runNewDialogue());
                    break;
                case "Edit Student":
                    id = Console.readInt("Enter id", Student.FIRST_ID, Student.LAST_ID);
                    StudentCtr.runEditDialogue(students.getStudent(id));
                    break;
                case "Remove Student":
                    id = Console.readInt("Enter id", Student.FIRST_ID, Student.LAST_ID);
                    students.removeStudent(id);
                case "Exit":
                    goOn = false;
                    break;
            }
        }
        Console.concludeDialogueSection();
    }
}
