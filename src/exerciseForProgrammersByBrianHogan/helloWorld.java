/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

The “Hello, World” program is the first program you learn
to write in many languages, but it doesn’t involve any input.
So create a program that prompts for your name and prints
a greeting using your name.
Example Output
What is your name? Brian
Hello, Brian, nice to meet you!
Constraint
• Keep the input, string concatenation, and output separate.
Challenges
• Write a new version of the program without using any
variables.
• Write a version of the program that displays different
greetings for different people. 
 */
package exerciseForProgrammersByBrianHogan;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class helloWorld {

    public static void main(String[] args) {
        System.out.print("What's Your Name?  ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("What's Your Gender?  ");
        String gender = input.next();
        System.out.print("Are You Married?  ");
        String maritalStatus = input.next();

        if (("male".equals(gender) || "Male".equals(gender) || "MALE".equals(gender)) && ("Yes".equals(maritalStatus) || "yes".equals(maritalStatus) || "YES".equals(maritalStatus))) {
            System.out.println("Hello Mr " + name + " nice to meet you!");
        } else if (("female".equals(gender) || "Female".equals(gender) || "FEMALE".equals(gender)) && ("Yes".equals(maritalStatus) || "yes".equals(maritalStatus) || "YES".equals(maritalStatus))) {
            System.out.println("Hello Mrs " + name + " nice to meet you!");
        } else if (("male".equals(gender) || "Male".equals(gender) || "MALE".equals(gender)) && ("No".equals(maritalStatus) || "no".equals(maritalStatus) || "NO".equals(maritalStatus))) {
            System.out.println("Hello Mister " + name + " nice to meet you!");
        } else if (("female".equals(gender) || "Female".equals(gender) || "FEMALE".equals(gender)) && ("No".equals(maritalStatus) || "no".equals(maritalStatus) || "NO".equals(maritalStatus))) {
            System.out.println("Hello Miss " + name + " nice to meet you!");

        } else{
            System.out.println("                             ");
            System.out.println("E R R O R ! ! !");
            System.out.println("Please Input the Approprate Answer to each Question");
            System.out.println("For Example");
            System.out.println("Question 1 should  be answered with either : Yes or No ");
            System.out.println("Question 2 should  be answered with either : Male  or Female ");
            System.out.println("Question 3 should  be answered with either : Yes or No ");
            System.out.println("Check Spelling, All Input should be spelled either in Uppercase, Lowercase or Capitalised");
            System.out.println("                             ");
            System.out.println("                             ");
            System.out.println("                             ");
            System.out.println("Shall we Try Again");
            String response = input.next();
            if ("Yes".equals(response) || "yes".equals(response) || "YES".equals(response)){
                
            }
        }

    }

}
