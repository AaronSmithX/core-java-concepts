package org.wecancodeit.flexcode.module4.classesAndInterfaces;

// Albatrosses are birds that can both fly AND swim (see how it can implement multiple interfaces)
public class Albatross extends Bird implements Flight, Swimming {
	
	// Albatrosses have a SwimPart for swimming
	// it is PRIVATE so other classes can't directly access it or modify it
	private SwimPart swimPart;
	
	public Albatross() {
		// Albatrosses use their flippers to swim
		// When we create an Albatross, we need to set its SwimPart to a Flippers object
		this.swimPart = new Flippers();
	}
	
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
	
	// Even though the Albatross already inherits an eat() method from a superclass (Animal),
	// we need to Override it since the Albatross implements it differently
	// Normally Birds (as Animals) just eat with their MouthParts (Beaks),
	// but Albatrosses must swim first to hunt
	@Override
	public void eat() {
		// The Albatross has swim() from its Swimmer interface
		this.swim(this.swimPart);
		
		// Then we call the eat() method inherited from its superclass
		// (it was defined in Animal and inherited by Bird)
		// Hold the CTRL key and click "super" to see the superclass
		// Hold the CTRL key and click the eat() method to see where it was defined
		super.eat();
	}

}
