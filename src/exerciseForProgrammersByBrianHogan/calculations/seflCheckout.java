/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseForProgrammersByBrianHogan.calculations;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class seflCheckout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double taxRate = 0.055;
        
        System.out.print("Enter the price of item 1: ");
        int priceOfItem1 = input.nextInt();
        
        System.out.print("Enter the quantity of item 1: ");
        int quantityOfItem1 = input.nextInt();
        
        System.out.print("Enter the price of item 2: ");
        int priceOfItem2 = input.nextInt();
        
        System.out.print("Enter the quantity of item 2: ");
        int quantityOfItem2 = input.nextInt();
        
        System.out.print("Enter the price of item 3: ");
        int priceOfItem3 = input.nextInt();
        
        System.out.print("Enter the quantity of item 3: ");
        int quantityOfItem3 = input.nextInt();
        
        int item1 = priceOfItem1*quantityOfItem1;
        int item2 = priceOfItem2*quantityOfItem2;
        int item3 = priceOfItem3*quantityOfItem3;
        
        double subtotal = item1 + item2 + item3;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;
        
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        
        
    }
    
}
