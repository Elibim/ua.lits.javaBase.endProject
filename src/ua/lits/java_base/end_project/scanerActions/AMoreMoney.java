package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.wallet.Wallet;
import java.util.Scanner;
// https://stackoverflow.com/questions/2496239/how-do-i-keep-a-scanner-from-throwing-exceptions-when-the-wrong-type-is-entered
public class AMoreMoney {
    public static void getMoreMoney() {
        System.out.println("Welcome in  our online store. ");

        Wallet wallet = new Wallet();

        Scanner welcome = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("You have " + wallet.getWallet() +
                    " UAH in your wallet. \nPlease insert some more money (write amount) or 0 for exit...");
            int input = welcome.nextInt();
//            try {
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
                    BCategoryChoose.getCategory();
                } else {
                    System.out.println("Please check menu!!!");
                }
        }
    }
}
