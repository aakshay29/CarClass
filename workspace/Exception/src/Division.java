import java.util.Scanner;

public class Division {
	public static void main(String[] args) {

		int a, b, result = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

		a = input.nextInt();
		b = input.nextInt();
		try {
			result = a / b;
		} 
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
		    System.out.println("finally block will execute.");
		}
		System.out.println("Result = " + result);

		input.close();
	}
}