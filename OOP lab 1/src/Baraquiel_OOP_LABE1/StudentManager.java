/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Baraquiel_OOP_LABE1;

import java.util.Scanner;

/**
 *
 * @author Joseph Lei F. Baraquiel CS2B
 */
public class StudentManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = {0, 0, 0};
        int total = 0;
        double calculated_total = 0;
        String username, password, grade = "None";
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter Username: ");
            username = scan.nextLine();
            
            System.out.print("Enter Username: ");
            password = scan.nextLine();
            
            if (username.equals("student") && password.equals("java123")) {
                System.out.println("Login Successful!");
                break;
            } else {
                System.out.println();
                System.out.println("Invalid Credentials. Please try again.");
                System.out.println();
                System.out.println();
            }
        }
        
        System.out.println();
        System.out.println("Enter your 3 quiz scores:");
        for (int i = 0; i < 3; i++) {
            System.out.print("");
            while(true) {
                if (scan.hasNextInt()) {
                    scores[i] = scan.nextInt();
                    scan.nextLine();
                    break;
                } else {
                    System.out.println("Please input an integer.");
                    scan.nextLine();
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            total += scores[i];
        }
        
        calculated_total = total / 3;
        
        if (calculated_total >= 90) {
            grade = "A";
        } else if (calculated_total >= 80 && calculated_total <= 89) {
            grade = "B";
        } else if (calculated_total >= 70 && calculated_total <= 79) {
            grade = "C";
        } else if (calculated_total >= 60 && calculated_total <= 69) {
            grade = "D";
        } else if (calculated_total < 60) {
            grade = "F";
        }
        
        System.out.println();
        System.out.println("Hello, " + username);
        System.out.println("Your average is " + calculated_total + " and your grade is " + grade);
        
        scan.close();
    }
    
}
