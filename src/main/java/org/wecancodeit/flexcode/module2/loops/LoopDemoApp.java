package org.wecancodeit.flexcode.module2.loops;

import java.util.Scanner;

public class LoopDemoApp {
	
	// Allows us to wait for user input (but only to pause)
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// This loop iterates over digits 0-9
		System.out.println("Iterate over numbers 0-9:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// This loop iterates until a condition is met
		System.out.println("Iterate until a number divisible by both 3 and 4 is found.");
		int counter = 1;
		while (counter % 3 != 0 || counter % 4 != 0) {
			System.out.println(counter + " is not divisible by both 3 and 4.");
			counter++;
		}
		System.out.println(counter + " is the first number divisible by both 3 and 4.");
		System.out.println();
		
		// This loop on its own would run endlessly, but utilizes
		// branching statements to control the flow of the program
		// Try to follow the control flow and compare it to the output
		// in the console.
		int x = 0;
		while (true) {
			
			if (x == 11) {
				System.out.println("x is 11... adding 12");
				x += 12;
			}
			
			if (x < 10) {
				System.out.println("x < 10... incrementing");
				x++;
				
				if (x % 3 == 0) {
					System.out.println("x is divisible by 3... adding 8 and continuing");
					x += 8;
					continue; // Ends this iteration of the loop
				}
			}
			else {
				System.out.println("X not < 10... decrementing");
				x--;
			}
			
			if (x > 20) {
				System.out.println("x > 20... subtracting 5");
				x -= 5;
			}
			
			if (x == 15) {
				System.out.println("x is 15... breaking");
				break; // Ends the loop altogether
			}
			
			System.out.println("X = " + x);
		}
		System.out.println("Loop ended. X is " + x);
	}  
}
