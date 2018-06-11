package org.wecancodeit.flexcode.module4.overloading;

public class OverloaderApp {
	
	public static void main(String[] args) {
		
		Overloader overload = new Overloader();
		
		// The method name is the same
		// Since it is overloaded, we can pass either an int or a String
		overload.display(1984);
		overload.display("...and this is just a String.");
		
		System.out.println("See how we can call the same method with either an `int` or a `String` argument?");
	}
}
