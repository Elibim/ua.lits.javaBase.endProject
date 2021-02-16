package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.goods.Category;

public class BA {
    public static void getListOfArt() {
        System.out.println("Please choose category by writing first & last letters of category " +
                "(fx. for fruits write fs) or x for previous menu... ");
        System.out.println(java.util.Arrays.asList(Category.values()));
    }
}
