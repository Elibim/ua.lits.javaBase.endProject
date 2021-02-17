package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.cart.Cart;
import ua.lits.java_base.end_project.goods.Category;
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
                System.out.println("Please choose category by writing first & last letters of category " +
                        "(fx. for fruits write fs) or x for start menu... ");
                System.out.println(java.util.Arrays.asList(Category.values()));
                exitGoods = true;
//                BCategoryChoose.getCategory();
                goodsChoose.next();
            } else {
                boolean exitAmount = false;
                while (!exitGoods) {
                    if ("0".equals(input)) {
                        exitAmount = true;
                    } else if ("c".equals(input)) {
                        Cart.getInstance().showCart();
                    } else {
                        List<Goods> goods = GoodsDB.getGoods();
                        Goods selected = goods.stream()
                                .filter(goods1 -> goods1.getArticleNumber().equals(input)).findFirst().get();
                        System.out.println("Article No: " + selected.getArticleNumber()
                                        + ", Article name: " + selected.getArticleName()
                                        + ", Price: " + selected.getPrice()
                                        + ", Quantity on stock: " + selected.getInStock());
                        System.out.println("Select amount or 0 for previous menu:");
                        int input2 = goodsChoose.nextInt();
                        if (input2 > 0 && input2 < selected.getInStock()) {
                            System.out.println(selected.getArticleName()
                                            + ": " + selected.getPrice()
                                            + "x" + input2 + " Total: " + selected.getPrice() * input2);
                            Cart instance = Cart.getInstance();
                            instance.addToCart(selected);
                        }
                    }
                }
            }
        }
    }
}
