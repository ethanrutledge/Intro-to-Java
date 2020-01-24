// Cloud.java Assigment
// Author: Rutledge, Ethan
// Date: Oct 22, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;

/* Ethan Rutledge */

public class Cloud {
	private ArrayList<Point> points;	
    private boolean debug = false;
	

	/**
	 * Given Constructor
	 */
	public Cloud(){
		points = new ArrayList<Point>();
	}

	public void setDebug(Boolean debug){
		this.debug = debug;	
	}
	

	//TODO Implement Cloud.isEmpty
	/**
	 * @return whether cloud is empty or not
	 */
	public boolean isEmpty(){
		boolean b = false;
		if (0 <= points.size()) {
			b = true;
		}
		return b;
	}


	//TODO Implement Cloud.size
	/**
	 * @return number of points in the cloud
	 */
	public int size(){
		int tot = points.size();
		return tot;
	}

	
	//TODO Implement Cloud.hasPoint
	/**
	 * 
	 * @param p a Point
	 * @return whether p in the cloud
	 */
	public boolean hasPoint(Point p){
		boolean b = false;
		for (int i = 0; i < points.size(); i++) {
			if(points.get(i).equals(p)){
				b = true;
			}
		}
		return b;	
	}

	//TODO Implement Cloud.addPoint
	/**
	 * 
	 * @param p
	 * if p not in points, add p ***at the end*** of points (to keep same order)

	 */
	public void addPoint(Point p){
		if(hasPoint(p) == false) {
			points.add(points.size(), p);
		}
	}

	//Given Cloud.toString
	public String toString(){
		return points.toString();
	}

	//TODO Implement Cloud.extremes
	/**
	 * 
	 * @return an array of doubles: left, right, top, and bottom of points, 
	 *         null for empty cloud
	 */
	public double[] extremes(){
		double[] ext = {100.0, 0.0, 0.0, 100.0};
		if (points.isEmpty()) {
			return null;
		}
		
		for (int i = 0; i < points.size(); i++) {
			if (points.get(i).getX() < ext[0]) {
				ext[0] = points.get(i).getX();
			}
			if(points.get(i).getX() > ext[1]) {
				ext[1] = points.get(i).getX(); 
			}
			if (points.get(i).getY() > ext[2]) {
				ext[2] = points.get(i).getY();
			}
			if (points.get(i).getY() < ext[3]) {
				ext[3] = points.get(i).getY();
			}
		}
		return ext;
	}
	
	//TODO Implement Cloud.centerP
	/**
	 * 
	 * @return: if (cloud not empty) create and return the center point
	 *          else null;
	 */
	public Point centerP(){
		double totX = 0.0;
		double totY = 0.0;
		double countX = 0.0;
		double countY = 0.0;
		for (int i = 0; i < points.size(); i++) {
			totX += points.get(i).getX();
			totY += points.get(i).getY();
			countX++;
			countY++;
		}
		Point center = new Point((totX / countX), (totY / countY));
		return center;
	}


	//TODO Implement Cloud.minDist
	/**
	 * 
	 * @return minimal distance between 2 points in the cloud
	 *         0.0 for a cloud with less than 2 points
	 */
	public double minDist(){
		double minDist = 100;
		if (points.isEmpty() || points.size() == 1) {
			return 0.0;
		}
		else {
			for (int i = 0; i < points.size(); i++) {
				for (int j = 0; j < points.size(); j++) {
					if(points.get(i).equals(points.get(j))) {
					
					}
					else {
						if (points.get(i).euclidDist(points.get(j)) < minDist){
							minDist = points.get(i).euclidDist(points.get(j));
						}
					}
				}
			}
			return minDist;
		}
	}

