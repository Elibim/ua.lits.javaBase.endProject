package ua.lits.java_base.end_project.goods;

import java.util.ArrayList;
import java.util.List;

public class GoodsDB {
    public static List<Goods> getGoods() {
        Goods fruitsOne = new Goods("01001", Category.Fruits, "Apple green", 15, 100);
        Goods fruitsTwo = new Goods("01002", Category.Fruits, "Apple red", 16, 50);

        Goods vegetablesOne = new Goods("02001", Category.Vegetables, "Carrot", 2, 43);

        Goods meatOne = new Goods("03001", Category.Meat, "Pork ham", 100, 58);

        Goods seaFoodOne = new Goods("04001", Category.Seafood, "Tuna steak", 350, 21);

        Goods dairyOne = new Goods("05001", Category.Dairy, "Milk 2.5%", 22, 200);

        Goods bakeryOne = new Goods("06001", Category.Bakery, "Bread with sunflower seeds", 24, 23);

        Goods frozenOne = new Goods("07001", Category.Frozen, "Frozen peas", 35, 16);

        Goods readyMealsOne = new Goods("08001", Category.ReadyMeals, "Lasagna", 53, 8);

        Goods drinksOne = new Goods("09001", Category.Drinks, "Apple juce", 38, 73);

        Goods alcoholOne = new Goods("10001", Category.Alcohol, "Tequila", 380, 5);

        List<Goods> goods = new ArrayList<>();
        goods.add(fruitsOne);
        goods.add(fruitsTwo);

        goods.add(vegetablesOne);

        goods.add(meatOne);

        goods.add(seaFoodOne);

        goods.add(dairyOne);

        goods.add(bakeryOne);

        goods.add(frozenOne);

        goods.add(readyMealsOne);

        goods.add(drinksOne);

        goods.add(alcoholOne);

        return goods;
    }
}

