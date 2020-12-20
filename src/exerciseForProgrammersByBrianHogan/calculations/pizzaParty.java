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
public class pizzaParty {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many People? ");
        int people = input.nextInt();
        System.out.print("How many pizza do you have? ");   
        int pizza = input.nextInt();
        System.out.println("");
        int p = pizza * 8;
        int pieces = p / people;
        int leftover = p % people;
        
        
        if (pizza == 1){
        System.out.println(people + " people with " + pizza + " pizza");
        }else if (leftover > 1 ){
        System.out.println(people + " people with " + pizza + " pizzas");
        }
        
        if(pieces > 1 ){
        //System.out.println(people + " people with " + pizza + " pizzas");
        System.out.println("Every person gets " + pieces + " pieces of pizza");
       // System.out.println("There are " + leftover + " leftover pieces");
        }else if (pieces == 1){
        //System.out.println(people + " people with " + pizza + " pizza");
        System.out.println("Every person gets " + pieces + " piece of pizza");
       // System.out.println("There are " + leftover + " leftover pieces");
        }
        
        if (leftover == 1){
        System.out.println("There is just " + leftover + " leftover piece");
        }else if (leftover == 0 || leftover > 1){
        System.out.println("There are " + leftover + " leftover pieces");
        }

    }

}
