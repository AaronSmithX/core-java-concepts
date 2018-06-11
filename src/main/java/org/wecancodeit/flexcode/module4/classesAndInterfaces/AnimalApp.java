package org.wecancodeit.flexcode.module4.classesAndInterfaces;

import java.util.ArrayList;

public class AnimalApp {

	public static void main(String[] args) {
		
		// Create the animals
		Butterfly butterfly = new Butterfly();
		Penguin penguin = new Penguin();
		Albatross albatross = new Albatross();
		
		// Have them move
		System.out.println("The animals are on the move...");
		butterfly.move();
		penguin.move();
		albatross.move();
		System.out.println();
		
		// Add them to an ArrayList
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(butterfly);
		animals.add(penguin);
		animals.add(albatross);
		
		// Have them eat
		for (Animal animal : animals) {
			System.out.println("The " + animal + " is going to eat...");
			animal.eat();
			System.out.println();
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
		// Get all the flyers and display them (implements Flight interface)
		// ===================================================
		
		// Create a new list to hold the swimmers
		ArrayList<Flight> flyers = new ArrayList<Flight>();
		
		// Iterate all animals and add only flying animals to the list
		for (Animal animal : animals) {
			if (animal instanceof Flight) { // Check that the animal can in fact fly
				// Cast the Animal specifically as one that implements the Flight interface
				flyers.add((Flight) animal);
			}
		}
		
		// Output is pretty because all animals have a .toString() method from the Animal class
		System.out.println("Flyers: " + flyers);
	}

}
