/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author trent
 */
public class isPrimeMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is prime");
        int numberToCheck = keyboard.nextInt();
        
        boolean flag = false;
        
        for(int devider = 2; devider <= numberToCheck/2; devider++){
            if (numberToCheck / devider ==0){
                flag = true;
                break;
            }
            if (!flag)
            System.out.println("The number you have entered is a prime number");
        else
            System.out.println("The number you entered is not a prime number");
                
            
        }
        
    }
    
    
}
