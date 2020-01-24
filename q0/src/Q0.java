import java.util.Scanner;

// Q0.java Assignment
// Author: Rutledge, Ethan
// Date:   Sep 17, 2019
// Class:  CS163
// Email:  ethanrut@rams.colostate.edu

public class Q0 {

	public static void main(String[] args) {
		
		double assign0;
		double assign1;
		double assign2;
		double assign3;
		double assignAverage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First assignment: ");
		assign0 = sc.nextDouble();
		
		System.out.print("Second assignment: ");
		assign1 = sc.nextDouble();
		
		System.out.print("Third assignment: ");
		assign2 = sc.nextDouble();
		
		System.out.print("Fourth assignment: ");
		assign3 = sc.nextDouble();
		
		assignAverage = (assign0 + assign1 + assign2 + assign3) / 4.0;
		
		System.out.printf("Assignment average: %.2f\n", assignAverage);
		
	}
}

