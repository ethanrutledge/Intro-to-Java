

public class LinkedBookList {

	private BookNode head;
	private int size;
	
	public LinkedBookList(){
		head = null;
		size = 0;
	}
	
	//returns size of the list
	public int size(){
		return size;
	}
	
	//IMPLEMENT -- adds a book to the end of the linked list
	public void add(Book b){
		
		add(b, size);	
	}
	
	//IMPLEMENT -- adds a book at the specific index, 
	//  or at the end if index is greater than size
	public void add(Book b, int index){
		
		BookNode curr = this.head;
		
		if(this.size == 0) {
			head = new BookNode(b);
		}
		else {
			for (int i = 0; i < (index - 1); i++) {
				curr = curr.getNext();
			}
			
			curr.setNext(new BookNode(b));
		}
		
		this.size++;
	}
	
	//IMPLEMENT -- removes a book and returns it, or 
	//	returns null if book is not present
	public Book remove(Book b){
		
		int count = 0;
		BookNode curr = head;
		
		if (curr.getBook().equals(b)) {
			return remove(count);
		}
		else {
			while (curr.getBook() != b && count < size) {
				curr = curr.getNext();
				count++;
			}
			if (count == size) {
				return null;
			}
			else {
				return remove(count);
			}
		}
	}

	//IMPLEMENT -- removes a book at a specific index and returns it, 
	//	or returns null if index is not present
	public Book remove(int index){
		
		BookNode curr = head;
		Book rmv;
		
		if (index < 0 || index > size) {
			return null;
		}
		if (index == 0) {
			rmv = curr.getBook();
			head = curr.getNext();
			
			return rmv;
		}
		
		for (int i = 0; i < index - 1; i++) {
			curr = curr.getNext();
		}
		
		rmv = curr.getNext().getBook();
		curr.setNext(curr.getNext().getNext());
		
		return rmv;
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){
		
		int sum = 0;
		
		for(BookNode i = head; i != null; i = i.getNext()) {
			sum += i.getBook().getNumPages();
		}

		return sum;
	}
	

        public String toString()
        {
                String res = "";
                for (BookNode pos = head; pos != null; pos = pos.getNext()) {
                        if (pos.getBook() == null) {
                                res += "null";
                        } else {
                                res += pos.getBook();
                        }

                        if (pos.getNext() != null) res += "\n";
                }
                return res;
        }

}




