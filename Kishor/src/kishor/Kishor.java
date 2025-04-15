/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kishor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kishor Mohan
 */
public class Kishor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();
        double totalPrice = 0.0;
        boolean shopping = true;

        System.out.println("Welcome to the Shopping Cart System!");
        System.out.println("=====================================");

        while (shopping) {
            System.out.println("\nMenu:");
            System.out.println("1. Add item");
            System.out.println("2. View cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the name of the item: ");
                    String item = scanner.nextLine();
                    System.out.print("Enter the price of the item: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline
                    cart.add(item);
                    totalPrice += price;
                    System.out.println(item + " added to the cart for $" + price + ".");
                }
                case 2 -> {
                    System.out.println("\nYour Cart:");
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println((i + 1) + ". " + cart.get(i));
                        }
                        System.out.printf("Total Price: $%.2f%n", totalPrice);
                    }
                }
                case 3 -> {
                    System.out.println("\nChecking out...");
                    System.out.println("Items Purchased:");
                    for (String item : cart) {
                        System.out.println("- " + item);
                    }
                    System.out.printf("Total Price: $%.2f%n", totalPrice);
                    System.out.println("Thank you for shopping with us!");
                    shopping = false;
                }
                case 4 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    shopping = false;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
