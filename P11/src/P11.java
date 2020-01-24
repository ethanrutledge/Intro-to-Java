import java.util.ArrayList;

// P11.java Assigment
// Author: Rutledge, Ethan
// Date: Nov 22, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class P11 implements IP11 {
	
	public static void main(String[] args) {
		
		P11 test = new P11();
		
		// PRINTPATTERN DOES NOT WORK
		test.printPattern(3);
		
		
		// CONVERTNUM WORKS
		
		int[] n = {1, 2, 3, 4, 5};
		int[] m = {0, 9, 8, 2, 1, 0};
		System.out.println(test.convertNum(n));
		System.out.println(test.convertNum(m));
		
		
		
		P11 A3 = new P11();
		  ArrayList<String> AL1 = new ArrayList<String>();
		  ArrayList<String> AL2 = new ArrayList<String>();
		  AL1.add("a"); AL1.add("b"); AL1.add("c");
		  AL2.add("b"); AL2.add("c"); AL2.add("d"); AL2.add("e");
		  ArrayList<String> intersect = A3.intersection(AL1,AL2);
		  System.out.println(AL1 + " intersect " + AL2 + " = " + intersect);	
		
		
	}

	@Override
	public void printPattern(int n) {
		
		if (n == 0) System.out.println();
		
		Pattern(0, n + 1);
	}
	
	private void Pattern(int line, int maxLine) {
		
		if(line > maxLine) return; 
		
		int stars = line;
		int stripes = maxLine - line - 1;
		
		printOUT(stars, stripes);
		
		Pattern(line++, maxLine);
		
	}

	private void printOUT(int stars, int stripes) {
		if (stars == 0 && stripes == 0) System.out.println();
		else if (stars > 0) {
			System.out.print("*");
			printOUT(stars - 1, stripes);
		}
		else if(stripes > 0) {
			System.out.print("-");
			printOUT(stars, stripes - 1);
		}
	}
	
	@Override
	public int convertNum(int[] num) {
		String s = "";
		
		return convertNum(num, 0, num.length - 1, s);
	}
	
	private int convertNum(int[] num, int currIndex, int lastIndex, String result) {
		if (currIndex > lastIndex) return Integer.parseInt(result);
		
		result += Integer.toString(num[currIndex]);
		
		return convertNum(num, currIndex + 1, lastIndex, result);
	}

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		
		ArrayList<String> result = AL1;
		
		return intersection(AL1, AL2, result, 0, AL1.size() - 1, AL2.size() - 1);
	}
	
	private ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2, ArrayList<String> result, int currIndex, int max1Index, int max2Index){
		
		if (currIndex > max1Index) {
			result.removeIf(n -> (n == null));
			return result;
		}
		
		if(!AL2.contains(result.get(currIndex))){
			result.set(currIndex, null);
		}
		
		return intersection(AL1, AL2, result, currIndex + 1, AL1.size() - 1, AL2.size() - 1);
	}
	
	/*
	private boolean check2(ArrayList<String> AL2, ArrayList<String> result, int max2Index, int baseIndex, int currIndex, boolean b) {
		if (currIndex > max2Index) return b;
		
		if(AL2.get(currIndex).equals(result.get(baseIndex))) {
			
		}
		
		return check2(AL2, result, max2Index, baseIndex, currIndex + 1, b);
	}
	*/
	
}
