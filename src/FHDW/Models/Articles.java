package FHDW.Models;

public class Articles {
    private Article [] articleArray;

    public Articles(){
        articleArray = new Article[Article.LAST_ID];
    }

    public void addArticle(Article article){
        articleArray[(int) article.getId()] = article;
    }

    public void removeArticle(int id){
        articleArray[id] = null;
    }

    public Article getArticle(int id){
        return articleArray[id];
    }

    public int getNo(){
        int counter = 0;
        if(articleArray != null){
            for(Article article: articleArray){
                if(article != null){
                    counter ++;
                }
            }
            return counter;
        }else{
            return counter;
        }
    }

    public Article[] getAll(){
        Article[] result = new Article[this.getNo()];
        int index = 0;
        for(Article article: articleArray){
            if(article != null){
                result[index++] = article;
            }
        }
        return result;
    }

    private boolean isPresent(int id){
        return id >= Article.FIRST_ID && id <= Article.LAST_ID ? articleArray[id] != null : false;
    }

}
