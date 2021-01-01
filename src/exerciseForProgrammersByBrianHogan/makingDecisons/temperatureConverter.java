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
public class temperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        String choice = input.next();
        System.out.println("Your Choice is : "+ choice);
        
        
        switch (choice){
            
            case "C": System.out.println("Please enter the temperature in Fahrenheit");
            int f = input.nextInt();
            double c = ((f-32)*(0.55));
            System.out.println("The Temperature in celcius is : "+c);
            break;
            
            case "F": System.out.println("Please enter the temperature in Celcius");
            int C = input.nextInt();
            double F = ((C*(1.8))+32);
             System.out.println("The Temperature in farenheit is : "+F);
            break;
            
            default:
                System.out.println("Invalid Input.Press C to convert from Fahrenheit to Celsius.Press F to convert from Celsius to Fahrenheit.");
        }
        
        
    }
    
}
