package FHDW.App;

import FHDW.Controller.ArticleCtr;
import FHDW.Utilities.Console;

public class ArticleCtrApp {
    public static void main(String[] args) {
        Console.printlnMessage("Article App startet");
        ArticleCtr.runMainDialogue();
        Console.printlnMessage("Article App beendet");
    }
}
