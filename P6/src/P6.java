// P6.java Assigment
// Author: Rutledge, Ethan
// Date: Sep 30, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class P6 {
	
	 // Class variables
    public static Maze maze;
    public static int mazeWidth;
    public static int mazeHeight;

    public static void main(String[] args) {

        // Create maze
        String fileName = args[0];
        System.err.println("Maze name: " + fileName);

        // Get dimensions
        maze = new Maze(fileName);
        mazeWidth = maze.getWidth();
        mazeHeight = maze.getHeight();
        System.err.println("Maze width: " + mazeWidth);
        System.err.println("Maze height: " + mazeHeight);

        // Add code to move around maze
        for (int j = 0; j < maze.getHeight(); j++) {
        	
        	if ( maze.getRow() % 2 == 0) {
        		  
        		for (int i = 0; i < maze.getWidth() - 1; i++) {
        			if (maze.moveRight() == false) {
        				maze.moveDown(); maze.moveRight(); maze.moveRight(); maze.moveUp();
        				i++;
        			}	
        		}	
        	}
        	else {
        		
        		for (int i = maze.getColumn(); i > 0; i--) {
        			if (maze.moveLeft() == false) {
            			maze.moveDown(); maze.moveLeft(); maze.moveLeft(); maze.moveUp();
            			i--;
            		}
        		}
        	}
        	maze.moveDown();
        }    
    }
}
