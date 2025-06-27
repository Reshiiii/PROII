package FHDW.Controller;

import FHDW.Models.Location;
import FHDW.Models.Student;
import FHDW.Models.Article;
import FHDW.Models.Unit;
import FHDW.Utilities.Console;

public class ArticleCtr {
    public static Article runNewDialogue(){
        Console.startDialogueSection();

        long id = Console.readLong("ID eingeben:");
        String name = Console.readString("Bezeichnung eingeben:");
        int onStock = Console.readInt("Lagerbestand eingeben:");
        float salePrice = Console.readFloat("Preis eingeben: ");



        Unit[] units = Unit.values();
        for(Unit unit: units){
            Console.printlnMessage("(" + unit.ordinal() + ")" + unit.toString());
        }
        int unitNumber = Console.readInt("Enter Unit Number: ");

        Article article = new Article(id, name, onStock, salePrice, Unit.getUnit(unitNumber));
        return article;
    }

    public static void runEditDialogue(Article article){
        Console.startDialogueSection();
        if(article != null){
            for(boolean goOn = true; goOn;){
                String choice = Console.readChoice("Neue ID", "Neue Bezeichnung", "Neuer Lagerbestand", "Neue Einheit", "Neuer Preis", "Exit");
                switch(choice){
                    case "Neue ID":
                        article.setId(Console.readLong("Bitte neue ID eingeben "));
                        break;
                    case "Neue Bezeichnung":
                        article.setName(Console.readString("Bitte neue Bezeichnung eingeben "));
                        break;
                    case "Neuer Lagerbestand":
                        article.setOnStock(Console.readInt("Bitte neuen Lagerbestand eingeben "));
                        break;
                    case "Neue Einheit":
                        Unit[] units = Unit.values();
                        int unitNumber = Console.readInt("Enter Unit Number ");
                        for(Unit unit: units){
                            Console.printlnMessage("(" + unit.ordinal() + ")");
                        }
                        Unit unit = Unit.getUnit(unitNumber);
                        break;
                    case "Neuer Preis":
                        article.setSalePrice(Console.readFloat("Bitte neuen Preis eingeben "));
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
        Article article = null;
        for(boolean goOn = true; goOn;){
            String choice = Console.readChoice("Neuer Artikel", "Artikel bearbeiten", "Artikel löschen", "Artikel anzeigen", "Exit");
            switch(choice){
                case "Neuer Artikel":
                    article = runNewDialogue();
                    break;
                case "Artikel bearbeiten":
                    runEditDialogue(article);
                    break;
                case "Artikel löschen":
                    article = null;
                    break;
                case "Artikel anzeigen":
                    article.toString();
                    break;
                case "Exit":
                    goOn = false;
                    break;
            }
        }
        Console.concludeDialogueSection();

    }
}
