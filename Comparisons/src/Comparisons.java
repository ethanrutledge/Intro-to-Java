import java.util.Scanner;

// Comparisons.java Assignment
// Author: Rutledge, Ethan
// Date:   Sep 19, 2019
// Class:  CS163
// Email:  ethanrut@rams.colostate.edu

public class Comparisons {

	public static void main(String[] args) {
		
		boolean boolean0 = true;
		boolean boolean1 = false;
		
		System.out.println("boolean0 is " + boolean0 + ".");
		System.out.println("boolean1 is " + boolean1 + ".");
		
		boolean equals = (11 == 33);
		boolean notEquals = (22 != 44);
		boolean greaterThan = (15 > 25);
		boolean lessThan = (-11 < 13);
		
		System.out.println("(11 == 33) is " + equals);
		System.out.println("(22 != 44) is " + notEquals);
		System.out.println("(15 > 25) is " + greaterThan);
		System.out.println("(-11 < 13) is " + lessThan);
		
		Scanner sc = new Scanner(System.in);
		
		int integer0;
		int integer1;
		
		System.out.print("Enter first integer: ");
		integer0 = sc.nextInt();
		
		System.out.print("Enter second integer: ");
		integer1 = sc.nextInt();
		
		if (integer0 > integer1) {
			System.out.println("First integer is larger than second.");
		}
		else if (integer1 > integer0) {
			System.out.println("Second integer is larger than the first.");
		}
		else {
			System.out.println("Both integers are equal.");
		}
		
		String myString;
		
		System.out.print("Enter a state: ");
		myString = sc.next();
		
		switch(myString) {
			case "Alabama":
			case "Florida":
				System.out.println("Southern State");
				break;
			case "Colorado":
			case "Utah":
				System.out.println("Western State");
				break;
			case "Michigan":
			case "Wisconsin":
				System.out.println("Northern State:");
				break;
			case "Delaware":
			case "Maine":
				System.out.println("Eastern State");
				break;
			default: 
				System.out.println("Not sure where that is, must be in the Midwest!");
		}

	}

}

