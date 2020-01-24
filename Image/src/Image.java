// P8 Assigment
// Author: Rutledge, Ethan
// Date: Oct 11, 2019
// Class: CS163
// Email: ethanrut@rams.colostate.edu 

public class Image implements RecitationInterface {
	
	PictureLibrary picLib = null;
	int width = 0;
	int height = 0;
	int[][] img;
	int MAX = PictureLibrary.MAXVAL;
	
	public Image() {
		picLib = new PictureLibrary();
	}
	
	public void readImage(String inFile) {
		try {
			picLib.readPGM(inFile);
			width = picLib.getWidth();
			height = picLib.getHeight();
			img = picLib.getData();	
		}
		catch (Exception e){
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

	public void negateImage() {

		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[0].length; j++) {
				img[i][j] = MAX - img[i][j];
			}
		}
	}

	public void increaseContrast() {
		
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				if (img[i][j] >= 0 && img[i][j] <= 127) {
					if (img[i][j] - 16 >= 0) {
						img[i][j] -= 16;
					}
					else {
						img[i][j] = 0;
					}
				}
				else if (img[i][j] >= 128 && img[i][j] <= MAX) {
					if(img[i][j] + 16 <= MAX) {
						img[i][j] += 16;
					}
					else {
						img[i][j] = MAX;
					}
				}
			}
		}	
	}

	public void decreaseContrast() {
		
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				if (img[i][j] >= 0 && img[i][j] <= 127) {
					img[i][j] += 16;
				}
				else if (img[i][j] >= 128 && img[i][j] <= MAX) {
					img[i][j] -= 16;
				}
			}
		}	
	}

}
