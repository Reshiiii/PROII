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

    public static void runEditDialogue(Location location){
        Console.startDialogueSection();
        if(location != null){
            for(boolean goOn = true; goOn;){
                String choice = Console.readChoice("Neue Adresse", "Neue Postleitzahl", "Neuer Ort", "Exit");
                switch(choice){
                    case "Neue Adresse":
                        location.setStreet(Console.readString("Bitte neue Straße eingeben: "));
                        break;
                    case "Neue Postleitzahl":
                        location.setZip(Console.readInt("Bitte neue Postleitzahl eingeben: "));
                        break;
                    case "Neuer Ort":
                        location.setCity(Console.readString("Bitte neue Stadt eingeben: "));
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
        Location location = null;
        for(boolean goOn = true; goOn;){
            String choice = Console.readChoice("Neue Location", "Location bearbeiten", "Location löschen", "Location anzeigen", "Exit");
            switch(choice){
                case "Neue Location":
                    location = runNewDialogue();
                    break;
                case "Location bearbeiten":
                    runEditDialogue(location);
                    break;
                case "Location löschen":
                    location = null;
                    break;
                case "Location anzeigen":
                    location.toString();
                    break;
                case "Exit":
                    goOn = false;
                    break;
            }
        }
        Console.concludeDialogueSection();

    }
}
