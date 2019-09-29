/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author trent
 */
public class evenOddCounter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();
        int totalOdd = 0;
        int totalEven = 0;
        double x;
        
        
        
        for(int i = 0; i <=100; i++){
            x = randomNumbers.nextInt();
            if((x %2) == 0){
            totalEven = totalEven + 1;
        }
            else{
            totalOdd = totalOdd + 1;
            }
        }
        System.out.println("The total of even numbers is " + totalEven + " the total number of odd is " + totalOdd);
                
            
        
        
    }
    /*
    public static double getRandomNumber(x){

    double x = Math.random();

    return x;
}
*/
}
