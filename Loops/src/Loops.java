// Loops.java Assigment
// Author: Rutledge, Ethan
// Date: Sep 25, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class Loops {

	public static void main(String[] args) {
		
		// Test reverseString
	    String forward = "Java Programming rules!";
	    System.out.print("Forward string: ");
	    System.out.println(forward);
	    System.out.print("Reverse string: ");
	    reverseString(forward);
	        
	    // Test printAscii
	    System.out.println("ASCII Table");
	    printAscii('!', '9');
	    
	        
	    // Test raiseToPower
	    System.out.printf("3.0 to the 5 = %.3f\n", raiseToPower(3.0, 5));
	    System.out.printf("2.5 to the 2 = %.3f\n", raiseToPower(2.5, 2));
	    
	        
	}
		public static void reverseString(String s) {
		    for (int i = s.length()-1; i >= 0; i--) {
		    	System.out.print(s.charAt(i));
		    }
		    System.out.println();
		}

		public static void printAscii(char start, char end) {
		    for (int i = start ; i <= end; i++) {
		    	System.out.println(i + ": " + Character.toString((char) i));
		    }
		   
		}

		public static double raiseToPower(double number, int exponent) {
		    double ogNum = number;
			int j = exponent;
		    while (j >= 2) {
		    	number = number * ogNum;
		    	j = j - 1;
		    }
		    return number;	
		}
}
