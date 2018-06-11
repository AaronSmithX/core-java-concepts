package org.wecancodeit.flexcode.module4.classesAndInterfaces;

import java.util.ArrayList;

public class AnimalApp {

	public static void main(String[] args) {
		
		// Create the animals
		Butterfly butterfly = new Butterfly();
		Penguin penguin = new Penguin();
		Albatross albatross = new Albatross();
		
		// Have them move
		butterfly.move();
		penguin.move();
		albatross.move();
		
		// Add them to an ArrayList
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(butterfly);
		animals.add(penguin);
		animals.add(albatross);
		
		// Have them eat
		for (Animal animal : animals) {
			animal.eat();
		}
		
		// ===================================================
		// Get all the birds and display them (class extends Bird)
		// ===================================================
		
		// Create a new list to hold the birds
		ArrayList<Bird> birds = new ArrayList<Bird>();
		
		// Iterate all animals and add only birds to the list
		for (Animal animal : animals) {
			if (animal instanceof Bird) { // Check if the animal is in fact a Bird
				birds.add((Bird) animal); // Cast the Animal specifically to a Bird
			}
		}
		
		// Output is pretty because all animals have a .toString() method from the Animal class
		System.out.println("Birds: " + birds);
		
		// ===================================================
		// Get all the swimmers and display them (implements Swimming interface)
		// ===================================================
		
		// Create a new list to hold the swimmers
		ArrayList<Swimming> swimmers = new ArrayList<Swimming>();
		
		// Iterate all animals and ad only swimming animals to the list
		for (Animal animal : animals) {
			if (animal instanceof Swimming) { // Check that the animal can in fact swim
				swimmers.add((Swimming) animal); // Cast the Animal specifically to a Swimming Animal
			}
		}
		
		// Output is pretty because all animals have a .toString() method from the Animal class
		System.out.println("Swimmers: " + swimmers);
	}

}
