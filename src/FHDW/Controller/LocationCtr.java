package FHDW.Controller;

import FHDW.Utilities.Console;
import FHDW.Models.Location;

public class LocationCtr {
    public static Location runNewDialogue(){
        Console.startDialogueSection();

        //(String street, int zip, String city)
        String street   = Console.readString("Straßennamen eingeben: ");
        int zip         = Console.readInt("Postleitzahl eingeben: ");
        String city     = Console.readString("Stadt eingeben: ");

        Location location = new Location(street, zip, city);
        return location;
    }

    public static void runMainDialogue(){
        Console.startDialogueSection();

    }
}
