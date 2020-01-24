import java.util.Scanner;

// P3 Assignment Solution
// Author: Rutledge, Ethan
// Date: Sep 6, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

import java.util.Scanner;

public class P2 {

	public static void main(String[] args){
		
		double alphaAcid;
		double ounces;
		double weight;
		double lovibond;
		double volume;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Alpha Acid? ");
		alphaAcid = scan.nextDouble();
		
		System.out.print("Ounces? ");
		ounces = scan.nextDouble();
		
		double hbu = alphaAcid * ounces;
		
		System.out.printf("The HBUs are %.2f. \n", hbu);
		
		System.out.print("Weight? ");
		weight = scan.nextDouble();
		
		System.out.print("Lovibond? ");
		lovibond = scan.nextDouble();
		
		System.out.print("Volume? ");
		volume = scan.nextDouble();
		
		double srm = (0.3 * weight * lovibond / volume) + 4.7;
		
		System.out.printf("The SRM value is %.4f. \n", srm);
		
		scan.close();
		
	}

}
