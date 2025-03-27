import java.util.Scanner;
import io.github.cdimascio.dotenv.Dotenv;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Portfolio portfolio = new Portfolio();
        Dotenv dotenv = Dotenv.load();
        CoinMarketCap cmc = new CoinMarketCap(dotenv.get("CMC_API_KEY"));

        System.out.println("Welcome to Crypto Portfolio Tracker!");

        while (true) {
            System.out.println("1. Add Crypto");
            System.out.println("2. Show Portfolio");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter crypto ticker: ");
                String name = scanner.nextLine();

                System.out.print("Enter quantity: ");
                double quantity = scanner.nextDouble();

                System.out.print("Enter fiat currency: ");
                String currency = scanner.nextLine();

                System.out.print("Enter price per unit you paid: ");
                double pricePerUnit = scanner.nextDouble();

                portfolio.addAsset(new CryptoAsset(name, quantity, pricePerUnit, cmc, currency));
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
