package FHDW.App;

import FHDW.Controller.StudentCtr;
import FHDW.Utilities.*;

public class StudentCtrApp {
    public static void main(String[] args){
        Console.printlnMessage("Location App startet");
        StudentCtr.runMainDialogue();
        Console.printlnMessage("Location App beendet");
    }
}
