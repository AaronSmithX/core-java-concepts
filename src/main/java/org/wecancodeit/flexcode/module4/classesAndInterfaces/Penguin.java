package org.wecancodeit.flexcode.module4.classesAndInterfaces;

public class Penguin extends Bird implements Swimming {
	
	// We COULD have just made this "Flippers flippers" and that would still work below,
	// in the move() method, since swim() will accept any SwimPart and Flippers extend
	// SwimPart, so we can pass a Flippers object to swim()
	private SwimPart swimPart;
	
	public Penguin() {
		// Penguins use their flippers to swim
		// When we create a Penguin, we need to set its SwimPart to a Flippers object
		this.swimPart = new Flippers();
	}
	
	// Since move() is abstract on Animal (and Bird doesn't define it either),
	// Penguin needs to define its own move() method
	@Override
	public void move() {
		
		// Penguin has a swim() method because Penguin implements Swimming
		// The Swimming interface defines a default swim() method, so the Penguin class
		// doesn't have to define the swim() method itself
		// swim() takes a SwimPart, so we pass it the swimPart property of our Pengin (Flippers)
		this.swim(this.swimPart);
	}

}
