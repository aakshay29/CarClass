import java.util.Scanner;
public class InvoiceArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0; 
		int number = 0;
		double myPrices[] = new double[100];
		System.out.println("Tax rate?: ");
		double taxrate = scanner.nextDouble();
		for(int i = 0; i < 100; i++){
			number = i+1;
			System.out.println("Price #" + number);
			double nextPrice = scanner.nextDouble();
			if(nextPrice == 0)
				break;
			myPrices[i] = nextPrice;
		}
		for(int i = 0; i < number-1; i++){
			total += myPrices[i];
			int number2 = i+1;
			System.out.println("Price #" + number2 + ": $" + myPrices[i]);
		}
		System.out.println("Subtotal: $" + String.format("%.02f", total));
		String formattedTaxrate = String.format("%.02f", taxrate) + "%";
		System.out.println("Tax: " + formattedTaxrate);
		double grandtotal = total + (total*taxrate);
		System.out.println("Grandtotal: $" + String.format("%.02f", grandtotal));
		
		scanner.close();
	}

}
