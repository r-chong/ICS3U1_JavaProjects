/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment3;

import java.util.Scanner;
/**
 *
 * @author s201076119
 */
public class ChongAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);
        
        final double taxRate = 1.13;
        final String[] itemOptions = {"Peanuts","Treenuts","Walnuts"};
        final double[] itemPrices = {1.99, 0.99, 4.99};
        
        int[] itemCounts = new int[3];
        double subTotal;
        double hstTotal;
        double grandTotal;
        
        /*Loop through items in parallel arrays, take user input for # purchased*/
        for (int j = 0; j < itemOptions.length; j++) {
            String item = itemOptions[j];
            System.out.println("How many " + item + " would you like to add to your cart?");
            itemCounts[j] = keyedInput.nextInt();
        }
        
        /*For each item, multiply itemCount * itemPrice*/
        /*subTotal = sum of cost of goods sold*/
        /*hstTotal = subTotal * 0.13 for HST*/
        /*grandTotal = subTotal + hstTotal*/
    }
    
}
