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
public class paintJobEstimator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of rooms");
        double numberOfRooms = keyboard.nextDouble();
        System.out.println("Please enter the price per gallon");
        double pricePerGallonPaint = keyboard.nextDouble();
        double numberOfTotalFeet = 0;
        
        
        for(int i=1; i<=numberOfRooms; i++){
            System.out.println("Please enter the number of feet for room " + i);
            double feetInput = keyboard.nextDouble(); 
            numberOfTotalFeet = feetInput + numberOfTotalFeet;
         }
        System.out.println(numberOfTotalFeet);
        
        double totalPriceOfPaint = (numberOfTotalFeet / 115) * pricePerGallonPaint;
        double totalLaborCosts = (numberOfTotalFeet / 115) * 18;
        double totalLaborHours = (numberOfTotalFeet / 115) * 8;
        double totalRequiredPaint = (numberOfTotalFeet / 115) * 1;
        
        System.out.println("The total number of gallons of paint required for this job is " + totalRequiredPaint);
        System.out.println("The total number of hours required for this job is " + totalLaborHours);
        System.out.println("The cost of the paint is " + pricePerGallonPaint);
        System.out.println("The labor charges are " + totalLaborCosts);
        System.out.println("the total cost of paint is " + totalPriceOfPaint);
    }
}
