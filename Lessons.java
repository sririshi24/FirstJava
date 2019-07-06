/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author Rishi
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ############ Input output ################################
        int var_in;
        double var_doub;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the int variable : ");
        var_in = in.nextInt();
        
        System.out.println("Enter the int variable : ");
        var_doub = in.nextDouble();
        
        System.out.printf("Entered int : %d, Entered double : %.3f\n",var_in,var_doub);
        // ############ String formating ############################
        double var = 3;
        int var2 = 345;
        
        // Formating the output by %.3f, printf doesn't have newline
        System.out.printf("Formating the output = %.3f\n",var);
        System.out.printf("this is decimal %d, and this is floating point %f\n", var2,var);
        
        
        
        //###################### Type casting  #######################
        double pi = 3.14159;
        
        int x = (int)pi;
        
        // Type casting , Double --> Int
        System.out.printf("Type casted value is %d\n",x);
        
        double eq1 = (int)pi*10;
        double eq2 = (int)(pi*10);
        
        // Type casting take precedence over arithmatic operations 
        System.out.printf("eq1 : %f and eq2 : %f\n",eq1,eq2);
        
        
        // ########## Constants ######
        
        final double g_acc = 9; // this value can't be change further : "fianl"
        
        // ### Scanner bug ###############
        String name;
        int age;
        System.out.print("Enter your name: ");
        
        name = in.nextLine();
        
        System.out.print("Enter your age: ");
        
        age = in.nextInt();
        
        System.out.printf("Hi name: %s, age: %d", name,age);
        
        
        
 
        
  
        
    }
    
}
