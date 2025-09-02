/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

public class shoppingPlanner {
    
    public static void main(String[] args) {

        int count = 0, budget = 0, total = 0;

        Scanner scan = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();
        
        while(true) {
            System.out.println("Welcome to Shopping Planner");
            System.out.print("Input Budget: ");
            if (scan.hasNextInt()) {
                budget = scan.nextInt();
                scan.nextLine();
                break;
            } else {
                System.out.println("Not a valid integer, Try again");
                scan.nextLine();
            }
        }
        System.out.println(" ");
        while(true) {
            System.out.print("Item Name: ");
            String line = scan.nextLine();
            items.add(line);
            
            while(true) {
                System.out.print("Item Price: ");
                if (scan.hasNextInt()) {
                    int num = scan.nextInt();
                    prices.add(num);
                    scan.nextLine();
                    break;
                } else {
                    System.out.println("Not a valid integer, Try again");
                    scan.nextLine();
                }
            }
            
            while(true) {
                System.out.print("Add another item? y/n: ");
                char choice = scan.next().charAt(0);
                scan.nextLine();

                if (choice == 'n') {
                    System.out.println(" ");
                    System.out.println("Your Receipt:");
                    for(int i = 0; i < items.size(); i++) {
                        System.out.print(items.get(i) + " ");
                        System.out.println(prices.get(i));
                        total += prices.get(i);
                    }
                    
                    budget -= total;
                    
                    if (budget < 0) {
                        budget = 0;
                    }
                    
                    System.out.println(" ");
                    System.out.println("Total expenses: " + total);
                    System.out.println("Money Left: " + budget);
                    System.exit(0);                    
                } else if (choice == 'y') {
                    System.out.println(" ");
                    break;
                } else {
                    System.out.println("Please choose either y or n.");
                }
            }
        }
    }
    
}
