package org.wecancodeit.flexcode.module4.classesAndInterfaces;

// This helper class lets us get the name of an object's class
// If we pass it a String, it will give us "String", etc.
public class Helper {
	
	// Since this method is static, we don't have to create a `new` Helper to use it
	// It belongs to the class itself, rather than an individual instance of the class
	public static String getClass(Object target) {
		
		// Here we use a fluent API (one method called right after the other)
		// target.getClass() returns a class
		// (class).toString() returns a String
		// (String).split() returns an array of Strings (the original String split on ".")
		String[] classNameArray = target.getClass().toString().split("\\.");
		
		// Here we return the final entry in that array, all lowercase
		// So this class:
		// 		org.wecancodeit.flexcode.module4.classesAndInterfaces.Butterfly
		// Would split into this array:
		//		[org, wecancodeit, flexcode, module4, classesAndInterfaces, Butterfly]
		// And would return this:
		//		butterfly
		return classNameArray[classNameArray.length - 1].toLowerCase();
	}
}
