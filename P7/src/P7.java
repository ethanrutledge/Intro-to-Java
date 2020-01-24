import java.util.Arrays;

// P7.java Assigment
// Author: Rutledge, Ethan
// Date: Oct 4, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class P7 {

	public static void main(String[] args) {
		
		   int[] integerArray = createIntegers();
	        System.out.println(Arrays.toString(integerArray));
	        double[] doubleArray = createDoubles();
	        System.out.println(Arrays.toString(doubleArray));
	        String[] stringArray = createStrings("Hello There");
	        System.out.println(Arrays.toString(stringArray));
	        char[] charArray = createChars("Java1234!&");
	        System.out.println(Arrays.toString(charArray));

	        // Test processing
	        System.out.println("Sum of integer array = " + sumArray(integerArray));
	        System.out.println("Largest of double array = " + findLargest(doubleArray));
	        System.out.println("Frequency of 'e' = " + charFrequency(stringArray, 'e'));
	        System.out.println("Translated characters = " + Arrays.toString(translateChars(charArray)));
		
	}
	
	public static int[] createIntegers() {
		
		int[] i = {16, 21, 34, 49, 55, 60, 72, 83, 101};
		
		return i;
	}
	
	public static double[] createDoubles() {
	
		double[] i = new double[7];
			
		int x = 0;		
		
		for (double y = 10; y <= 13.0; y = y + 0.5) {
			i[x] = Math.pow(y, 2);
			x++;
		}
		
		return i;
	}
	
	public static String[] createStrings(String h) {
		
		String[] f = new String[4];
		
		f[0] = h;
		f[1] = h.toUpperCase();
		f[2] = h.toLowerCase();
		f[3] = h.substring(1);
		
		return f;
	}

	public static char[] createChars(String i) {
		
		char[] k = new char[i.length()];
		
		int x = 0;
		for (int y = 0; y <= i.length() - 1; y++) {
			k[x] = i.charAt(y);
			x++;
		}	
		return k;
	
	}
	
	public static int sumArray(int[] i) {
		
		int j = 0;
		
		for (int r = 0; r < i.length; r++) {
		
			j += i[r];
		}
		return j;
	}
	
	public static double findLargest(double[] i) {
		
		double b = 0;
		
		for (int w = 0; w < i.length; w++) {
			
			if (b < i[w]) {
				b = i[w];
			}
		}
		return b;
	}
	
	public static int charFrequency(String[] i, char k) {
		
		int p = 0;
		char z;
		
		for (int c = 0; c < i.length; c++) {
			
			for (int n = 0; n < i[c].length(); n++) {
			
				z = i[c].charAt(n);
			
				if (z == k) {
					p++;
				}
			}	
		}
		
		return p;
	}
	
	public static int[] translateChars(char[] h) {
		int[] g = new int[h.length];
		
		for (int y = 0; y < h.length; y++) {
			
			g[y]=h[y];
		}
		
		return g;
	}
}


