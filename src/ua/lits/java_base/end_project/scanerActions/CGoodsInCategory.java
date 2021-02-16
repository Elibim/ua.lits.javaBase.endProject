package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.goods.Category;
import ua.lits.java_base.end_project.goods.Goods;
import ua.lits.java_base.end_project.goods.GoodsDB;
import java.util.List;

public class CGoodsInCategory {
    public static void getGoodsInCategory(Category category) {
        List<Goods> goods = GoodsDB.getGoods();
        goods.stream()
                .filter(goods1 -> goods1.category.equals(category))
                .forEach(e -> System.out.println(
                        "Article No: " + e.getArticleNumber()
                                + ", Article name: " + e.getArticleName()
                                + ", Price: " + e.getPrice()
                                + ", Quantity on stock: " + e.getInStock()));
        DGoodsChoose.getGoods();
    }
}
