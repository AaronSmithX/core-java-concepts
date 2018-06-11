package org.wecancodeit.flexcode.module4.classesAndInterfaces;

// This helper class lets us get the name of an object's class
// If we pass it a String, it will give us "String", etc.
public class Helper {
	
	// Since this method is static, we don't have to create a `new` Helper to use it
	// It belongs to the class itself, rather than an individual instance of the class
	public static String getClass(Object target) {
		String[] classNameArray = target.getClass().toString().split("\\.");
		return classNameArray[classNameArray.length - 1].toLowerCase();
	}
}
