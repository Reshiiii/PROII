package FHDW.App;

import FHDW.Controller.StudentCtr;
import FHDW.Utilities.*;

public class StudentCtrApp {
    public static void main(String[] args){
        Console.printlnMessage("Student App startet");
        StudentCtr.runMainDialogue();
        Console.printlnMessage("Student App beendet");
    }
}
