package org.wecancodeit.flexcode.module4.classesAndInterfaces;

public class Penguin extends Bird implements Swimming {
	
	private Flippers swimPart;
	
	public Penguin() {
		this.swimPart = new Flippers();
	}
	@Override
	public void move() {
		this.swim(this.swimPart);
	}

}
