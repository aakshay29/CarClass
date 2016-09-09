
public class BookApp {

	public static void main(String[] args) {

		Book book = new Book();
		book.setAuthor("J.K.Rowling");
		book.setTitle("Harry Potter");
		book.setDescription("Fiction");
		book.setPrice(45);
		book.setIsInStock(true);
		
		String Title = book.getTitle();
		String Author = book.getAuthor();
		String Description = book.getDescription();
		int Price = book.getPrice();
		boolean isInStock = book.getIsInStock();
		
		System.out.println("Entered details: \n----------------\nAuthor: " + Author + "\nTitle: " + Title + "\nDescription: " + Description + "\nPrice: $" + Price + "\nIn stock: " + isInStock);
		
		String finalOutput = book.getDisplayText();
		System.out.println("\nFinal output: \n-------------\n" + finalOutput);
	}

}
