package DevPackage;

import java.util.Scanner;

public class Service {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("What do you want to do? (buy, see)");
        String choice = scanner.nextLine();
        switch (choice) {
            case "buy" -> {
                String need = scanner.nextLine();
                Buy.buy(need);
            }
            case "see" -> Warehouse.see();
            default -> {
                System.out.println("Invalid Entry!");
            }
        }
    }

    public static void anotherBuy() {
        System.out.println("Do you want to buy another thing? (yes or no)");
        String choice = scanner.nextLine();
        switch (choice) {
            case "yes" -> Service.menu();
            default -> System.exit(0);
        }
    }
}
