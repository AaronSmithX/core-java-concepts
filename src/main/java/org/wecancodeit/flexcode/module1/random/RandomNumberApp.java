package org.wecancodeit.flexcode.module1.random;

import java.util.Random;

public class RandomNumberApp {
	
	public static void main(String[] args) {
		
		// Create a random number generator
		Random rand = new Random();
		
		// Do everything in this loop 20 times...
		for (int i = 0; i < 20; i++) {
			
			// Get a random number, including 0, excluding the #
			int zeroToFive = rand.nextInt(6);
			
			// Add 1 to get a value between 1 and the passed #
			int oneToSix = zeroToFive + 1;
			
			System.out.println("Rolled the die and got: " + oneToSix);
		}
	}
}
