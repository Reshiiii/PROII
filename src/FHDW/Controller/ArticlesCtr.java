package FHDW.Controller;

import FHDW.Models.Article;
import FHDW.Models.Articles;
import FHDW.Utilities.Console;

public class ArticlesCtr {

    public static void printArticles(Articles articles){
        if(articles.getNo() == 0){
            Console.printlnMessage("*** No Articles available ***");
        }else{
            for(Article article: articles.getAll()){
                Console.printlnMessage(" " + article);
            }
        }
    }

    public static void runMainDialogue(){
        Console.startDialogueSection();
        Articles articles = new Articles();
        for(boolean goOn = true; goOn;){
            printArticles(articles);
            String choice = Console.readChoice("Add Article", "Edit Article", "Remove Article", "Exit");
            int id;
            switch (choice){
                case "Add Article":
                    articles.addArticle(ArticleCtr.runNewDialogue());
                    break;
                case "Edit Article":
                    id = Console.readInt("Enter id", Article.FIRST_ID, Article.LAST_ID);
                    ArticleCtr.runEditDialogue(articles.getArticle(id));
                    break;
                case "Remove Article":
                    id = Console.readInt("Enter id", Article.FIRST_ID, Article.LAST_ID);
                    articles.removeArticle(id);
                    break;
                case "Exit":
                    goOn = false;
                    break;
            }
        }
        Console.concludeDialogueSection();
    }
}
