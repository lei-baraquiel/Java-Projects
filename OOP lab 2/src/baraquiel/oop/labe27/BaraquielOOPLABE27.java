/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baraquiel.oop.labe27;

public class BaraquielOOPLABE27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        
        num1 = 5;
        num2 = 10;
        System.out.println("sum of " + num1 + " and " + num2 + ": " + add(num1, num2));
        
        num1 = 20;
        num2 = 30;
        System.out.println("sum of " + num1 + " and " + num2 + ": " + add(num1, num2));
        
        num1 = -5;
        num2 = 10;
        System.out.println("sum of " + num1 + " and " + num2 + ": " + add(num1, num2));
        
        num1 = 100;
        num2 = 250;
        System.out.println("sum of " + num1 + " and " + num2 + ": " + add(num1, num2));
        
        System.out.println();
        
        num1 = 7;
        num2 = 6;
        System.out.println("The area of the rectangle is: " + calculateRectangleArea(num1, num2));
        
    }
    
    public static int add(int num1, int num2) {
        int total = num1 + num2;
        
        return total;
    }
    
    public static double calculateRectangleArea(int num1, int num2) {
        double total = num1 * num2;
        
        return total;
    }
    
}
