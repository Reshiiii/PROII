package FHDW.Models;

public class Article {
    private long id;
    private String name;
    private int onStock;
    private float salePrice;
    final public static int FIRST_ID = 100001;
    final public static int LAST_ID = 999999;
    public static int nextId = FIRST_ID;
    private Unit unit;

    public Article() {
    }

    public Article(long id, String name, float salePrice, Unit unit) {
        this.id = this.checkId(id);
        this.name = name;
        this.salePrice = salePrice;
        this.onStock = 0;
        this.unit = unit;
    }

    public Article(long id, String name, int onStock, float salePrice, Unit unit) {
        this.id = this.checkId(id);
        this.name = name;
        this.onStock = onStock;
        this.salePrice = salePrice;
        this.unit = unit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOnStock() {
        return onStock;
    }

    public void setOnStock(int onStock) {
        this.onStock = onStock;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    private long checkId(long id){
        if (id <= LAST_ID && id >= FIRST_ID){
            return id;
        }else{
            return 0;
        }

    }

    static public int getNoOfAvailableIds(){
        return LAST_ID - nextId + 1;
    }

    static public int getNoOfAssignedIds(){
        return nextId - FIRST_ID;
    }

    public boolean equals(Article article){
        return this.id == article.getId();
    }

    public Unit getUnit(){
        return this.unit;
    }

    public void setUnit (Unit unit){
        this.unit = unit;
    }

    public String toString(){
        //<Artikelbezeichnung< (<Artikelnummer>)
        //Bestand = <Bestand> Stück Preis
        //        = <Preis> Euro
        return "Artikelnummer:" + this.getId()
                + " Artikelbezeichnung:" + this.getName()
                + " Bestand:" + this.getOnStock()
                + " Einheit:" + this.getUnit()
                + " Preis pro Stück:" + this.getSalePrice()
                + " Lagerwert:" + this.getSalePrice()*this.onStock;
    }

}
