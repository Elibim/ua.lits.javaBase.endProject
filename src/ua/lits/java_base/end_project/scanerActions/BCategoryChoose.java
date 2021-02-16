package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.goods.Category;
import java.util.Scanner;

public class BCategoryChoose {
    public static void getCategory() {
        System.out.println("Please choose category by writing first & last letters of category " +
                "(fx. for fruits write fs) or x for previous menu... ");
        System.out.println(java.util.Arrays.asList(Category.values()));
        Scanner category = new Scanner(System.in);
        boolean exitCategory = false;
        while (!exitCategory) {
            String inputCategory = category.nextLine();
            switch (inputCategory) {
                case "x":
                    exitCategory = true;
                    break;
                case "fs":
                    System.out.println("Available fruits: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Fruits);
                    break;
                case "vs":
                    System.out.println("Available vegetables: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Vegetables);
                    break;
                case "mt":
                    System.out.println("Available meat: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Meat);
                    break;
                case "sd":
                    System.out.println("Available seafood: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Seafood);
                    break;
                case "dy":
                    System.out.println("Available dairy: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Dairy);
                    break;
                case "by":
                    System.out.println("Available bakery: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Bakery);
                    break;
                case "fn":
                    System.out.println("Available frozen: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Frozen);
                    break;
                case "rs":
                    System.out.println("Available ready meals: ");
                    CGoodsInCategory.getGoodsInCategory(Category.ReadyMeals);
                    break;
                case "ds":
                    System.out.println("Available drinks: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Drinks);
                    break;
                case "al":
                    System.out.println("Available alcohol: ");
                    CGoodsInCategory.getGoodsInCategory(Category.Alcohol);
                    break;
                default:
                    System.out.println("Wrong input. please check menu");
            }
        }
    }
}
