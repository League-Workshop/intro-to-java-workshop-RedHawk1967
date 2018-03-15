package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it");// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		String Adjective = JOptionPane.showInputDialog("Tell a Adjective");
		// Get the user to enter an adjective
String liquid = JOptionPane.showInputDialog("Tell me liquid");
		// Get the user to enter a type of liquid
String part = JOptionPane.showInputDialog("Tell me a body part");
		// Get the user to enter a body part

		// Get the user to enter a verb
String verb = JOptionPane.showInputDialog("Tell me a Verb");
		// Get the user to enter a place
String place = JOptionPane.showInputDialog("Tell me a Place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at																	
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null,"Piranhas are more " + Adjective + " during the day, so cross the river at night. Pirhans are attracted to fresh " + liquid + " and will most likely take a bit out of your " + part + " if you are " + verb + ". Whatever you do, if you have an open wound try to find another way to " + place + ". Good Luck and hope you die" );

	}
}

