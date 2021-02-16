package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.goods.Goods;
import ua.lits.java_base.end_project.goods.GoodsDB;

import java.util.List;
import java.util.Scanner;

public class DGoodsChoose {
    public static void getGoods() {
        Scanner goodsChoose = new Scanner(System.in);
        System.out.println("Choose article No (or 0 for category choose ... ): ");
        boolean exitGoods = false;
        while (!exitGoods) {
            String input = goodsChoose.nextLine();
            if (input.equals("0")) {
                BCategoryChoose.getCategory();
            } else {
                List<Goods> goods = GoodsDB.getGoods();
                goods.stream()
                        .filter(goods1 -> goods1.getArticleNumber().equals(input))
                        .forEach(e -> System.out.println(
                                "Article No: " + e.getArticleNumber()
                                        + ", Article name: " + e.getArticleName()
                                        + ", Price: " + e.getPrice()
                                        + ", Quantity on stock: " + e.getInStock()));
//                goodsChoose.next();
                System.out.println("and amount you wish to buy:");

            }
        }
    }
}
