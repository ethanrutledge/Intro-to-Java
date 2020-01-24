// Species.java Assigment
// Author: Rutledge, Ethan
// Date: Oct 21, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class Species {
	// Put the instance variable here.
	String name;
	int pop;
	int growthRate;
	
    // ....

    // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.

    // ....
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.
	
	public Species(String name, int pop, int growthRate) {
		if (pop < 1) {
			pop = 1;
		}
		else if (pop > 1500) {
			pop = 1500;
		}
		if (growthRate < 1) {
			growthRate = 1;
		}
		else if (growthRate > 20) {
			growthRate = 20;
		}
		this.name = name;
		this.growthRate = growthRate;
		this.pop = pop;
	}

    public void mergeSpecies(Species other) {
    	pop += other.pop;
    	growthRate += other.growthRate;
    	name = name + other.name;
    }

    public String toString(){
       String s = "\n";
       s += "Name of species: " + name + "\n";
       s += "Population: " + pop + "\n";
       s += "Growth Rate: " + growthRate + "\n";
    		   	 
       return s;
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.

    public void grow() {
        this.pop += ((double)(this.growthRate/100.0))*((double)this.pop);
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
        int futurePop = 0;
   
    	futurePop = (int) ((double)(this.pop) * Math.exp((double)((x) * (double)(this.growthRate/100.0))));
       
        return futurePop;
    }

    public static void main(String[] args) {

        // Put simple code here to test the Species class.  It is always a good idea to include
        // a main method in any class you define.

        Species a = new Species("Frog", 100, 10);
        System.out.println(a);

        a.grow();
        System.out.println(a);

        System.out.println("a.populationInXYears(10) returns " + a.populationInXYears(2));
        System.out.println("");
        
        Species b = new Species("Rabbit", 10, 23);
        a.mergeSpecies(b);
        System.out.println("a.mergeSpecies(b) is " + a);
        
    }
}
