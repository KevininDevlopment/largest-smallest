
/**
 * The LargestSmalletValue class.
 *
 * @author Kevin Amaya
 * @version 04/18/2018
 */

import java.util.Scanner;

public class LargestSmalletValue 
{
    
    
    	public static void main(String[] args) {

    	// Create array   
        int[] numbers;
        numbers = new int[10];
        
        // Create input option
        Scanner in = new Scanner(System.in);

        // Ask for the numbers '
        System.out.print("Please enter ten numbers, with commas: \n");
        // For loop to obtain the input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        } 

        // Get the largest and smallest numbers
        System.out.printf("%s: %d%n", "The smallest number is ", Math.min(numbers[0], Math.min(numbers[0], numbers[9])));
        System.out.printf("%s: %d%n", "The largest number is ", Math.max(numbers[0], Math.max(numbers[0], numbers[9])));
    } 
         
  }    
        

    
