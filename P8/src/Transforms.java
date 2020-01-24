// Transforms.java Assigment
// Author: Rutledge, Ethan
// Date: Oct 11, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class Transforms implements ImageInterface{
	
	PictureLibrary picLib = null;
	int width = 0;
	int height = 0;
	int[][] img;
	final int MAXVAL = picLib.MAXVAL;
	
	public Transforms() {
		picLib = new PictureLibrary();
	}
	
	public void readImage(String inFile) {
		try {
			picLib.readPGM(inFile);
			width = picLib.getWidth();
			height = picLib.getHeight();
			img = picLib.getData();	
		} catch (Exception e){
			System.out.println(e.getMessage());
		}	
	}

	public void writeImage(String outFile) {
		try {
			picLib.setData(img);
			picLib.writePGM(outFile);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}	
	}

	public int[][] imageData() {
		return img;
	}

	public void decode() {
		int up = 0;
		int low = 0;
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				up = img[i][j] / 16;
				low = img[i][j] % 16;
				up = 15 - up;
				img[i][j] = (up * 16) + low;
			}
		}
	}

	public void swap() {
		int up;
		int mid;
		int low;
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				up  = img[i][j] & 0b11000000;
				mid = img[i][j] & 0b00111100;
				low = img[i][j] & 0b00000011;
				img[i][j] = (low << 6) | mid | (up >> 6);
			}
		}
		
	}

	public void mirror() {
		int[][] tempImg = new int[height][width];
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				tempImg[i][j] = img[i][j];
			}
		}
		for (int i = 0; i < img.length; i++) {
			img[i] = tempImg[img.length - (i+1)];
		}
		
	}

	public void exchange() {
		int[][] tempImg = new int[height][width];
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				tempImg[i][j] = img[i][j];
			}
		}
		for (int i = 10; i < 310; i++) {
			for (int j = 10; j < 160; j++) {
				img[i][j] = tempImg[i][j + 300];
			}
		}
		for (int i = 10; i < 310; i++) {
			for (int j = 310; j < 460; j++) {
				img[i][j] = tempImg[i][j - 300];
			}
		}
		
	}
}
