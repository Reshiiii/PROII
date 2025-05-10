package Demo;

import Models.Article;

public class ArticleApp {
    public static void main(String[] args){
        Article article = new Article();

        article.setId(1);
        article.setName("Gameboy");
        article.setOnStock(957);
        article.setSalePrice(189.99f);

        System.out.println(article.getDescription());
        System.out.println(article.getId());
        System.out.println(article.getName());
        System.out.println(article.getOnStock());
        System.out.println(article.getSalePrice());
    }
}
