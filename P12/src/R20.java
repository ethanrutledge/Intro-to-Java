import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class R20 {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		LinkedBookList lbl = new LinkedBookList();
		
		Scanner scan = new Scanner(new File("top10.txt"));
		int bookCount = (Integer.parseInt(scan.nextLine()));
		
		//reads in all of the books, and adds them to the linked list
		for(int i = 0; i < bookCount; i++){
			String line = scan.nextLine();
			String[] parts = line.split("\t");
			String title = parts[0];
			String author = parts[1];
			int numPages = Integer.parseInt(parts[2]);
			Book b = new Book(title, author, numPages);
			lbl.add(b);
		}
		
		Book b = new Book("lbeh", "bleg", 23);
		lbl.add(b, 0);
		
		System.out.println("Testing add");
		System.out.println(lbl);
		System.out.println("");
		System.out.println("Testing Total Page: " + lbl.totalPages());
		System.out.println("");
		System.out.println("Testing remove");
		System.out.println(lbl.remove(b));
		System.out.println("");
		System.out.println(lbl.toString());
				
		scan.close();
	}
}
