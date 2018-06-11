package org.wecancodeit.flexcode.module4.classesAndInterfaces;

public interface Flight {
	
	// Since this method is default, any class that implements this interface will
	// automatically gain this method and its method body
	public default void fly() {
		String animalClassName = Helper.getClass(this);
		System.out.println("The " + animalClassName + " is flying!");
	}
}
