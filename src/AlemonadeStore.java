import java.util.Scanner;

public class AlemonadeStore {

        int initialBalance;

        public AlemonadeStore(int initialBalance) {
        this.initialBalance = initialBalance;
    }

        public static void main(String[] args) {
        String LINE = "---------------------------------------------------------------------------------";

        AlemonadeStore savings = new AlemonadeStore(10);
        System.out.println("Please enter your name: ");


        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //Credits
        System.out.println("\nHello " + name + ".");
        System.out.println("\nI am assuming your here to buy some lemonade.");
        System.out.println("\nYour current balance of lemonade credits is: " + savings.initialBalance);
        System.out.println("\n (1 lemonade costs 1 credit) \n");

        System.out.println(LINE);

        //Purchase of lemonades
        System.out.println("Please enter how much lemonade(s) you'd like to buy.");
        Scanner scanner1 = new Scanner(System.in);
        String lemonade_Sold = scanner1.nextLine();

        System.out.println(LINE);

        //Price statement
        System.out.println("You have chosen to buy " + lemonade_Sold + " lemonade(s).");
        System.out.println("\nThe cost of your lemonade(s) will be: ");
        System.out.println(lemonade_Sold + " credits.");

        System.out.println(LINE);

        //Calculator
        System.out.println("The system is working out your total. ");
        System.out.println("\n(Number of credits - Number of lemonade(s) you want to buy.)");

        int balanceLeft = savings.initialBalance - Integer.parseInt(lemonade_Sold);

        System.out.println(LINE);

        //Number of credits left
        System.out.println("Ok " + name + ", you have " + balanceLeft + " credits left.");

        System.out.println(LINE);

        //Regards
        System.out.println("Thank you, " + name + " for buying lemonade at our Lemonade Shop!");


    }


}
