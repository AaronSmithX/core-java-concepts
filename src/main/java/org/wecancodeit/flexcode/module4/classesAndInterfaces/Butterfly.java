package org.wecancodeit.flexcode.module4.classesAndInterfaces;

public class Butterfly extends Animal implements Flight {
	
	public Butterfly() {
		this.mouthPart = new Probiscus();
	}
	
	@Override
	public void move() {
		this.fly();
	}

}
