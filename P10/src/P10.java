// P10.java Assigment
// Author: Rutledge, Ethan
// Date: Nov 7, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

import java.util.Date;
import java.util.Scanner;

public class P10 implements Interface {
	
	public static void main(String[] args) {
		
		
		// Instantiate code
	    P10 p10 = new P10();
	    
	    // Test readTemperatures
	    Temperature[] data = p10.readTemperatures(args[0]);
	    System.out.println(data[1]);
	    
	    /*
	    // Test findMinimum
	    Date start = Temperature.createDate("04-Jul-2008", "06:00");
	    Date end = Temperature.createDate("17-Aug-2010", "23:00");
	    System.out.println("Verifying findMinimum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Minimum = %.1f degrees\n", p10.findMinimum(start, end, data));

	    // Test findMaximum 
	    start = Temperature.createDate("19-Sep-2011", "07:00");
	    end = Temperature.createDate("23-Mar-2015", "13:00");
	    System.out.println("Verifying findMaximum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Maximum = %.1f degrees\n", p10.findMaximum(start, end, data));

	    // Test findAverage
	    start = Temperature.createDate("09-Apr-2006", "19:00");
	    end = Temperature.createDate("31-Oct-2013", "10:00");
	    System.out.println("Verifying findAverage method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Average = %.1f degrees\n", p10.findAverage(start, end, data));

	    // Test findHighest
	    start = Temperature.createDate("01-Jan-2015", "00:00");
	    end = Temperature.createDate("31-Dec-2015", "23:00");
	    System.out.println("Verifying findHighest method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Highest windspeed = %.1f\n", p10.findHighest(start, end, data));
	
		*/
	}

	@Override
	public Temperature[] readTemperatures(String filename) {
		
		Scanner scn = new Scanner(filename);
		int totNum = scn.nextInt();
		
		Temperature[] temps = new Temperature[totNum];
		
		String date;
		String time;
		double temp;
		double speed;
	
		for (int i = 0; i < totNum - 1; i++) {
			date = scn.next();
			time = scn.next();
			temp = scn.nextDouble();
			speed = scn.nextDouble();
			
			temps[i] = new Temperature(date, time, temp, speed);
		}
		
		scn.close();
		return temps;
	}

	@Override
	public double findMinimum(Date start, Date end, Temperature[] data) {
		double min = 10000.0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i].inInterval(start, end)) {
				if ( data[i].temperature < min) {
					min = data[i].temperature;
				}
			}
		}
		return min;
	}

	@Override
	public double findMaximum(Date start, Date end, Temperature[] data) {
		double max = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i].inInterval(start, end)) {
				if ( data[i].temperature > max) {
					max = data[i].temperature;
				}
			}
		}
		return max;
	}

	@Override
	public double findAverage(Date start, Date end, Temperature[] data) {
		double tot = 0.0;
		double count = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i].inInterval(start, end)) {
				count++;
				tot += data[i].temperature;
			}
		}
		
		double ave = tot/count;
		
		return ave;
	}

	@Override
	public double findHighest(Date start, Date end, Temperature[] data) {
		double max = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i].inInterval(start, end)) {
				if ( data[i].windspeed > max) {
					max = data[i].windspeed;
				}
			}
		}
		return max;
	}	
}
