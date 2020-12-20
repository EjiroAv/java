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
public class computingSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Principal: ");
        int principal = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rateOfInterest = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int numbersOfYears = input.nextInt();
        
        double rate  = rateOfInterest / 100;
        int Investment = (int) (principal*(1 + (rate*numbersOfYears)));
        
        System.out.println("        ");
        System.out.println("After "+numbersOfYears+" years at "+rateOfInterest+"%, the Investment will \n"
        +"be worth $"+Investment);
        
    }
}
