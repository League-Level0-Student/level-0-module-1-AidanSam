package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		
		String bday = JOptionPane.showInputDialog("Is today your birthday? y/n?");
		
		if(bday.equalsIgnoreCase("y")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}else {
			JOptionPane.showMessageDialog(null, "ᴴᵃᵖᵖʸ ᵁNᵇIʳTʰDᵃYᵎ");
		}
	}
}
