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
public class legalDrivingAge {
     public static void main(String[] args) {
        int legalDrivingAge = 16;
        Scanner input = new Scanner(System.in);
        System.out.print("What's Your Age? ");
        int age = input.nextInt();
        
        if (age >= legalDrivingAge){
            System.out.println("You are Old enough to drive");
        }else if (age < legalDrivingAge){
            System.out.println("You are not old enough to drive");
        }
        
    }
}
