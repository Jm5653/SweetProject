import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        System.out.println("Please enter your name: ");

        Scanner scanner = new Scanner(System.in);
        String customer = scanner.nextLine();

        System.out.println("\nWelcome to the Bank.App, " + customer + "!");

        System.out.println("\nIf you would NOT like to see the Examples I made, click this button: ");

        //Button.


        {
            int a = 5000;
            double b = 500.00;

            System.out.println("This is the total of your two bank accounts:");
            {
                System.out.println(a + b);

            }

            {
                int d = 500000;

                System.out.println("Lets see how much money is in my bank account.\n");
                System.out.println("The total amount of money in your bank account is:");
                System.out.println(d);

            }

            {
                double e = 500000.00;
                double f = 50236.75;
                double g = e - f;

                System.out.println("Lets say I withdrew 50236.75 units from my bank account. " +
                        "How much Money do I have now? \n");
                System.out.println("The total amount of money you withdrew is:");
                String message = "500000 - " + f;
                System.out.println(message);
                System.out.println("This amount should be:\n" + g);

                System.out.println("\nSystem printing amount... \n");

                System.out.println("This is how much money you have in your bank account:");
                System.out.println(g);
            }

        }


    }

}



