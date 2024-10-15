package week1Day2HomeAssignments;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Library objlib = new Library();
			String title = objlib.addBook("Harry Potter");
			System.out.println("Book Title: "+title);
			objlib.issueBook();
		}
	}