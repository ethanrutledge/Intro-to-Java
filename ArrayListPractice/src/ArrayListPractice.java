// ArrayListPractice.java Assigment
// Author: Rutledge, Ethan
// Date: Oct 31, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

import java.util.ArrayList; // Import the ArrayList class

public class ArrayListPractice {

	public static void main(String[] args) {
		
		// 1. Create an ArrayList object that holds Strings, initialize the capacity to size 10
		ArrayList<String> solarSystem = new ArrayList<String>(10);
		
		// 2. Add a String for each of the first five planets to the solarSystem ArrayList
		solarSystem.add("Mercury");
		solarSystem.add("Venus");
		solarSystem.add("Earth");
		solarSystem.add("Mars");
		solarSystem.add("Jupiter");
		
		// 3. Below is an example of a for-each loop. It will print the entire contents of your ArrayList so far
		for (String s : solarSystem)
			System.out.print(s + ", ");
		System.out.println();
		
		// 4. At index 3 insert the String containing the name of our planet's only natural satellite
		solarSystem.add(3, "The Moon");
		
		// 5. Use a for-each loop to print the contents of your solarSystem ArrayList again below
		for (String s : solarSystem)
			System.out.print(s + ", ");
		System.out.println();
		
		// 6. Now add our local star and the collective group of celestial objects between Mars and Jupiter at their respective indices
		solarSystem.add(0, "The Sun");
		solarSystem.add(6, "Asteroid Belt");
		
		// 7. The code line below tries to print the element at index 8. Wwhy doesn't it work -- you initialized the capacity to size 10, right?
		// Type your answer here then comment out the line below: The max index is currently 7.
		//System.out.println(solarSystem.get(8));
		
		// 8. Add the remaining planets that come after Jupiter to your ArrayList, go ahead and add Pluto as well
		solarSystem.add("Saturn");
		solarSystem.add("Uranus");
		solarSystem.add("Neptune");
		solarSystem.add("The Moon");
		
		// 9. What is the size of your ArrayList now? Print a line that uses the .size() method on your ArrayList
		System.out.println(solarSystem.size());

		// 10. How is the size bigger then the initial capacity you provided? What happened?
		// Answer: Array Lists are not "locked" to their initial size.
		
		
		// 11. Another ArrayList, solarSystem2 that is a "copy" of your first solarSystem ArrayList
		ArrayList<String> solarSystem2 = solarSystem;
		
		
		// 12. Print solarSystem2 with a for each loop. Is it the same as solarSystem?
		// Answer: Yes
		for (String s : solarSystem2)
			System.out.print(s + ", ");
		System.out.println();
		
		// 13. Remove Pluto from the solarSystem ArrayList. It's not really a planet anyway... D:
		solarSystem.remove(11);
		
		// 14. Print solarSystem2. Has it changed, and if so, why?
		// Answer: Yes, because it is set to be the same as solarSystem, and solarSystem was changed.
		for (String s : solarSystem2)
			System.out.print(s + ", ");
		System.out.println();
		
		// 15. Remove the first seven elements in the solarSystem ArrayList with a for loop, careful you are removing the right indices!
		String rmv = null;
		for (int i = 0; i < 7; i++) {
			solarSystem.set(i, null);
		}
		solarSystem.removeIf(n -> (n==rmv));
		
		// 16. Make another ArrayList of Strings called solarSystem3 and initialize it with these values: Jupiter, Saturn, Uranus, Neptune
		ArrayList<String> solarSystem3 = new ArrayList<String>();
		solarSystem3.add("Jupiter");
		solarSystem3.add("Saturn");
		solarSystem3.add("Uranus");
		solarSystem3.add("Neptune");
		
		// 17. The ArrayLists solarSystem and solarSystem3 should be the same. Check with == and .equals().
		System.out.println(solarSystem == solarSystem3);
		System.out.println(solarSystem.equals(solarSystem3));
		
	}
}