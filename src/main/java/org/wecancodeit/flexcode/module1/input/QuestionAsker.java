package org.wecancodeit.flexcode.module1.input;

import java.util.Scanner;

// This class exists to streamline user input validation
// It will continue to ask users the same question until it gets a valid
// String or integer response, eliminating loops and try-catch blocks from app code
public class QuestionAsker {
	
	// This Scanner belongs to this class and can't be accessed outside it (private)
	// This is called a "field" or "property" of this class
	private Scanner input;
	
	// Constructor methods set up instances of the class when the "new" keyword is used.
	// They have NO return type, and have to be public.
	public QuestionAsker(Scanner input) {
		// "this.input" refers to the input field of THIS object (see "private Scanner input" above)
		// "input" refers to the Scanner being passed into this method as an argument
		// When a field and a parameter have the same name, use "this" to refer to the field
		this.input = input;
	}
	
	// Multiple constructors can be defined for the same class.
	// The only requirement is that they have different method signatures (accept different parameters).
	// This constructor allows us to create a new QuestionAsker without providing a Scanner.
	// Instead, it will just create its own Scanner.
	public QuestionAsker() {
		this.input = new Scanner(System.in);
	}

	// This method wraps the below method and provides a default parameter
	// In other words, `promptForString` can be called without specifying `allowNums`
	// In that case, `allowNums` will always be false
	public String promptForString(String prompt) {
		return this.promptForString(prompt, false);
	}
	
	// This method prompts the user for a String
	// It doesn't accept empty input, and optionally won't accept answers containing numbers
	public String promptForString(String prompt, boolean allowNums) {
		
		// Continue to prompt the user until we know we have an answer
		boolean answered = false;
		String answer = "";
		while (!answered) {
			
			System.out.println(prompt);
			answer = input.nextLine();
			
			// If the user's answer, trimmed of leading and trailing spaces, is empty
			// Simply repeat the question
			if (answer.trim().length() == 0) {
				System.out.println("Your answer was empty.");
				
				// Go to the next iteration of the loop
				continue;
			}
			
			// If the user's answer contains digits, and they aren't allowed, repeat the question
			if (!allowNums && answer.matches(".*\\d.*")) {
				System.out.println("Your answer shouldn't contain digits.");
				continue;
			}
			
			// If the user's answer wasn't empty, and it didn't contain digits, it's good
			// This ends our while loop
			answered = true;
		}
		
		return answer;
	}
	
	public int promptForInteger(String prompt) {
		
		// Continue to prompt the user until we know we have an answer
		boolean answered = false;
		int answer = 0;
		while (!answered) {

			System.out.println(prompt);
			
			// When the user types, we ALWAYS get String input
			// Our Scanner will try to find an integer, but could throw an Exception otherwise
			try {
				// Get the next integer in the line the user types
				answer = input.nextInt();
			}
			// IF there was no integer, catch the Exception and continue to the next iteration of this loop
			catch(Exception e) {
				System.out.println("That's not a number.");
				
				// Clear the remaining characters from the line so we can accept another integer
				input.nextLine();
				continue;
			}
			
			
			// If the user's answer wasn't empty, and it didn't contain digits, it's good
			// This ends our while loop
			answered = true;
		}
		
		// Clear the Scanner so it can accept String input again before returning the response
		input.nextLine();
		return answer;
	}
}
