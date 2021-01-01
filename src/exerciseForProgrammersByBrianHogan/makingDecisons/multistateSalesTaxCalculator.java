/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseForProgrammersByBrianHogan.makingDecisons;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author phoenixinexile
 */


public class multistateSalesTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the Order amount ? ");
        int orderAmount = input.nextInt();
        System.out.print("What state do you live in ? ");
        String stateOfResidence = input.next();
        
        
        switch (stateOfResidence) {
            case "wisconsin" : System.out.println("Input E for Eau Claire county Resident , Input D for Dunn county Resident");
            String county = input.next();
           switch (county) {
            case "E":
                {
                    double tax = orderAmount * (0.055 + 0.005);
                    double total = orderAmount + tax;
                    System.out.println("The Tax is "+ tax);
                    System.out.println("The Total is "+ total);
                    break;
                }
            case "D":
                {
                    double tax = orderAmount * (0.055 + 0.004);
                    double total = orderAmount + tax;
                    System.out.println("The Tax is "+ tax);
                    System.out.println("The Total is "+ total);
                    break;
                }
            default:
                System.out.println("Error! Input E for Eau Claire county Resident , Input D for Dunn county Resident");
                break;
        }
            break;
            
            case "illinois" :
                double tax = orderAmount * 0.08;
                double total = orderAmount + tax;
                
                System.out.println("The Tax is "+ tax);
                System.out.println("The Total is "+ total);
                break;
            
            default : 
                System.out.println("The Total is "+ orderAmount);
                break;
        }
    }
    
}
