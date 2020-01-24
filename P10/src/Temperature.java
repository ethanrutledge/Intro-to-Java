// Temperature.java: Class for Temperature Analysis
// Author: Ethan Rutledge	
// Date:   11/6/2019
// Class:  CS163
// Email:  ethanrut@rams.colostate.edu

import java.text.SimpleDateFormat;
import java.util.Date;

public class Temperature {

    // Instance data
    public Date date;
    public double temperature;
    public double windspeed;
    
    // Class constructor
    // Look at hints in assignment specification
    public Temperature(String dayMonthYear, String hour, double degrees, double speed) {
    	this.date = createDate(dayMonthYear, hour);
    	this.temperature = degrees;
    	this.windspeed = speed;
    }
    
    // Method to create date
    public static Date createDate(String date, String hour) {
		Date returnDate = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
		String stringDate = date + " " + hour;
		try {
			returnDate = formatter.parse(stringDate);
		} catch (Exception e) {
			System.out.println("Invalid format: " + stringDate);
		}
		return returnDate;
    }

    // Check if date is in interval
    // Look at hints in assignment specification
    public boolean inInterval(Date start, Date end) {
    	boolean b = false;
    	
    	if ((this.date.compareTo(start) >= 0) && (this.date.compareTo(end) <= 0)) {
    		b = true;
    	}
    	return b;
    }
}
