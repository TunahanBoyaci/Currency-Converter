package CurrencyConverter;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Press 1 to exchange 'TL' to 'USD'");
            System.out.println("Press 2 to exchange 'USD' to 'TL'");
            System.out.println("Press 3 to exchange 'TL' to 'EURO'");
            System.out.println("Press 4 to exchange 'EURO' to 'TL'");
            System.out.println("Press 0 to exchange EXIT");

            int myChoice = scanner.nextInt();
            scanner.nextLine();

            if (myChoice==0){
                System.out.println("Exiting the program...");
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("EXIT");
                break;
            }
            else if (myChoice==1){
                System.out.println("Enter TL amount: ");
                double inputTL = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(inputTL * 0.052 + " USD");
            }
            else if (myChoice==2){
                System.out.println("Enter USD amount: ");
                double inputUSD = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(inputUSD * 19.19 + " TL");
            }
            else if (myChoice==3){
                System.out.println("Enter TL amount: ");
                double inputTL = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(inputTL * 0.048 + " EURO");
            }
            else if (myChoice==4){
                System.out.println("Enter EURO amount: ");
                double inputEURO = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(inputEURO * 20.84 + " TL");
            }
            else {
                System.out.println("Please enter valid option.");
            }
        }

        while (true);
    }
}
