/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PizzaManager {
        static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int size = 0;
        
        ArrayList<String> order_toppings = new ArrayList<>();
        ArrayList<Integer> order_price = new ArrayList<>();
        
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
                size = scan.nextInt();
                scan.nextLine();
            }
        }
    }
    
}
