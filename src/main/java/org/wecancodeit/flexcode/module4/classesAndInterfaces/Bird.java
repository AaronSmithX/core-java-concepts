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
	
}
