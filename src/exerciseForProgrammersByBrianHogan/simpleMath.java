/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseForProgrammersByBrianHogan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class simpleMath {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String firstNumber = input.next();
        System.out.print("What is the second number? ");
        String secondNumber = input.next();
        
        int firstNumberInteger = Integer.decode(firstNumber);
        int secondNumberInteger = Integer.decode(secondNumber);
        
        int sum = firstNumberInteger + secondNumberInteger;
        int difference = firstNumberInteger - secondNumberInteger;
        int product = firstNumberInteger * secondNumberInteger;
        int quotient = firstNumberInteger / secondNumberInteger;
        
        System.out.print(firstNumberInteger +" + "+ secondNumberInteger +" = "+ sum+"\n"
                         +firstNumberInteger + " - " + secondNumberInteger + " = " +difference+"\n"
                         +firstNumberInteger + " * " + secondNumberInteger + " = " +product+"\n"
                         +firstNumberInteger + " / " + secondNumberInteger + " = " +quotient+"\n");
       
    }
    
}
