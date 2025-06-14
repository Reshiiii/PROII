package FHDW.Demo;

import FHDW.Models.Article;
import FHDW.Models.Unit;

public class ArticleApp {
    public static void main(String[] args){
        //Article article = new Article();

        //article.setId(1);
        //article.setName("Gameboy");
        //article.setOnStock(957);
        //article.setSalePrice(189.99f);

        //System.out.println(article.getDescription());
        //System.out.println(article.getId());
        //System.out.println(article.getName());
        //System.out.println(article.getOnStock());
        //System.out.println(article.getSalePrice());
        Unit unit = Unit.NO_UNIT;
        Article article2 = new Article(100005, "Gameboy", 599.99f, unit);
        System.out.println(article2.getId());
        System.out.println(article2.getName());
        System.out.println(article2.getSalePrice());
        System.out.println(article2.getOnStock());

        Article article3 = new Article(100006, "Playsi 6", 100, 700.00f, unit);
        System.out.println(article3.getId());
        System.out.println(article3.getName());
        System.out.println(article3.getSalePrice());
        System.out.println(article3.getOnStock());
        System.out.println(article3.toString());
        System.out.println(article3.equals(article2));
        System.out.println(article3.equals(article3));

    }
}
