package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String q1 = JOptionPane.showInputDialog("what word becomes shorter when you add letters on to it?");
		if(q1.equalsIgnoreCase("short")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}else{
			JOptionPane.showMessageDialog(null, "wrong and you will never know the right answer.");
			
			String q2 = JOptionPane.showInputDialog("How do you drop an egg 100 feet without it breaking?");
			if(q2.equalsIgnoreCase("drop it from 101 feet")) {
				JOptionPane.showMessageDialog(null, "Correct");
			}else{
				JOptionPane.showMessageDialog(null, "wrong and you will never know the right answer.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		}
	}
}
}
