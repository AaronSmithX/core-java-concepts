package org.wecancodeit.flexcode.module4.classesAndInterfaces;

public interface Swimming {
	
	// This is a default method, so all classes that implement this interface
	// will automatically have this method with its method body
	public default void swim(SwimPart swimPart) {
		String animalClassName = Helper.getClass(this);
		String swimPartClassName = Helper.getClass(swimPart);
		System.out.println("The " + animalClassName + " is swimming with its " + swimPartClassName + "!");
	}
}
