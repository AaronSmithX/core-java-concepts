package org.wecancodeit.flexcode.module4.collectionInterfaces;
import java.util.ArrayList;
import java.util.Collections;

public class InterfacesDemoApp {

	public static void main(String[] args) {
		
		// Create Classroom with students
		Student john = new Student("John", 15);
		Student sally = new Student("Sally", 16);
		Student michael = new Student("Michael", 17);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(sally);
		students.add(john);
		students.add(michael);
		
		
		// ITERABLE INTERFACE DEMO
		Classroom classroom = new Classroom(students);
		System.out.println("Iterating over each student in a classroom...");
		for (Student student : classroom) {
			System.out.println(student);
		}
		System.out.println();
		
		
		// COMPARABLE INTERFACE DEMO
		System.out.println("Printing the ArrayList of students...");
		System.out.println(students);
		
		System.out.println("Sorting and printing the collection...");
		Collections.sort(students);
		
		System.out.println("Reversing and printing the collection...");
		Collections.reverse(students);
		System.out.println(students);
		
		
		// .equals() Override Demo
		System.out.println("Comparing two instances of the same class...");
		StringWrapper one = new StringWrapper("same");
		StringWrapper two = new StringWrapper("same");
		System.out.println("Are they the same? " + (one.equals(two) ? "Yes." : "No."));
	}

}
