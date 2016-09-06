import java.util.Scanner;

public class PairProcess {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		int sum = num1 + num2;
		int product = num1 * num2;
		int average = sum/2;
		
		if(sum > 200){
			System.out.println("Sum: " + sum + "*\n" + "Product: " + product + "\nAverage: " + average);
		}
		else{
			System.out.println("Sum: " + sum + "\n" + "Product: " + product + "\nAverage: " + average);
		}
		keyboard.close();
	}
}