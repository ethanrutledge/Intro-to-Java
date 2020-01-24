// Convert.java Assignment
// Author: Rutledge, Ethan
// Date:   Sep 12, 2019
// Class:  CS163
// Email:  ethanrut@rams.colostate.edu

public class Convert implements L6if {
	
	

	public static void main(String[] args) {
		

	}


	public double toPounds(double kilograms) {
		double pounds = (kilograms / LB_KG_CONST);
				return pounds;
	}


	public double toFahrenheit(double celsius) {
		double fahrenheit = (celsius * 9.0/5.0) + 32;
				return fahrenheit;
	}


	public int toASCII(char letter) {
		
				return letter;
	}


	public String webify(String normal) {
		
				return "Https://www." + normal + ".com";
	}

	
	public boolean isEven(int num) {
		boolean ans = num % 2 == 0;
				return ans;
	}

}

