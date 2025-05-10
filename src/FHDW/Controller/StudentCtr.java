package FHDW.Controller;

import FHDW.Utilities.*;
import FHDW.Models.Student;
import FHDW.Models.Location;

public class StudentCtr {
    public static Student runNewDialogue(){
        Console.startDialogueSection();

        String firstName = Console.readString("Vornamen eingeben: ");
        String lastName = Console.readString("Nachnamen eingeben: ");
        Location location = LocationCtr.runNewDialogue();

        Student student = new Student(firstName, lastName, location);
        return student;
    }

    public static void runEditDialogue(Student student){
        Console.startDialogueSection();
        if(student != null){
            for(boolean goOn = true; goOn;){
                String choice = Console.readChoice("Neuer Vorname", "Neuer Nachname", "Neue Location", "Exit");
                switch(choice){
                    case "Neuer Vorname":
                        student.setFirstName(Console.readString("Bitte neuen Vornamen eingeben: "));
                        break;
                    case "Neuer Nachname":
                        student.setLastName(Console.readString("Bitte neuen Nachnamen eingeben: "));
                        break;
                    case "Neue Location":
                        LocationCtr.runEditDialogue(LocationCtr.runNewDialogue());
                        break;
                    case "Exit":
                        goOn = false;
                        break;
                }
            }
        }

    }

    public static void runMainDialogue(){
        Console.startDialogueSection();
        Student student = null;
        for(boolean goOn = true; goOn;){
            String choice = Console.readChoice("Neuer Student", "Student bearbeiten", "Student löschen", "Student anzeigen", "Exit");
            switch(choice){
                case "Neuer Student":
                    student = runNewDialogue();
                    break;
                case "Student bearbeiten":
                    runEditDialogue(student);
                    break;
                case "Student löschen":
                    student = null;
                    break;
                case "Student anzeigen":
                    student.toString();
                    break;
                case "Exit":
                    goOn = false;
                    break;
            }
        }
        Console.concludeDialogueSection();

    }
}
