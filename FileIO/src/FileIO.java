// FileIO.java Assignment
// Author: Rutledge, Ethan
// Date:   Nov 5, 2019
// Class:  CS163
// Email:  ethanrut@rams.colostate.edu

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
	
	public void readFile( String inputFile ){ 
		File inFile = new File(inputFile);
		
		try {
		Scanner scan = new Scanner(inFile);
		
		while(scan.hasNext()) {
			if (scan.hasNextInt()) {
				System.out.println("Integer: " + scan.nextInt());
			}
			else if (scan.hasNextDouble()) {
				System.out.println("Double: " + scan.nextDouble());
			}
			else {
				System.out.println("String: " + scan.next());
			}
		}
		
		scan.close();
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void writeFile( String outputFile ){ 
		File outFile = new File(outputFile);
		
		try {
			PrintWriter out = new PrintWriter(outFile);
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter text: ");
			String s = scn.next();
			
			while(scn.hasNext()) {
				if (!s.equalsIgnoreCase("stop")) {
					out.println(s);
					
				}
				else {
					out.close();
					scn.close();
					return;
					
				}
			}
	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileIO file = new FileIO();
		file.readFile(args[0]);
		file.writeFile(args[1]);
		

	}
	
}

