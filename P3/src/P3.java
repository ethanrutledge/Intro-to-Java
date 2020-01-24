import java.util.Scanner;

// P3.java Assigment
// Author: Rutledge, Ethan
// Date: Sep 16, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class P3 implements P3IF {

	public static void main(String[] args) {
				
			P3 test = new P3();
			
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
				
				double hbu = test.hbu(alphaAcid, ounces);
				
				System.out.printf("The HBUs are %.2f. \n", hbu);
				
				System.out.print("Weight? ");
				weight = scan.nextDouble();
				
				System.out.print("Lovibond? ");
				lovibond = scan.nextDouble();
				
				System.out.print("Volume? ");
				volume = scan.nextDouble();
				
				double srm = test.srm(weight, lovibond, volume);
				
				System.out.printf("The SRM value is %.4f. \n", srm);
				
				scan.close();
				
	}

	public double hbu(double alphaAcid, double ounces) {
		double hbu = alphaAcid * ounces;
		return hbu;
	}

	public double srm(double weight, double lovibond, double volume) {
		double srm = (0.3 * weight * lovibond / volume) + 4.7;
		return srm;
	}

}


