/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pizzamanager;

import java.util.Scanner;
import java.util.ArrayList;

public class PizzaManager {
        static Scanner scan = new Scanner(System.in);
        static int total = 0, choice = 0;
        static ArrayList<String> order = new ArrayList<>();
        static ArrayList<Integer> orderPrice = new ArrayList<>();
    public static void main(String[] args) {
        getSize();
        getToppings();
        checkout();
    }
    
    public static void getSize() {
        while(true) {
            System.out.println("Welcome to Pizza Manager");
            System.out.println("Select Pizza Size");
            System.out.println("[1] Small       - $5");
            System.out.println("[2] Medium      - $10");
            System.out.println("[3] Large       - $16");
            System.out.println("[3] Extra Large - $18");
            System.out.println();
            System.out.print(">>> ");
            
            if(scan.hasNextInt()) {
                choice = scan.nextInt();
                scan.nextLine();
                break;
            } else {
                scan.nextLine();
                System.out.println("Invalid choice.");
            }
        }
        
        switch(choice) {
            case 1:
                order.add("Small");
                orderPrice.add(5);
                total += 5;
                break;
            case 2:
                order.add("Medium");
                orderPrice.add(10);
                total += 10;
                break;
            case 3:
                order.add("Large");
                orderPrice.add(16);
                total += 16;
                break;
            case 4:
                order.add("Extra Large");
                orderPrice.add(18);
                total += 18;
                break;
            default:
                System.out.println("Please choose from the menu.");
                getSize();
        }
    }
    
    public static void getToppings() {
        while(true) {
            System.out.println("Choose your toppings");
            System.out.printf("[1] %-15s --- $%d%n", "Pepperoni", 2);
            System.out.printf("[2] %-15s --- $%d%n", "Sausage", 2);
            System.out.printf("[3] %-15s --- $%d%n", "Bacon", 3);
            System.out.printf("[4] %-15s --- $%d%n", "Ham", 3);
            System.out.printf("[5] %-15s --- $%d%n", "Chicken", 2);
            System.out.printf("[6] %-15s --- $%d%n", "Mushrooms", 1);
            System.out.printf("[7] %-15s --- $%d%n", "Onions", 1);
            System.out.printf("[8] %-15s --- $%d%n", "Green Peppers", 1);
            System.out.printf("[9] %-15s --- $%d%n", "Black Olives", 1);
            System.out.printf("[10] %-15s --- $%d%n", "Pineapple", 2);
            System.out.printf("[11] %-15s --- $%d%n", "Extra Cheese", 2);
            System.out.print(">>> ");
            
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
                scan.nextLine();
                break;
            } else {
                scan.nextLine();
                System.out.println("Please choose from the menu.");
            }
        }
        
        switch(choice) {
            case 1:
                order.add("Pepperoni");
                orderPrice.add(2);
                total += 2;
                break;
            case 2:
                order.add("Sausage");
                orderPrice.add(2);
                total += 2;
                break;
            case 3:
                order.add("Bacon");
                orderPrice.add(3);
                total += 3;
                break;
            case 4:
                order.add("Ham");
                orderPrice.add(3);
                total += 3;
                break;
            case 5:
                order.add("chicken");
                orderPrice.add(2);
                total += 2;
                break;
            case 6:
                order.add("Mushrooms");
                orderPrice.add(1);
                total += 1;
                break;
            case 7:
                order.add("Onions");
                orderPrice.add(1);
                total += 1;
                break;
            case 8:
                order.add("Green Peppers");
                orderPrice.add(1);
                total += 1;
                break;
            case 9:
                order.add("Black Olives");
                orderPrice.add(1);
                total += 1;
                break;
            case 10:
                order.add("Pineapples");
                orderPrice.add(2);
                total += 2;
                break;
            case 11:
                order.add("Extra Cheese");
                orderPrice.add(2);
                total += 2;
                break;
            default:
                System.out.println("Invalid choice.");
                getToppings();
        }
            
        System.out.print("Would you like to add more toppings? y/n: ");
        String check = scan.nextLine();

        if (check.equals("y")) {                  // correct string comparison
            getToppings();
        }

    }
    
    public static void checkout() {
        for(int i = 0; i < order.size(); i++) {
            System.out.printf("%-15s --- $%d%n", order.get(i), orderPrice.get(i));
        }
        
        System.out.println("Your Total is: " + total);
    }
}
