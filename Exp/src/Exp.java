import java.util.Scanner;

// Exp Assignment
// Author: Rutledge, Ethan
// Date:   Sep 5, 2019
// Class:  CS163
// Email:  ethanrut@rams.colostate.edu

public class Exp {

	public static void main(String[] args) 
	{
		
	    /*/ Operator precedence, integer math
	    System.out.println(2 - 23 % 10 + 3 * 12 - 20);
	    // 15
	    
	    // Operator precedence, floating-point math
	    System.out.println(2.4 + 23.1 - 10.0 * 3.1 - 12.5 / 6.25);
	    // -7.5
	    
	    // Operator precedence, mixed math
	    System.out.println(65 % 15 + 3.5 * (5 / 2));
	    // 12
	     */
		
		int A;
		int B;
		int C;
		double positiveRoot;
		double negativeRoot;
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter coefficient A: ");
	    A = sc.nextInt();
	    System.out.print("Enter coefficient B: ");
	    B = sc.nextInt();
	    System.out.print("Enter coefficient C: ");
	    C = sc.nextInt();
	    System.out.printf("Formula: %dx^2 + %dx + %d \n", A , B , C );
	    
	    positiveRoot = ((-B + Math.sqrt(Math.pow(B,2) -4*A*C))/ 2 * A);
	    negativeRoot = ((-B - Math.sqrt(Math.pow(B,2) -4*A*C))/ 2 * A);
	    
	    System.out.printf("Postive root: %.1f \n", positiveRoot);
	    System.out.printf("Negative root: %.1f", negativeRoot);
	    
	    
	    
	    
	}

}

