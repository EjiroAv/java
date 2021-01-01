/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseForProgrammersByBrianHogan.makingDecisons;
import java.util.Scanner;

/**
 *
 * @author phoenixinexile
 */
public class bloodAlchoholCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input your current weight in Pounds");
        int weight = input.nextInt();
        
        System.out.print("Input Your Gender (M - for male , F - for Female)");
        String gender = input.next();
        
        System.out.print("Input the Number of Drinks You've Taken Today");
        int drinks = input.nextInt();
        
        System.out.print("Input the amount of alchohol by volume of the drinks consumed");
        int volume = input.nextInt();
        
        System.out.print("Input the amount of time since your last Drink");
        int time = input.nextInt();
    }
    
}

// I dont know the mathematical calculation or conversion of this so I would leave for later