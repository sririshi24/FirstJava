/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Rishi-PC
 */
public class Lesson02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input1 = new Scanner(System.in);
        
        System.out.printf("Are you a Male ");
        Boolean Male = input1.nextBoolean();
        
        String Ismale = Male ? "He" : "She"; // Condition ? do_if_true : Otherwise ;
        
        System.out.println(Ismale);
    }
    
}
