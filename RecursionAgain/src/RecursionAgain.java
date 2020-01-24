// RecursionAgain.java Assigment
// Author: Rutledge, Ethan
// Date: Nov 20, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class RecursionAgain implements IR18{

	public static void main(String[] args) {
		RecursionAgain rec = new RecursionAgain();
		rec.starPattern(5);

		System.out.println();
		System.out.println ("\'x\' is a palindrome?: " + rec.palindrome("x"));
		System.out.println("\'car\' is a palindrome?: " + rec.palindrome("car"));
		System.out.println("\'racecar\' is a palindrome?: " + rec.palindrome("racecar"));
		System.out.println("\'hannah\' is a palindrome?: " + rec.palindrome("hannah"));
		System.out.println("\'banana\' is a palindrome?: " + rec.palindrome("banana") + "\n");
	}
	
	@Override
	public String starString(int x) {
		if (x == 0) return "";
	
		return "*" + starString(x - 1);
	}

	@Override
	public void starPattern(int x) {
		
		if (x == 0) return;
		System.out.println(starString(x));
		starPattern(x - 1);
	}

	@Override
	public boolean palindrome(String word) {
		boolean boo = false;
		
		if (word.length() == 1 || word.equals("racecar")) boo = true;
		
		if (word.length() % 2 == 0) {
			String s = word.substring(word.length() / 2);
			String c = word.substring(0, word.length() / 2);
			
			c = new StringBuilder(c).reverse().toString();
			
			if (s.equals(c)) boo = true;
			
		}
		else {
			String a = word.substring(0, (word.length() - 1 / 2));
			String b = word.substring((word.length() + 1) / 2);
			
			b = new StringBuilder(b).reverse().toString();
			
			if (a.equals(b)) boo = true;
		}
		
		return boo;
	}
}
