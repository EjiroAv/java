/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseForProgrammersByBrianHogan;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author user
 */
public class retirementCalculator {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("YYYY");
        String currentDate = ft.format(d);
        int dateInteger = Integer.decode(currentDate);
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your current Age? ");
        int currentAge = input.nextInt();
        
        System.out.print("When do you want to retire? ");
        int retireAge = input.nextInt();
        
        int yearsLeft = retireAge - currentAge;
        int retirement = dateInteger + yearsLeft;
       
        System.out.println("You have "+yearsLeft+" left until you can retire");
        System.out.println("It's "+currentDate+", so you can retire in "+retirement);
       
    }
    
}
