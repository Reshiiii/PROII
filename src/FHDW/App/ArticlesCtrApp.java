package FHDW.App;

import FHDW.Controller.ArticlesCtr;
import FHDW.Utilities.Console;

public class ArticlesCtrApp {
    public static void main(String[] args){
        Console.printlnMessage("Articles App startet");
        ArticlesCtr.runMainDialogue();
        Console.printlnMessage("Articles App beendet");
    }
}
