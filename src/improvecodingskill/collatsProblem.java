/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvecodingskill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author EjiroAv
 */

 /*
    DETAILS OF CODING CHALLENGE
    
    Consider the following algorithm to generate a sequence of numbers.
    Start with an integer n. If n is even, divide by 2. If n is odd, 
    multiply by 3 and add 1. Repeat this process with the new value of n, 
    terminating when n = 1. For example, 
    the following sequence of numbers will be generated for n = 22:
     22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
    
    */
public class collatsProblem {
    
    public static void maincode(int n, int m){
      // n is the number passed from the function at line 52
      // This is done to make code a lot more easier
         int r = n; 
         int s = m;
          List seq = new ArrayList();
          List<Integer> lst  = new ArrayList<>();
          List<Integer> list  = new ArrayList<>();
            int i = 1; 
           while (n > 1){
           // if number is even 
            if (( n % 2) == 0){
                int e = n/2;
                 n = e;
                 i++;
                 lst.add(n);
           // if number is odd 
            } else {
                int o = (3*n)+1;
                n = o;
                i++;
                lst.add(n);
            }
           }
           int j = 1;
            while (m > 1){
           // if number is even 
            if (( m % 2) == 0){
                int e = m/2;
                 m = e;
                 j++;
                 list.add(m);
           // if number is odd 
            } else {
                int o = (3*m)+1;
                m = o;
                j++;
                list.add(m);
            }
           }
            
            if (i > j){
                System.out.println(i + " Is the Maximum cycle Length");
            } else{
                System.out.println(j + " Is the Maximum cycle Length");
            }
            
            String formattedArray_n  = lst.toString()
                   .replace(",", "")
                   .replace("[", "")
                   .replace("]", "");
           System.out.println("Cycle Length = " + i);
           System.out.println(r + " " + formattedArray_n);
           
           String formattedArray_m  = list.toString()
                   .replace(",", "")
                   .replace("[", "")
                   .replace("]", "");
           System.out.println("Cycle Length = " + j);
           System.out.println(s + " " + formattedArray_m);
        
    }
    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         System.out.println("Input the First Integer");
         int i = input.nextInt(); // Input for First Integer
         System.out.println("Input the Second Integer");
         int j = input.nextInt(); // Input for Second Integer
         
    
    
    if (( i < 1000000 && i > 0) && (j < 1000000 && j > 0)){
            
           maincode(i,j);
     
      }else{
           JOptionPane.showMessageDialog(null, "Incorrect Number!, Please "
                   + "a number between 1,000,000 and 1");
    }
    }
    
   // That's it for now, Next Objective is to determine the maximum cycle length between i an j 
   // and then Output the result
 
}
