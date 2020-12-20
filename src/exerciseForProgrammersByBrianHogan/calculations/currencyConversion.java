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
public class currencyConversion {
    public static void main(String[] args) {
        /*Come Back to these later, I'm not getting it now*/
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging ? ");
        double amountFrom = input.nextInt();
        
        System.out.print("What is the Exchange Rate ? ");
        double exchangeRate = input.nextDouble();
        
        double amountTo = amountFrom * exchangeRate;
        
        System.out.print(amountFrom + " euros at an exchange rate of "+exchangeRate+ 
                " is "+ amountTo +" U.S. Dollars");
        
        //Ensure the Fractions of a cent are rounded up to the next penny
        // Use a single output Stratement
        
    }
    
}
