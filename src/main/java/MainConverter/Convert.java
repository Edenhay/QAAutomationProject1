package MainConverter;

import CoinsPack.ILS;
import CoinsPack.USD;
import Results.resultList;

import java.util.Scanner;

public class Convert implements resultList {
    public static void convert() {
        String choice;
        do {
            System.out.println("Please choose an option (1/2): \n 1. Dollars to Shekels. \n 2. Shekels to Dollars.");
            Scanner input = new Scanner(System.in);
            char UserCoin = input.next().charAt(0);

            while (UserCoin != 49 && UserCoin != 50) {
                System.out.println("Invalid choice, Please try again");
                System.out.println("Please choose an option (1/2): \n 1. Dollars to Shekels. \n 2. Shekels to Dollars.");
                UserCoin = input.next().charAt(0);
            }

            Scanner AmountSc = new Scanner(System.in);
            System.out.println("Please enter an amount to convert: ");

            while(!AmountSc.hasNextDouble()) {
                System.out.println("Invalid choice, Please try again");
                System.out.println("Please enter an amount to convert: ");
                AmountSc.nextLine();
            }
            double Amount = AmountSc.nextDouble();

            switch (UserCoin) {
                case '1' -> {
                    double usdValue = new USD().calculate(Amount);
                    System.out.println(usdValue);
                    ResultList.add(usdValue);
                }
                case '2' -> {
                    double ilsValue = new ILS().calculate(Amount);
                    System.out.println(ilsValue);
                    ResultList.add(ilsValue);
                }
            }

            System.out.println("Do you want to use the Currency Converter again? Y/N");
            choice = input.next();
            while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) {
                System.out.println("Invalid choice, Please try again \n MainConverter.Convert again ? Y/N");
                choice = input.next();
            }
            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Thanks for using our currency converter.");
            }
        }
        while (choice.equalsIgnoreCase("Y") );
    }

}
