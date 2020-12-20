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
public class areaOfARectangularRoom {
    public static void main(String[] args) {
        double k = 0.09290304;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the Length of the room? ");
        int length = input.nextInt();
        System.out.print("What is the Breadth of the room? ");
        int breadth = input.nextInt();
        System.out.println("You entered dimensions of "+length+" feet by "+breadth+" feet.");
        int areaInSquareFeet = length * breadth;
        double areaInSquareMeters =  areaInSquareFeet * k;
        System.out.print("The area is \n"
                        +areaInSquareFeet+" square feet \n"
                        +areaInSquareMeters+" square meters ");
    }
    
}
