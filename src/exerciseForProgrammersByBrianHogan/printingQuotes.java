/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseForProgrammersByBrianHogan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class printingQuotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the Quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input.nextLine();
        System.out.println(author +" says "+ "\"" + quote + "\" ");
        
    }
    
}
