/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

public class shoppingPlanner {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        int budget = 0, choice = 0;
        
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();
        
        while(true) {
            while(true) {
                System.out.println("Welcome to Shopping Planner");
                System.out.println("Balance: " + budget);
                System.out.println(" ");
                System.out.println("[0] Input Budget");
                System.out.println("[1] Add Item");
                System.out.println("[2] Remove Item");
                System.out.println("[3] Checkout");
                System.out.println("[4] Exit Program");
                System.out.println(" ");
                System.out.print(">>> ");
                if(scan.hasNextInt()) {
                    choice = scan.nextInt();
                    scan.nextLine();
                    break;
                } else {
                    for (int i = 0; i < 50; ++i) {
                        System.out.println(); // Using this to simulate clear screen
                    }
                    System.out.println("Please choose from the itens shown.");
                    scan.nextLine();
                }
            }
            
            switch(choice) {
                case 0:
                    budget = inputBudget();
                    break;
                case 1:
                    addItem(items, prices);
                    break;
                case 2:
                    if(items.size() <= 0) {
                        System.out.println();
                        System.out.println("No items to remove.");
                    } else
                        removeItem(items, prices);
                    break;
                case 3:
                    getReceipt(budget, items, prices);
                    break;
                case 4:
                    System.exit(0);
                default:
                    for (int i = 0; i < 50; ++i) {
                        System.out.println(); // Using this to simulate clear screen
                    }
                    System.out.println("Please choose from the items shown.");
            }
        }

    }
    
    public static int inputBudget() {
        int budget = 0;
        while(true) {
            for(int i = 0; i < 50; i++) {
                System.out.println();
            }
            System.out.print("Enter amount: ");
            if (scan.hasNextInt()) {
                budget = scan.nextInt();
                scan.nextLine();
                for(int i = 0; i < 50; i++) {
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Not a valid integer, Try again");
                scan.nextLine();
            }
        }
        return budget;
    }
    
    public static void addItem(ArrayList<String> items, ArrayList<Integer> prices) {        
        while(true) {
            System.out.println();
            System.out.print("Item Name: ");
            String name = scan.nextLine();
            items.add(name);

            while (true) {
                System.out.print("Item Price: ");
                if (scan.hasNextInt()) {
                    int price = scan.nextInt();
                    prices.add(price);
                    scan.nextLine();
                    break;
                } else {
                    System.out.println();
                    System.out.println("Not a valid integer, try again.");
                    scan.nextLine(); // discard the invalid input
                }
            }
            System.out.println("Item " + name + " Added");
            
            while(true) {
                
                System.out.print("Add another item? y/n: ");
                String choice = scan.nextLine();
                char ch = choice.charAt(0);
                if (ch == 'y') {
                    break;
                } else if (ch == 'n') {
                    for(int i = 0; i < 50; i++) {
                        System.out.println();
                    }
                    return;
                } else
                    System.out.println("Please choose either 'y' or 'n'");
            }
        }
    }
    
    public static void removeItem(ArrayList<String> items, ArrayList<Integer> prices) {
        while(true) {
            if (items.size() <= 0) {
                for(int i = 0; i < 50; i++) {
                    System.out.println();
                }
                System.out.println("No items to remove.");
                System.out.println("Returning to Main Menu...");
                return;
            }
            
            for(int i = 0; i < items.size(); i++) {
                System.out.println("[" + i + "]"+" Item: "+items.get(i) + " ");
            }
            while(true) {
                System.out.print("Which item do you want to remove: ");
                if (scan.hasNextInt()) {
                    int item = scan.nextInt();
                    if(item >= 0 && item < items.size()) {
                        items.remove(item);
                        prices.remove(item);
                        scan.nextLine();
                        break;
                    } else {
                        System.out.println("Invalid choice, Try again");
                        scan.nextLine();
                    }
                } else {
                    System.out.println("Invalid choice, Try again");
                    scan.nextLine();
                }
            }
            System.out.println("Item Removed.");
            
            while(true) {
                System.out.print("Would you like to remove another item? y/n: ");
                String choice = scan.nextLine();
                char ch = choice.charAt(0);
                if(ch == 'y') {
                    break;
                } else if (ch == 'n') {
                    for(int i = 0; i < 50; i++){
                        System.out.println();
                    }
                    return;
                } else
                    System.out.println("Please choose either 'y' or 'n'.");
            }
        }
    }
        
    public static void getReceipt(int budget, ArrayList<String> items, ArrayList<Integer> prices) {
        int total = 0;
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("----------Receipt----------");
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
            System.out.println(prices.get(i));
            total += prices.get(i);
        }
        System.out.println(" ");
        System.out.println("Current Balance: "+budget);
        System.out.println("Total Cost: "+total);
        budget -= total;
        if (budget < 0) {
            budget = 0;
        }
        System.out.println("Balance left: "+budget);
        System.out.print("Press ENTER to continue... ");
        scan.nextLine();
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
