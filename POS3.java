/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Moises
 */
class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods for better encapsulation
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Cart {

    private ArrayList<Product> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to print cart contents
    public void printCart() {
        System.out.println("Cart Items:");
        for (Product product : items) {
            System.out.println("  - " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }
    
    
    public void emptyCart() {
        items.clear();
    }
}

public class POS3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cart cart = new Cart();

        // Define product list
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Shirt", 10));
        products.add(new Product("Jeans", 10.50));
        products.add(new Product("Hat", 12.95));
        products.add(new Product("Eyeglass", 10.00));
        // ... add more products

        // User interaction loop
        System.out.println("Point of Sale 1");
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("0. Exit");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Products:");
                    // Loop through the products list and display names with index (1-based)
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i).getName() + " ($" + products.get(i).getPrice() + ")");
                    }

                    System.out.print("Enter product number (or 0 to exit): ");
                    int productChoice = s.nextInt();

                    if (productChoice > 0 && productChoice <= products.size()) {
                        cart.addProduct(products.get(productChoice - 1));
                    } else if (productChoice == 0) {
                        break;
                    } else {
                        System.out.println("Invalid product number.");
                    }
                    break;
                case 2:
                    cart.printCart();
                    break;
                case 3:
                    System.out.println("Cart Items:");
                    cart.printCart();
                    double subtotal = cart.getTotalPrice();
                    double vatRate = 0.1; // 10% VAT

                    // Calculate VAT amount
                    double vatAmount = subtotal * vatRate;

                    // Calculate total price with VAT
                    double totalPrice = subtotal + vatAmount;

                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("VAT (10%): $" + String.format("%.2f", vatAmount));
                    System.out.println("Total: $" + String.format("%.2f", totalPrice));

                    System.out.println("Choose payment method:");
                    System.out.println("1. Cash");
                    System.out.println("2. Credit Card (Simulated)"); // Placeholder
                    int paymentChoice = s.nextInt();

                    if (paymentChoice == 1) { // Cash payment
                        System.out.print("Enter cash amount: $");
                        double cashTendered = s.nextDouble();
                        if (cashTendered >= totalPrice) {
                            double change = cashTendered - totalPrice;
                            System.out.println("Thank you for your purchase!");
                            System.out.println("Change due: $" + String.format("%.2f", change));
                            cart.emptyCart(); // Clear cart after successful purchase
                        } else {
                            System.out.println("Insufficient funds. Please try again.");
                        }
                    } else if (paymentChoice == 2) { // Simulated credit card payment
                        System.out.println("Simulating credit card processing...");
                        System.out.println("Payment successful!");
                        cart.emptyCart(); // Clear cart after successful purchase
                    } else {
                        System.out.println("Invalid payment method.");
                    }
                    break;
                  
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}


