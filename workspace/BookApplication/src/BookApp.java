import java.util.Scanner;
public class BookApp {
static Scanner sc = new Scanner(System.in);
static int totalPrice;
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++){
			System.out.println("Enter book title: ");
			String enteredTitle = sc.nextLine();
			BookDB bookdb  = new BookDB();
			Book book = bookdb.getBook(enteredTitle);
			
			String Title = book.getTitle();
			String Author = book.getAuthor();
			String Description = book.getDescription();
			int Price = book.getPrice();
			boolean isInStock = book.getIsInStock();
			totalPrice += book.getTotal();
			
			System.out.println("Total Price: $" + totalPrice + "\n");
			System.out.println("Entered details: \n----------------\nAuthor: " + Author + "\nTitle: " + Title + "\nDescription: " + Description + "\nPrice: $" + Price + "\nIn stock: " + isInStock);
			
			String finalOutput = book.getDisplayText();
			System.out.println("\nFinal output: \n-------------\n" + finalOutput + "\n");
		}
	}

}
