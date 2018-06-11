package org.wecancodeit.flexcode.module4.overloading;

// There is only ONE method name in this class
// However, that method is OVERLOADED with two different method signatures
// Since each definition requires different parameters (String vs. int),
// they can share the same name. Java knows which one it should use based
// on the arguments passed to it.
public class Overloader {
	
	public void display(String input) {
		System.out.println(input);
	}
	
	public void display(int input) {
		// Concatenate an empty string to the integer to make it a string
		// this step isn't necessary - just for demonstration purposes
		System.out.println("" + input);
	}
	
}
