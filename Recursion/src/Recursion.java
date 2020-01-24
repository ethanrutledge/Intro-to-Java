// Recursion.java Assignment
// Author: Rutledge, Ethan
// Date:   Nov 19, 2019
// Class:  CS163
// Email:  ethanrut@rams.colostate.edu

public class Recursion implements IR17{

	public static void main(String[] args) {

		Recursion rec = new Recursion();
		System.out.println("pracSeq1(int x):");
		System.out.println("Answer: " + rec.pracSeq1(5) + "   Expecting: 32");
		System.out.println("Answer: " + rec.pracSeq1(7) + "   Expecting: 128\n");

		System.out.println("sequence(int x):");
		System.out.println("Answer: " + rec.sequence2(4) + "   Expecting: 11");
		System.out.println("Answer: " + rec.sequence2(5) + "   Expecting: 20\n");

		System.out.println("sequence3:");
		System.out.println("Answer: " + rec.sequence3(2) + "   Expecting: 7");
		System.out.println("Answer: " + rec.sequence3(3) + "   Expecting: 20");
		System.out.println("Answer: " + rec.sequence3(6) + "   Expecting: 547\n");

	}
	
	
	@Override
	public int pracSeq1(int n) {
		if(n <= 0) return 1;
		
		int ret = 2 * pracSeq1(n - 1);
				
		return ret;
	}

	@Override
	public int sequence2(int n) {
		if (n == 0) return 1;
		if (n == 1) return 2;
		if (n == 2) return 3;
		
		
		int ret = sequence2(n - 1) + sequence2(n - 2) + sequence2(n - 3);
		
		return ret;
	}

	@Override
	public int sequence3(int n) {
		if(n == 0) return 1;
		if(n == 1) return 2;
		if(n == 2) return 7;
		
		int ret = 2 * sequence3(n - 1) + 3*sequence3(n - 2);
		
		return ret;
	}	
}

