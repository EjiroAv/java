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
public class madLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.next();
        System.out.print("Enter a verb: ");
        String verb = input.next();
        System.out.print("Enter an adjective: ");
        String adjective = input.next();
        System.out.print("Enter an adverb: ");
        String adverb = input.next();
        
        System.out.println("Do you "+verb+" your " +adjective+" " + noun+" "+ adverb +"? That's Hilarious");
        
    }
    
}
