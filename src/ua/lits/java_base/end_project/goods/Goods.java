package ua.lits.java_base.end_project.goods;

public class Goods {

    private String articleNumber;
    public Category category;
    private String articleName;
    private double price;
    private long inStock;

    public Goods(String articleNumber, Category category, String articleName, double price, long inStock) {
        this.articleNumber = articleNumber;
        this.category = category;
        this.articleName = articleName;
        this.price = price;
        this.inStock = inStock;
    }
    public String getArticleNumber() {
        return articleNumber;
    }
    public String getArticleName() {
        return articleName;
    }
    public double getPrice() {
        return price;
    }
    public long getInStock() {
        return inStock;
    }
    public void setInStock(long inStock) {
        this.inStock = inStock;
    }
}
