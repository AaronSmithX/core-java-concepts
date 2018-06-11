package org.wecancodeit.flexcode.module4.classesAndInterfaces;

public abstract class Animal {
	
	// All animals have a mouthPart that they use for eating
	protected MouthPart mouthPart;
	
	// All animals eat
	// They eat with their mouthPart
	// This method uses the specific animal name and mouthpart name
	public void eat() {
		String animalClassName = Helper.getClass(this);
		String mouthPartClassName = Helper.getClass(this.mouthPart);
		System.out.println("The " + animalClassName + " is eating with its " + mouthPartClassName + "!");
	}
	
	// This abstract method has no body
	// The first non-abstract class to extend Animal will have to define a body for this method
	public abstract void move();
	
	// All animals, when turned to strings, will now display just the name of their specific class
	@Override
	public String toString() {
		return Helper.getClass(this);
	}
}
