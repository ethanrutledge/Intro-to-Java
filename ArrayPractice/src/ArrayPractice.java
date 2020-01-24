import java.util.Arrays;

// ArrayPractice.java Assigment
// Author: Rutledge, Ethan
// Date: Oct 8, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class ArrayPractice {
	
	public static double arrayAverage(double[] j) {
		
		double tot = 0;
		
		for (int i = 0; i < j.length; i++) {
			tot += j[i];
		}
		
		double av = tot / j.length;
		
		return av;
	}

	public static void main(String[] args) {
		
		double[] grades = {81.2, 92.5, 48.9, 78.8, 45.5};
		int[] numbers = {12, 42, 33, 67, 92, 58, 33};
		String[] arguments = new String[9];
		
		System.out.println(grades.length);
		System.out.println(numbers.length);
		System.out.println(arguments.length);
		System.out.println(grades[0]);
		System.out.println(grades[2]);
		System.out.println(numbers[numbers.length - 1]);
		
		grades[grades.length - 2] = 90.5;
		numbers[2] = 99;
		
		for (int i = 0; i < arguments.length; i++) {
			if (i > 5) {
				arguments[i] = "C++";
			}
			else {
				arguments[i] = "Java";
			}
		}
	
		for (int i = 0; i < grades.length; i++) {
			System.out.printf(grades[i] + ",");
		}
		System.out.printf("\n");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.printf("\n");
	
		for (int i = 0; i < arguments.length; i++) {
			System.out.print(arguments[i] + "_");
		}
		System.out.printf("\n");
		
		System.out.println(Arrays.toString(grades));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(arguments));
		
		System.out.printf("%.3f", arrayAverage(grades));
	}
}
