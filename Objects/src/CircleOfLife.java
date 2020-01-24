// CircleOfLife.java Assigment
// Author: Rutledge, Ethan
// Date: Oct 21, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class CircleOfLife {
	public static void main(String args[]) {

        // Create a new Species object here, passing in the appropriate arguments
			Species bear = new Species("Bear", 75, 10);
			Species ant = new Species("Ant", 500, 1000);
        // Print out the species' growth rate
			System.out.println(bear.growthRate);
			System.out.println(ant.growthRate);
        // Use the species' toString here
			System.out.println(bear.toString());
			System.out.println(ant.toString());
        // Call populationInXYears here
			System.out.println(bear.populationInXYears(5));
			System.out.println(ant.populationInXYears(5));
        // Create a new Species object here, passing in the appropriate arguments
        // using a very large number for the population (e.g. 100000000)
			Species bug = new Species("Bug", 10000, 50);
        // Print out the species' population to make sure it is set to 1500
			System.out.println(bug.pop);
        // Call populationInXYears here, feel free to hardcode in the int to be passed to the method
			System.out.println(bug.populationInXYears(5));
        // Call mergeSpecies here. Test that mergeSpecies is doing what you expected it to
			ant.mergeSpecies(bear);
			System.out.println(ant);
    }
}
