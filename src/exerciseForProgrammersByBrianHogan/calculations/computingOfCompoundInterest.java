/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseForProgrammersByBrianHogan.calculations;

import java.util.Scanner;

/**
 *
 * @Ejiro-Oghene Avwerhota Japheth
 */
/*
P is the principal amount.
r is the annual rate of interest.
t is the number of years the amount is invested.
n is the number of times the interest is compounded per
year.
A is the amount at the end of the investment
*/
public class computingOfCompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("What is the principal amount? ");
        int P = input.nextInt();  
        System.out.print("What is the rate? ");
        int r = input.nextInt(); 
        System.out.print("What is the number of years? ");
        int t = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt(); 
        
        double A = P*(1+(r/n))^(n*t);
    }
    
}
