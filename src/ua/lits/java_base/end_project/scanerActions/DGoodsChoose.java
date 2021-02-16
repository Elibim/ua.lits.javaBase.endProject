package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.goods.Goods;
import ua.lits.java_base.end_project.goods.GoodsDB;

import java.util.List;
import java.util.Scanner;

public class DGoodsChoose {
    public static void getGoods() {
        Scanner goodsChoose = new Scanner(System.in);
        System.out.println("Choose article NO (or 0 for category choose ... ): ");
        boolean exitGoods = false;
        while (!exitGoods) {
            int input = goodsChoose.nextInt();
            if (input == 0) {
                BA.getListOfArt();
            } else {
                List<Goods> goods = GoodsDB.getGoods();
                goods.stream()
                        .filter(goods2 -> goods2.getArticleNumber().equals(input))
                        .forEach(e -> System.out.println(
                                "Article No: " + e.getArticleNumber()
                                        + ", Article name: " + e.getArticleName()
                                        + ", Price: " + e.getPrice()
                                        + ", Quantity on stock: " + e.getInStock()));
            }
        }
    }
}
