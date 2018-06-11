package org.wecancodeit.flexcode.module4.classesAndInterfaces;

public class Butterfly extends Animal implements Flight {
	
	public Butterfly() {
		// All butterflies have a proboscis (the tube they use to drink nectar)
		this.mouthPart = new Proboscis();
	}
	
	// This method overrides the move() method on the Animal superclass
	@Override
	public void move() {
		
		// The Butterfly class already has a fly() method because it implements Flight,
		// and the Flight interface defines a default fly() method
		// If the method WASN'T default, this class would have to define the method
		// itself and provide its own method body
		this.fly();
	}

}
