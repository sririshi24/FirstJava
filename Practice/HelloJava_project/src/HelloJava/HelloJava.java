/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloJava;

import java.util.Scanner;

/**
 *
 * @author Rishi-PC
 */
public class HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print("What is Author's name ");

        String var1 = input.nextLine();
        System.out.printf("Hello Java By %s \n", var1);
    }

}
