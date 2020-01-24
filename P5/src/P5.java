import java.util.Scanner;

// P5.java Assigment
// Author: Rutledge, Ethan
// Date: Sep 23, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class P5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double grossSalary;
		double interest;
		double capitalGains;
		int numExemptions;
		double totIncome;
		double adjIncome;
		double fedTax;
		double stateTax;
		
		System.out.print("Salary: ");
		grossSalary = scan.nextDouble();
		
		System.out.print("Exemptions: ");
		numExemptions = scan.nextInt();
		
		System.out.print("Interest: ");
		interest = scan.nextDouble();
		
		System.out.print("Gains: ");
		capitalGains = scan.nextDouble();
		
		totIncome = grossSalary + interest + capitalGains - 5000;
		
		if (numExemptions > 6) {
			numExemptions = 6;
		}
		
		adjIncome = totIncome - (numExemptions * 1500.00);
		
		fedTax = 0.0;
		if (adjIncome >= 0) {
			fedTax = 0;
		}
		if (adjIncome >= 20000) {
			if (adjIncome >= 35000) {
				fedTax = fedTax + 1950;
			}
			else {
			fedTax = fedTax + ((adjIncome - 20000) * .13);
			}
		}
		if (adjIncome >= 35000) {
			if (adjIncome >= 50000) {
				fedTax = fedTax + 3450.0;
			}
			else {
			fedTax = fedTax + ((adjIncome - 35000) * .23);
			}
		}
		if (adjIncome >= 50000) {
			fedTax = fedTax + ((adjIncome - 50000) * .28);
		}
		
		stateTax = adjIncome * .065;
		
		System.out.printf("Total Income: $%.2f \n", totIncome);
		System.out.printf("Adjusted Income: $%.2f \n", adjIncome);
		System.out.printf("Total Tax: $%.2f \n", fedTax);
		System.out.printf("State Tax: $%.2f \n", stateTax);
		
	}

}
