package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.goods.Goods;
import ua.lits.java_base.end_project.goods.GoodsDB;

import java.util.List;
import java.util.Scanner;

public class EAmount {
    public static void getAmount() {
        Scanner amount = new Scanner(System.in);
        System.out.println("Select amount:");
        boolean exitAmount = false;
        while (!exitAmount) {
            int input = amount.nextInt();
            if (input == 0){
            }
        }
    }
}