	//TODO Implement Cloud.crop
	/**
	 * 
	 * @param p1 
	 * @param p2
	 * 
	 * all Points outside the rectangle, line or point spanned
	 * by p1 and p2 are removed
	 *  
	 */
	public void crop(Point p1, Point p2){
		Point rmv = new Point(0.0,0.0);
		Point topR;
		Point bottomL;
		Point topL;
		Point bottomR;
		int size = points.size();
		double maxY;
		double minY;
		double maxX;
		double minX;
		
		if (p1.getY() > p2.getY()) {
			if (p1.getX() > p2.getX()) {
				topR = p1;
				bottomL = p2;
				maxY = topR.getY();
				minY = bottomL.getY();
				maxX = topR.getX();
				minX = bottomL.getX();
			}
			else {
				topL = p1;
				bottomR = p2;
				maxY = topL.getY();
				minY = bottomR.getY();
				maxX = bottomR.getX();
				minX = topL.getX();
			}
		}
		else {
			if (p2.getX() > p1.getX()) {
				topR = p2;
				bottomL = p1;
				maxY = topR.getY();
				minY = bottomL.getY();
				maxX = topR.getX();
				minX = bottomL.getX();
			}
			else {
				topL = p2;
				bottomR = p1;
				maxY = topL.getY();
				minY = bottomR.getY();
				maxX = bottomR.getX();
				minX = topL.getX();
			}
		}
		
		if (p1.equals(p2)) {
			for (int i = 0; i < size; i++) {
				if (!points.get(i).equals(p1)) {
					points.set(i, rmv);
				}
			}
			points.removeIf(n -> (n==rmv));
		}
		else {
			for (int i = 0; i < size; i++) {
				if (points.get(i).getY() > maxY || points.get(i).getY() < minY || points.get(i).getX() < minX || points.get(i).getX() > maxX) {
					points.set(i, rmv);
				}
			}
			points.removeIf(n -> (n==rmv));
		}
 	}
 
	

	/**
	 * @param args:no args
	 */
	public static void main(String[] args) {

		Cloud cloud = new Cloud();
		
		cloud.setDebug(false);
		System.out.println("cloud.debug OFF");
		System.out.println("cloud: " + cloud);
		
		if(!cloud.isEmpty())
			System.out.println("Error: cloud should be empty!");
		
		if(cloud.extremes()!=null)
			System.out.println("Error: extremes should be null!");
		
		if(cloud.minDist()!=0.0)
			System.out.println("Error: minDist should return 0.0!");

			
		Point p31 = new Point(0.0,0.0);
		cloud.addPoint(p31);
		
		Point p22 = new Point(0.0,1.0);
		cloud.addPoint(p22);
			
		Point p42 = new Point(0.0,2.0);
		cloud.addPoint(p42);
		
		Point p33 = new Point(1.0,0.0);
		cloud.addPoint(p33);
		
		Point p37 = new Point(1.0,1.0);
		cloud.addPoint(p37);
		
		Point p39 = new Point(1.0,2.0);
		cloud.addPoint(p39);

		Point p32 = new Point(2.0,2.0);
		cloud.addPoint(p32);
		
		System.out.println("cloud 0: " + cloud);
		
		cloud.crop(p31, p37);
		
		System.out.println("cloud 1: " + cloud);
		
		cloud.crop(p31, p22);
		
		System.out.println("cloud: " + cloud);
		
		cloud.crop(p31, p31);
		
		System.out.println("cloud 2: " + cloud);
		
		System.out.println("center point in cloud: " + cloud.centerP());
		
		Point p77 = new Point(7,7);
		if (cloud.hasPoint(p77))
			System.out.println("Error: point " + p77 + " should not be in cloud!");
		else
			System.out.println("OK: point " + p77 + " is not in cloud");

		double[] extrs = cloud.extremes();
		if(extrs!=null){
			System.out.println("left: " + extrs[0]);
		    System.out.println("right: " + extrs[1]);
		    System.out.println("top: " + extrs[2]);
		    System.out.println("bottom: " + extrs[3]);
		}
		double minD = cloud.minDist();			
		System.out.printf("min dist in cloud: %5.3f \n", minD);				
		
		System.out.println("Test cloud with 1 point");
		Cloud cloud1 = new Cloud();
		Point p = new Point();
		cloud1.addPoint(p);
	    minD = cloud1.minDist();
		System.out.printf("min dist in cloud1: %5.3f \n",  minD);

	}

}
