import java.util.Scanner;

// hw00.java Assigment
// Author: Rutledge, Ethan
// Date: Oct 4, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class hw00 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double j = 1.0;
		
		while (j != 0.0) {
			System.out.print("Value:");
			
			if (scan.hasNextDouble()) {
				j = scan.nextDouble();
				double i = Math.pow(Math.sin(j), 2) + Math.pow(Math.cos(j), 2);
				
				if (i >= 0.95 && i <= 1.05) {
					System.out.printf("%f is close to 1.0\n", i);
				}
				else {
					System.out.printf("%f is not close to 1.0\n", i);
				}
			}
		}
	}

}
