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
public class passwordValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "bigMark";
        
        System.out.print("What is the password? " );
        String userPassword  = input.next();
        
        if (userPassword.equals(correctPassword)){
            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know You");
        }
        
    }
    
}
