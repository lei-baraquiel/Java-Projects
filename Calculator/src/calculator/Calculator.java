/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

/** @author furei19 **/
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum, secondNum, ans = 0;        
        char op;
        
        while(true) {
            System.out.println("Welcome to Java Calculator");
            System.out.print("Enter first number (type q to exit): ");
            
            if(scan.hasNext("q")) break;
            firstNum = scan.nextInt();
            
            System.out.print("Enter second number: ");
            secondNum = scan.nextInt();
            
            System.out.print("Enter operation (+ - * /): ");
            op = scan.next().charAt(0);
            
            switch(op) {
            case '+':
                ans = firstNum + secondNum;
                break;
            case '-':
                ans = firstNum - secondNum;
                break;
            case '*':
                ans = firstNum * secondNum;
                break;
            case '/':
                ans = firstNum / secondNum;
                break;
            default:
                System.out.println("Invalid Operation.");
                continue;
            }
            
            System.out.println(firstNum + " " + op + " " + secondNum + " = " + ans + "\n");
        }
        
        scan.close();
        System.out.println("Calculator Closed");
    }
}
