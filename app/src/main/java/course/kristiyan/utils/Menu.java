package course.kristiyan.utils;

import course.kristiyan.App;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.println("""
                ===Courier Console App===
                1. Create Shipment
                2. Track Shipment
                3. Mark Shipment as delivered
                4. Exit
                """);
    }

    public int getInt(String msg) {
        Integer option = null;
        while (option == null) {
            try {
                System.out.print(msg);
                option = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        return option;
    }

    public String getText(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }
}
