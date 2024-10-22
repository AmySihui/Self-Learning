/*
* Repetition3.java
* @author Enda
* 21/10/2024
*/
import javax.swing.JOptionPane;

public class Repetition3{
	public static void main(String args []){
		// Declare variables
		int num = -1, sum = 0;

		while(num != 0){
			// Input
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number, or 0 to EXIT"));

			// Process
			sum += num;
		} // while

		// Process
		// Output
		JOptionPane.showMessageDialog(null, "The sum of the numbers entered is: " + sum);


	} // main
} // class