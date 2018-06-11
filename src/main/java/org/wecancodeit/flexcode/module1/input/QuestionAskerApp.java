package org.wecancodeit.flexcode.module1.input;

public class QuestionAskerApp {

	public static void main(String[] args) {
		
		QuestionAsker asker = new QuestionAsker();
		
		int intResponse = asker.promptForInteger("Please enter a number");
		System.out.println("The integer you entered was: " + intResponse);
		
		String noIntStringResponse = asker.promptForString("Please enter text with no numerical digits");
		System.out.println("The text you entered was: " + noIntStringResponse);
		
		String anyCharsStringResponse = asker.promptForString("Please enter ANY text", true);
		System.out.println("The text you entered was: " + anyCharsStringResponse);
	}

}
