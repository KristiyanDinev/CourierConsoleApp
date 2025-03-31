package course.kristiyan.utils;

import course.kristiyan.App;

import java.util.Scanner;

public class Menu {

    public void printMenu() {
        App.logger.info("""
                ===Courier Console App===
                1. Create Shipment
                2. Track Shipment
                3. Mark Shipment as delivered
                4. Exit
                """);
    }

    public int getOption() {
        Scanner scanner = new Scanner(System.in);
        Integer option = null;
        while (option == null) {
            try {
                App.logger.info("Enter your option: ");
                option = scanner.nextInt();
            } catch (Exception e) {
                App.logger.warning(e.getMessage());
            }
        }
        scanner.close();
        return option;
    }

    public String getText(String msg) {
        Scanner scanner = new Scanner(System.in);
        App.logger.info(msg);
        String text = scanner.nextLine();
        scanner.close();
        return text;
    }
}
