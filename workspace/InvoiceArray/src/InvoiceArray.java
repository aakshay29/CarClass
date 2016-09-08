import java.util.InputMismatchException;
import java.util.Scanner;
public class InvoiceArray {

	public static void main(String[] args) {
		System.out.println("Welcome to the invoice application. Enter numbers to fill the billing and tax information. Enter any other number to break out.");
		Scanner scanner = new Scanner(System.in);
		double total = 0; 
		int number = 0;
		double myPrices[] = new double[100];
		System.out.println("Tax rate?: ");
		double taxrate = scanner.nextDouble();
		for(int i = 0; i < 100; i++){
			number = i+1;
			System.out.println("Price #" + number);
			double nextPrice = 0;
			try{
				nextPrice = scanner.nextDouble();		
			}
			catch(InputMismatchException Ex){
				System.out.println("End of input");
				break;
			}
			catch(Exception Ex){
				System.out.println(Ex.getMessage());
			}
			finally{
				System.out.println("Thank you");
			}
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
