/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseForProgrammersByBrianHogan.makingDecisons;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class taxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("What is the order Amount? ");
        double orderAmount = input.nextInt();
        
        System.out.print("What is the state? ");
        String state = input.next();
        
        if ("WI".equals(state)){
            System.out.println("The Subtotal is : $"+orderAmount);
            double tax = orderAmount * 0.055;
            double total = orderAmount + tax;
            System.out.println("The total is : $"+total);
        }
        
         if ("MN".equals(state)){
            System.out.println("The Total is : $"+orderAmount);
        }
        
        
    }
    
}
