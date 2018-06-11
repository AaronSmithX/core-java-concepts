package org.wecancodeit.flexcode.module4.classesAndInterfaces;

// The Bird class is abstract because there is no Bird that isn't specifically
// a Penguin or Albatross (in this example)
// Classes declare what something IS, while interfaces declare what it DOES
public abstract class Bird extends Animal {
	
	// The constructor defines the bird's mouthPart as a Beak
	// All birds will automatically have beaks when they are created
	public Bird() {
		
		// An Animal's mouthPart property has to be of the MouthPart class
		// This field was defined in the Animal class
		// Since Beak is a MouthPart (extends the MouthPart class), it qualifies
		this.mouthPart = new Beak();
	}
	
	// Notice that Bird inherits move() and eat() from Animal
	// Since eat() is a non-abstract method (has a method body), any class
	// that extends Bird will already have the eat() method
	// It will also eat with its Beak (defined in the constructor)
	// However, each class that extends Bird will still have to define
	// its own move() method, since that method was abstract in Animal and
	// neither Animal nor Bird defined a method body for it
	
}
