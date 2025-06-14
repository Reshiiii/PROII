package FHDW.App;

import FHDW.Controller.StudentsCtr;
import FHDW.Utilities.Console;

public class StudentsCtrApp {
    public static void main(String[] args){
        Console.printlnMessage("Students App startet");
        StudentsCtr.runMainDialogue();
        Console.printlnMessage("Students App beendet");
    }
}
