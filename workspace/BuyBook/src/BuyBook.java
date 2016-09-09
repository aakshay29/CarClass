import java.util.Scanner;
public class BuyBook {
static Scanner sc = new Scanner(System.in);
static int totalPrice;
	public static void main(String[] args) {
		int taxRate = 0;
		System.out.println("Enter tax rate: ");
		taxRate = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < 6; i++){
			System.out.println("Enter number of books: ");
			int numberOfBooks = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter book title: ");
			String enteredTitle = sc.nextLine();
			//sc.nextLine();
			
			int bookTotal;
			
			BookDB bookdb  = new BookDB();
			Book book = bookdb.getBook(enteredTitle);
						
			String Title = book.getTitle();
			//String Author = book.getAuthor();
			String Description = book.getDescription();
			int Price = book.getPrice();
			bookTotal = Price * numberOfBooks;
			//boolean isInStock = book.getIsInStock();
			totalPrice += bookTotal;
			
			System.out.println("Item Quantity Description Price Total");
			System.out.println(Title + " " + numberOfBooks + " " + Description + " $" + Price + " $" + bookTotal);
			
//			System.out.println("Total Price: $" + totalPrice + "\n");
//			System.out.println("Entered details: \n----------------\nAuthor: " + Author + "\nTitle: " + Title + "\nDescription: " + Description + "\nPrice: $" + Price + "\nIn stock: " + isInStock);
//			
//			String finalOutput = book.getDisplayText();
//			System.out.println("\nFinal output: \n-------------\n" + finalOutput + "\n");
		}
		int grandTotal = (totalPrice * taxRate)/100;
		System.out.println("Taxable subtotal: $" + totalPrice);
		System.out.println("Untaxable subtotal: $0");
		System.out.println("Tax Rate: " + taxRate + "%");
		System.out.println("Grand Total: $" + grandTotal);
	}

}
