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
public class paintCalculator {
    public static void main(String[] args) {
        int g = 350;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the Length of the ceiling? ");
        int length = input.nextInt();
        System.out.print("What is the Breadth of the ceiling? ");
        int breadth = input.nextInt();
        System.out.println("You entered dimensions of "+length+" feet by "+breadth+" feet.");
        
        double doubleArea = length * breadth;
        int area = (int) doubleArea;
        
        double amountOfGallons = doubleArea / g;
        int amountOfGallonsRounded = (int) Math.round(amountOfGallons);
        System.out.println(amountOfGallonsRounded);
        System.out.println(area % g);
        if((doubleArea % g) > 0){
            int amountOfGallonsRoundedIncrement = amountOfGallonsRounded + 1;
            System.out.println("You will need to purchase "+amountOfGallonsRoundedIncrement+""
                + " gallons of paint to cover "+area+" square feet");
        }else{
        
        System.out.println("You will need to purchase "+amountOfGallonsRounded+""
                + " gallons of paint to cover "+area+" square feet");
        }
        
        
    }
    
}
