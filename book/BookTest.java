package book;

// Ex 5.9 Pg 115
import java.util.*;

public class BookTest {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
        Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Select an option: Press [A] to [A]dd book, [S] to [S]how list of books, or [E] to [E]xit program.");
            String response = input.next();

            switch (response) {
                case "A":
                    System.out.println("Enter book name: ");
					String name = input.next();
                    System.out.println("Enter name of author: ");
					String author = input.next();
                    System.out.println("Enter name of publisher: ");
					String publisher = input.next();
                    System.out.println("Enter ISBN number: ");
					int isbn = input.nextInt();
                    System.out.println("Enter date of publication: ");
					String publishedDate = input.next();

					books.add(new Book(name, author, publisher, isbn, publishedDate));
                    break;

				case "S":
					System.out.println("==== Stored Books ====");

					for(int i=0; i<books.size(); i++){
						System.out.println(books.get(i).displayBookInfo());
					}
					break;

                case "E":

                    System.out.println("==== Program ENDED ====");
                    return;
            
                default:
                    break;
            }
		}
	}
}
