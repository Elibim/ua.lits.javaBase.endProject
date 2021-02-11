package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.goods.Category;
import ua.lits.java_base.end_project.wallet.Wallet;
import java.util.Scanner;

public class AMoreMoney {
    public static void getMoreMoney() {
        Wallet wallet = new Wallet();

        Scanner welcome = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome in  our online store. \nYou have " + wallet.getWallet() +
                    " UAH in your wallet. \nPlease insert some more money (write amount) or 0 for exit...");
            int input = 0;
//            try {
                input = welcome.nextInt();
//            }
//            catch (Exception e) {
//                System.out.println("Please read menu again!");
//            }
                if (input == 0) {
                    exit = true;
                    System.out.println("Bye!");
                } else if (input > 0) {
                    wallet.setWallet(wallet.getWallet() + input);
                    System.out.println("Congratulations! " + input + " is added to your wallet. Now you have "
                            + (wallet.getWallet() + " UAH"));
                    System.out.println("Please choose category by writing first & last letters of category " +
                            "(fx. for fruits write fs) or x for previous menu... ");
                    System.out.println(java.util.Arrays.asList(Category.values()));

                    BCategoryChoose.getCategory();
                } else {
                    System.out.println("Please check menu!!!");
                }
        }
    }
}
