import java.util.Scanner;

// P4.java Assigment
// Author: Rutledge, Ethan
// Date: Sep 16, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class P4 {
	
		public static void main(String[] args) {
		
		}
		
		   public static String evaluate(String expression) {

		        // Print expression
		        System.out.println(expression);

		        // Declare variables for operands, operator, result, and return value
		        double operand1;
		        double operand2;
		        double result;
		        String operator;
	
		        // Create Scanner object to parse expression
		        Scanner sc = new Scanner(expression);
		        
		        // Use Scanner to read operands and operator
		        
		        operand1 = 0.0;
		        if (sc.hasNextDouble()) {
		        operand1 = sc.nextDouble();
		        }
		        else {
		        	return "Invalid Operand!";
		        }
		        
		        operator = sc.next();
		        
		        operand2 = 0.0;
		        if (sc.hasNextDouble()) {
		        operand2 = sc.nextDouble();
		        }
		        else {
		        	return ("Invalid Operand!");
		        }

		        // Compute a numerical result for the expression
		        switch(operator) {
		        case "+":
		        	result = operand1 + operand2;
		        	break;
		        case "-":
		        	result = operand1 - operand2;
		        	break;
		        case "*":
		        	result = operand1 * operand2;
		        	break;
		        case "/":
		        	result = operand1 / operand2;
		        	break;
		        case "%":
		        	result = operand1 % operand2;
		        	break;
		        case "^":
		        	result = Math.pow(operand1, operand2);
		        	break;
		        	default:
		        		return "Invalid Operator!";
		        }

		        // Convert numerical result to string
		        String returnString = Double.toString(result);

		        // Return result
		        return returnString;
		    }
		}


