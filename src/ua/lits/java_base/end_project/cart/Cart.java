package ua.lits.java_base.end_project.cart;

import ua.lits.java_base.end_project.goods.Goods;
import ua.lits.java_base.end_project.scanerActions.DGoodsChoose;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static Cart INSTANCE;
    private List<Goods> goods = new ArrayList<Goods>();

    public static Cart getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Cart();
        }
        return INSTANCE;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setCart(List<Goods> goodsList) {
        this.goods = goodsList;
    }

    public void clearCart() {
        this.goods.clear();
    }

    public void addToCart(Goods good) {
        this.goods.add(good);

    }

    public void showCart() {
        this.goods.stream().forEach(e -> System.out.println(e.getArticleName()
                + ": " + e.getPrice()));
    }
}
