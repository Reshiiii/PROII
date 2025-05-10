package FHDW.App;

import FHDW.Controller.LocationCtr;
import FHDW.Utilities.*;

public class LocationCtrApp {
    public static void main(String[] args){
        Console.printlnMessage("Location App startet");
        LocationCtr.runMainDialogue();
        Console.printlnMessage("Location App beendet");
    }
}
