// Methods Assignment
// Author: Rutledge, Ethan
// Date:   Sep 10, 2019
// Class:  CS163
// Email:  ethanrut@rams.colostate.edu

public class Methods {

	public static void main(String[] args) {
		
		System.out.println(circleArea(2.0));
		System.out.println(sphereVolume(2.0));
		System.out.println(round(2.5));
		System.out.println(pluralize("car"));
		
	}
	
	public static double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
				
	}
	
	public static double sphereVolume(double radius) {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	} 

	
	public static int round(double  A) {
		return (int) Math.floor(A + 0.5);
	}
	
	public static String pluralize(String B) {
		return B+'s';
	}
}



