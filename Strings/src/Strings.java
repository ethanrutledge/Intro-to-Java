// Strings.java Assigment
// Author: Rutledge, Ethan
// Date: Sep 24, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class Strings {

	public static void main(String[] args) {
	
		String myString0 = "Java";
		String myString1 = "Programming";
		String myString2 = "Language";
		
		System.out.println(myString0 + " is a " + myString1 + " " + myString2 + ".");
		System.out.println(myString1.length() + myString2.length());
		System.out.println(myString1.charAt(1) + "," + myString1.charAt(3) + "," + myString1.charAt(6));
		System.out.println(myString0.indexOf('a'));
		System.out.println(myString2.toUpperCase());
		System.out.println(myString1.substring(3,9));
		
		String myString3 = new String("Whatever!");
		String myString4 = new String("Whatever!");
		
		System.out.println(myString3 == myString4);
		System.out.println(myString3.contentEquals(myString4));
		
		char c0 = '^';
		char c1 = 'G';
		char c2 = '7';
		
		System.out.println(c0 + ";" + c1 + ";" + c2);
		
		int n0 = c0;
		int n1 = c1;
		int n2 = c2;
		
		System.out.println(n0 + "," + n1 + "," + n2);
		
	}

}
