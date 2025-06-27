package FHDW.Controller;

import FHDW.Models.Subject;
import FHDW.Utilities.*;
import FHDW.Models.Student;
import FHDW.Models.Location;

public class StudentCtr {
    public static Student runNewDialogue(){
        Console.startDialogueSection();

        String name = Console.readString("Namen eingeben: ");
        Location location = LocationCtr.runNewDialogue();

        Subject[] subjects = Subject.values();

        int subjectNumber = Console.readInt("Enter Subject Number: ");
        for(Subject subject: subjects){
            Console.printlnMessage("(" + subject.ordinal() + ")" + subject.toString());
        }

        Student student = new Student(name, location, Subject.getSubject(subjectNumber));
        return student;
    }

    public static void runEditDialogue(Student student){
        Console.startDialogueSection();
        if(student != null){
            for(boolean goOn = true; goOn;){
                String choice = Console.readChoice("New Vorname", "New Nachname", "New Location", "New Subject", "Exit");
                switch(choice){
                    case "New Vorname":
                        student.setFirstName(Console.readString("Bitte neuen Vornamen eingeben: "));
                        break;
                    case "New Nachname":
                        student.setLastName(Console.readString("Bitte neuen Nachnamen eingeben: "));
                        break;
                    case "New Location":
                        LocationCtr.runEditDialogue(LocationCtr.runNewDialogue());
                        break;
                    case "New Subject":
                        Subject[] subjects = Subject.values();
                        int subjectNumber = Console.readInt("Enter Subject Number: ");
                        for(Subject subject: subjects){
                            Console.printlnMessage("(" + subject.ordinal() + ")" + subject.toString());
                        }
                        Subject subject = Subject.getSubject(subjectNumber);
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
