package ua.lits.java_base.end_project.scanerActions;

import ua.lits.java_base.end_project.wallet.Wallet;
import java.util.Scanner;
public class AMoreMoney {
    public static void getMoreMoney() {
        System.out.println("Welcome in  our online store. ");

        Wallet wallet = new Wallet();

        Scanner welcome = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("You have " + wallet.getWallet() + " UAH in your wallet. ");
            System.out.println("Please insert some more money (write amount) or \nn for next menu \n0 for exit...");
            if (welcome.hasNextInt()) {
                int input = welcome.nextInt();
                if (input == 0) {
                    exit = true;
                    System.out.println("Bye!");
                } else if (input > 0) {
                    wallet.setWallet(wallet.getWallet() + input);
                    System.out.println("Congratulations! " + input + " UAH is added to your wallet. Now you have "
                            + (wallet.getWallet() + " UAH"));
                    BCategoryChoose.getCategory();
                } else {
                    System.out.println("Wrong input. Please check menu!!!");
                }
            } else if (welcome.hasNextLine()) {
                String input = welcome.nextLine();
                if (input.equals("admin")) {
                    AdminA.getAdminMenu();
                } else if (input.equals("n")) {
                    BCategoryChoose.getCategory();
                } else {
                    System.out.println("Check menu again!!!");
                }
            }
        }
    }
}
