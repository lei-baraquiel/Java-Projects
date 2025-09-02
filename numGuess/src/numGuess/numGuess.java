/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numGuess;

import java.util.Scanner;

public class numGuess {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 100);
        int num = 0, lives = 10;
        
        Scanner scan = new Scanner(System.in);
        while(lives > 0) {
            while(true) {
                System.out.print("Input Number from 1-100: ");
                if (scan.hasNextInt()) {
                    num = scan.nextInt();
                    scan.nextLine();
                    break;
                } else {
                    System.out.println("Not a valid integer, Try again");
                    scan.nextLine();
                }
            }
            
            if (num > randomNum) {
                System.out.println("Too High!");
                lives--;
            } else if (num < randomNum) {
                System.out.println("Too Low!");
                lives--;
            } else {
                scan.close();
                System.out.println("You Won!");
                break;
            }
            
            if (lives == 0) {
                System.out.println("You don't have any more lives!");
                System.out.println("You Lost");
            }
            
            System.out.println("You have " + lives + " Lives left");
        }
    }
}

