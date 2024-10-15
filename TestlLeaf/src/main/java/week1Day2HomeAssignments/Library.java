package week1Day2HomeAssignments;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println(bookTitle + " Book Added Successfully");
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}

	public static void main(String[] args) {
		Library objLibrary = new Library();
		String title = objLibrary.addBook("Wonder women");
		System.out.println("Book Title: " + title);
		objLibrary.issueBook();
	}
}
