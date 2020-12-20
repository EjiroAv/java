/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Create a program that prompts for an input string and displays output that shows the input string and the number of
characters the string contains.
Example Output
What is the input string? Homer
Homer has 5 characters.
Constraints
• Be sure the output contains the original string.
• Use a single output statement to construct the output.
• Use a built-in function of the programming language to
determine the length of the string.
Challenges
• If the user enters nothing, state that the user must enter
something into the program.
• Implement this program using a graphical user interface
and update the character counter every time a key is
pressed. If your language doesn’t have a particularly
friendly GUI library, try doing this exercise with HTML
and JavaScript instead.
 */
package exerciseForProgrammersByBrianHogan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class countingTheNumberOfCharacters {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
     System.out.print("What is Input ? ");
     String string = input.nextLine();
     int numberOfCharacters = string.length();
     if(string.length()== 0){
         System.out.println("E R R O R !!! , Please Input a Text" );
     }else{
     System.out.println(string +" has "+numberOfCharacters+" Characters");
     }
    }
    
 }
