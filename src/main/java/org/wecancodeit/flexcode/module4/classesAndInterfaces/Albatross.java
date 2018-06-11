package org.wecancodeit.flexcode.module4.classesAndInterfaces;

public class Albatross extends Bird implements Flight {

	// The Albatross HAS to have its own move() method since Animal declares it as abstract
	// and Bird, which extends Animal, is also an abstract class and doesn't have to define it either
	// The first non-abstract class has to implement any abstract methods in its parent classes
	@Override
	public void move() {
		
		// The Albatross has the fly() method because it is defined as a default method in Flight
		// Default methods have a method body and are directly added to any class that implements
		// that interface
		this.fly();
	}

}
