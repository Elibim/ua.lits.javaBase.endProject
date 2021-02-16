package ua.lits.java_base.end_project.goods;

import java.util.ArrayList;
import java.util.List;

public class GoodsDB {
    public static List<Goods> getGoods() {
        Goods fruitsOne = new Goods("01001", Category.Fruits, "Apple green", 15.7, 100);
        Goods fruitsTwo = new Goods("01002", Category.Fruits, "Apple red", 16, 50);
        Goods fruitsThree = new Goods("01003", Category.Fruits, "Pear", 20, 65);
        Goods fruitsFour = new Goods("01004", Category.Fruits, "Banana", 10, 80);
        Goods fruitsFive = new Goods("01005", Category.Fruits, "Avocado", 15, 20);
        Goods fruitsSix = new Goods("01006", Category.Fruits, "Cherry", 12, 200);
        Goods fruitsSeven = new Goods("01007", Category.Fruits, "Pineapple", 60, 40);
        Goods fruitsEight = new Goods("01008", Category.Fruits, "Watermelon", 35, 50);
        Goods fruitsNine = new Goods("01009", Category.Fruits, "Grapes green", 25, 200);
        Goods fruitsTen = new Goods("01010", Category.Fruits, "Grapes red", 20, 150);

        Goods vegetablesOne = new Goods("02001", Category.Vegetables, "Carrot", 2, 43);
        Goods vegetablesTwo = new Goods("02002", Category.Vegetables, "Avocado", 3, 60);
        Goods vegetablesThree = new Goods("02003", Category.Vegetables, "Potato", 2, 100);
        Goods vegetablesFour = new Goods("02004", Category.Vegetables, "Cucumber", 12, 75);
        Goods vegetablesFive = new Goods("02005", Category.Vegetables, "Eggplant", 5, 15);
        Goods vegetablesSix = new Goods("02006", Category.Vegetables, "Cabbage", 10, 30);
        Goods vegetablesSeven = new Goods("02007", Category.Vegetables, "Broccoli", 15, 45);
        Goods vegetablesEight = new Goods("02008", Category.Vegetables, "Onion", 2, 100);
        Goods vegetablesNine = new Goods("02009", Category.Vegetables, "Pepper", 10, 150);
        Goods vegetablesTen = new Goods("02010", Category.Vegetables, "Tomato", 5, 100);

        Goods meatOne = new Goods("03001", Category.Meat, "Pork ham", 100, 58);
        Goods meatTwo = new Goods("03002", Category.Meat, "Filet Mignon", 85, 30);
        Goods meatThree = new Goods("03003", Category.Meat, "Lamb Chop", 65, 40);
        Goods meatFour = new Goods("03004", Category.Meat, "Fresh Ground Veal", 80, 60);
        Goods meatFive = new Goods("03005", Category.Meat, "Calf's Liver", 120, 45);
        Goods meatSix = new Goods("03006", Category.Meat, "Veal Stew Meat", 140, 39);
        Goods meatSeven = new Goods("03007", Category.Meat, "Chicken", 60, 100);
        Goods meatEight = new Goods("03008", Category.Meat, "Culver Duck", 95, 70);
        Goods meatNine = new Goods("03009", Category.Meat, "Turkey", 100, 60);
        Goods meatTen = new Goods("03010", Category.Meat, "Ground Meat", 150, 15);

        Goods seaFoodOne = new Goods("04001", Category.Seafood, "Tuna steak", 350, 21);
        Goods seaFoodTwo = new Goods("04002", Category.Seafood, "Crab Legs", 300, 30);
        Goods seaFoodThree = new Goods("04003", Category.Seafood, "Lobster", 400, 20);
        Goods seaFoodFour = new Goods("04004", Category.Seafood, "Mussel", 330, 25);
        Goods seaFoodFive = new Goods("04005", Category.Seafood, "Oyster", 35, 100);
        Goods seaFoodSix = new Goods("04006", Category.Seafood, "Salmon", 265, 45);
        Goods seaFoodSeven = new Goods("04007", Category.Seafood, "Shrimp", 210, 30);
        Goods seaFoodEight = new Goods("04008", Category.Seafood, "Canned Fish", 50, 120);
        Goods seaFoodNine = new Goods("04009", Category.Seafood, "Cooked Octopus", 400, 10);
        Goods seaFoodTen = new Goods("04010", Category.Seafood, "CrabSticks", 47, 50);

        Goods dairyOne = new Goods("05001", Category.Dairy, "Milk 2.5%", 22, 200);
        Goods dairyTwo = new Goods("05002", Category.Dairy, "Milk 1%", 22, 250);
        Goods dairyThree = new Goods("05003", Category.Dairy, "Yogurt", 33, 60);
        Goods dairyFour = new Goods("05004", Category.Dairy, "MIlka biscuit", 13, 130);
        Goods dairyFive = new Goods("05005", Category.Dairy, "Kefir 2.5%", 26, 50);
        Goods dairySix = new Goods("05006", Category.Dairy, "Kefir low-fat", 25, 50);
        Goods dairySeven = new Goods("05007", Category.Dairy, "Cream cheese", 45, 40);
        Goods dairyEight = new Goods("05008", Category.Dairy, "Margarine", 27, 25);
        Goods dairyNine = new Goods("05009", Category.Dairy, "Butter", 35, 15);
        Goods dairyTen = new Goods("05010", Category.Dairy, "Egg", 1, 300);

        Goods bakeryOne = new Goods("06001", Category.Bakery, "Bread with sunflower seeds", 24, 23);
        Goods bakeryTwo = new Goods("06002", Category.Bakery, "Bread basic", 20, 28);
        Goods bakeryThree = new Goods("06003", Category.Bakery, "Baguette", 9, 15);
        Goods bakeryFour = new Goods("06004", Category.Bakery, "Pie", 150, 5);
        Goods bakeryFive = new Goods("06005", Category.Bakery, "Bun", 8, 12);
        Goods bakerySix = new Goods("06006", Category.Bakery, "Cookies", 32, 45);
        Goods bakerySeven = new Goods("06007", Category.Bakery, "Cake", 170, 8);
        Goods bakeryEight = new Goods("06008", Category.Bakery, "Chocolate Cupcake", 20, 18);
        Goods bakeryNine = new Goods("06009", Category.Bakery, "Swiss Roll", 10, 30);
        Goods bakeryTen = new Goods("06010", Category.Bakery, "Pelmeni", 38, 40);

        Goods frozenOne = new Goods("07001", Category.Frozen, "Frozen peas", 35, 16);
        Goods frozenTwo = new Goods("07002", Category.Frozen, "Vanilla Ice Cream", 40, 25);

        Goods readyMealsOne = new Goods("08001", Category.ReadyMeals, "Lasagna", 53, 8);

        Goods drinksOne = new Goods("09001", Category.Drinks, "Apple juice", 38, 73);
        Goods drinksTwo = new Goods("09002", Category.Drinks, "Orange juice", 28, 75);
        Goods drinksThree = new Goods("09003", Category.Drinks, "Tomato Juice", 30, 85);
        Goods drinksFour = new Goods("09004", Category.Drinks, "Mineral Water", 10, 80);
        Goods drinksFive = new Goods("09005", Category.Drinks, "Fanta", 22, 95);
        Goods drinksSix = new Goods("09006", Category.Drinks, "Pepsi", 30, 119);
        Goods drinksSeven = new Goods("09007", Category.Drinks, "Coca-Cola", 30, 120);
        Goods drinksEight = new Goods("09008", Category.Drinks, "Zhivchik", 8, 56);
        Goods drinksNine = new Goods("09009", Category.Drinks, "Lemonade", 20, 30);
        Goods drinksTen = new Goods("09010", Category.Drinks, "Energy Drink", 26, 15);

        Goods alcoholOne = new Goods("10001", Category.Alcohol, "Tequila", 380, 5);
        Goods alcoholTwo = new Goods("10002", Category.Alcohol, "Beer", 45, 15);
        Goods alcoholThree = new Goods("10003", Category.Alcohol, "Red Wine", 75, 20);
        Goods alcoholFour = new Goods("10004", Category.Alcohol, "White Wine", 77, 15);
        Goods alcoholFive = new Goods("10005", Category.Alcohol, "Champagne", 120, 8);
        Goods alcoholSix = new Goods("10006", Category.Alcohol, "Cognac", 165, 5);
        Goods alcoholSeven = new Goods("10007", Category.Alcohol, "Vodka", 70, 2);
        Goods alcoholEight = new Goods("10008", Category.Alcohol, "Whiskey", 330, 0);
        Goods alcoholNine = new Goods("10009", Category.Alcohol, "Cider", 20, 30);
        Goods alcoholTen = new Goods("10010", Category.Alcohol, "Sake", 120, 0);

        List<Goods> goods = new ArrayList<>();
        goods.add(fruitsOne);
        goods.add(fruitsTwo);
        goods.add(fruitsThree);
        goods.add(fruitsFour);
        goods.add(fruitsFive);
        goods.add(fruitsSix);
        goods.add(fruitsSeven);
        goods.add(fruitsEight);
        goods.add(fruitsNine);
        goods.add(fruitsTen);

        goods.add(vegetablesOne);
        goods.add(vegetablesTwo);
        goods.add(vegetablesThree);
        goods.add(vegetablesFour);
        goods.add(vegetablesFive);
        goods.add(vegetablesSix);
        goods.add(vegetablesSeven);
        goods.add(vegetablesEight);
        goods.add(vegetablesNine);
        goods.add(vegetablesTen);

        goods.add(meatOne);
        goods.add(meatTwo);
        goods.add(meatThree);
        goods.add(meatFour);
        goods.add(meatFive);
        goods.add(meatSix);
        goods.add(meatSeven);
        goods.add(meatEight);
        goods.add(meatNine);
        goods.add(meatTen);

        goods.add(seaFoodOne);
        goods.add(seaFoodTwo);
        goods.add(seaFoodThree);
        goods.add(seaFoodFour);
        goods.add(seaFoodFive);
        goods.add(seaFoodSix);
        goods.add(seaFoodSeven);
        goods.add(seaFoodEight);
        goods.add(seaFoodNine);
        goods.add(seaFoodTen);

        goods.add(dairyOne);
        goods.add(dairyTwo);
        goods.add(dairyThree);
        goods.add(dairyFour);
        goods.add(dairyFive);
        goods.add(dairySix);
        goods.add(dairySeven);
        goods.add(dairyEight);
        goods.add(dairyNine);
        goods.add(dairyTen);

        goods.add(bakeryOne);
        goods.add(bakeryTwo);
        goods.add(bakeryThree);
        goods.add(bakeryFour);
        goods.add(bakeryFive);
        goods.add(bakerySix);
        goods.add(bakerySeven);
        goods.add(bakeryEight);
        goods.add(bakeryNine);
        goods.add(bakeryTen);

        goods.add(frozenOne);
        goods.add(frozenTwo);

        goods.add(readyMealsOne);

        goods.add(drinksOne);
        goods.add(drinksTwo);
        goods.add(drinksThree);
        goods.add(drinksFour);
        goods.add(drinksFive);
        goods.add(drinksSix);
        goods.add(drinksSeven);
        goods.add(drinksEight);
        goods.add(drinksNine);
        goods.add(drinksTen);

        goods.add(alcoholOne);
        goods.add(alcoholTwo);
        goods.add(alcoholThree);
        goods.add(alcoholFour);
        goods.add(alcoholFive);
        goods.add(alcoholSix);
        goods.add(alcoholSeven);
        goods.add(alcoholEight);
        goods.add(alcoholNine);
        goods.add(alcoholTen);

        return goods;
    }
}

