import java.io.*;
import java.util.*;


public class MainC {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> ResultList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter");

        String choice;

        do {
            System.out.println("Please choose an option (1/2): \n 1. Dollars to Shekels. \n 2. Shekels to Dollars.");
            char UserCoin = input.next().charAt(0);
            while (UserCoin != 49 && UserCoin != 50) {
            System.out.println("Invalid choice, Please try again");
            System.out.println("Please choose an option (1/2): \n 1. Dollars to Shekels. \n 2. Shekels to Dollars.");
            UserCoin = input.next().charAt(0);
            }

            switch (UserCoin) {
                case '1' -> {
                    System.out.println("Please enter an amount to convert: ");
                    double ilsAmount = input.nextDouble();
                    double usdValue = new USD().calculate(ilsAmount);
                    System.out.println(usdValue);
                    ResultList.add(usdValue);
                }
                case '2' -> {
                    System.out.println("Please enter an amount to convert: ");
                    double usdAmount = input.nextDouble();
                    double ilsValue = new ILS().calculate(usdAmount);
                    System.out.println(ilsValue);
                    ResultList.add(ilsValue);
                }
            }

            System.out.println("Do you want to use the Currency Converter again? Y/N");
            choice = input.next();
            while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) {
                System.out.println("Invalid choice, Please try again");
                System.out.println("Convert again ? Y/N");
                choice = input.next();
            }
            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Thanks for using our currency converter.");
            }
        }
        while (choice.equalsIgnoreCase("Y") );

        System.out.println(ResultList);
        File myObj = new File("C:\\Users\\עדן ח\\Desktop\\Qa automation\\results.txt");
        FileWriter myWriter = new FileWriter(myObj);
        myWriter.write(String.valueOf(ResultList));
        myWriter.close();
    }
}

