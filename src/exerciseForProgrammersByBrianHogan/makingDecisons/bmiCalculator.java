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
public class bmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your height in Inches ");
        int height = input.nextInt();
        System.out.print("Input your weight in pounds ");
        double weight = input.nextDouble();
        
        int heightSquare = height * height;
        double weightDividedByHeightSquare = weight/heightSquare;
        
        double bmi = weightDividedByHeightSquare * 703;
        
        if (bmi < 18.5) {
             System.out.println("Your BMI is " + bmi);
             System.out.println("You are Underweight. You should see a Doctor");
        } else if(bmi >= 18.5 && bmi<= 25){ 
            System.out.println("Your BMI is " + bmi);
            System.out.println("You are within the ideal weight range.");
        } else if (bmi > 25)  {
            System.out.println("Your BMI is " + bmi);
            System.out.println("You are Overweight. You should see a Doctor");
        }
           
         
       
    }
    
}
