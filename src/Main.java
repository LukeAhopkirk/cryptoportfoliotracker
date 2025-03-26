import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Portfolio portfolio = new Portfolio();

        System.out.println("Welcome to Crypto Portfolio Tracker!");

        while (true) {
            System.out.println("1. Add Crypto");
            System.out.println("2. Show Portfolio");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter crypto name: ");
                String name = scanner.nextLine();

                System.out.print("Enter quantity: ");
                double quantity = scanner.nextDouble();

                System.out.print("Enter price per unit: ");
                double pricePerUnit = scanner.nextDouble();

                portfolio.addAsset(new CryptoAsset(name, quantity, pricePerUnit));
                System.out.println("Crypto added successfully!");
            } else if (choice == 2) {
                portfolio.showPortfolio();
            } else {
                System.out.println("Exiting...");
                break;
            }
        }

        scanner.close();
    }
}
