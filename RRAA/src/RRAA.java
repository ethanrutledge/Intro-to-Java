// RRAA.java Assigment
// Author: Rutledge, Ethan
// Date: Dec 3, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class RRAA implements IR19
{

	public static void main(String[] args) {
		RRAA rec = new RRAA();
		System.out.println("sumDigits(int x):");
		System.out.println("Answer (1234): " + rec.sumDigits(1234) + "   Expecting: 10");
		System.out.println("Answer (7): " + rec.sumDigits (7) + "   Expecting: 7");
		System.out.println("Answer (6789): " + rec.sumDigits (6789));
		System.out.println();

		System.out.println("countCannonballs (int x):");
		System.out.println("Answer (1): " + rec.countCannonballs(1) + "   Expecting: 1");
		System.out.println("Answer: " + rec.countCannonballs (4) + "   Expecting: 30");
		System.out.println("Answer (10): " + rec.countCannonballs (10));
		System.out.println();
		
		System.out.println("numDigits(int x):");
		System.out.println("Answer (1234): " + rec.numDigits(1234) + "   Expecting: 4");
		System.out.println("Answer (7): " + rec.numDigits (7) + "   Expecting: 1");
		System.out.println("Answer (678900): " + rec.numDigits (678900));
		System.out.println();
		
		System.out.println(rec.backString("yes"));
		System.out.println(rec.backString("racecar"));
		System.out.println(rec.backString("h"));
	}
	
	@Override
	public int sumDigits(int n) {
		
		String s = Integer.toString(n);
		int maxCnt = s.length();
		
		return sumDigits(s, 0, 0, maxCnt);
	}
	
	private int sumDigits(String s, int sum, int cnt, int maxCnt) {
		
		if (cnt == maxCnt) return sum;
		
		String c = s.charAt(cnt) + "";
		
		sum += Integer.parseInt(c);
		
		return sumDigits(s, sum, cnt + 1, maxCnt);
	}

	@Override
	public int countCannonballs(int n) {
		
		return countCannonballs(n, 0, 0);
	}

	private int countCannonballs(int stackH, int cnt, int sum) {
		
		if (cnt > stackH) return sum;
		
		sum += Math.pow(cnt, 2);
		
		return countCannonballs(stackH, cnt + 1, sum);
	}
	
	@Override
	public int numDigits(int n) {
		
		
		return Integer.toString(n).length();
	}

	@Override
	public String backString(String s) {
		
		String c = new StringBuilder(s).reverse().toString();
		
		return c;
	}

}
