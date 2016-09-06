import java.util.Scanner;
public class WhatIfActivity {

	public static void main(String[] args) {
		
		String ID, Name, Code;
		double amount, taxPercent = -1, totalAmount;
		Scanner keyboard = new Scanner(System.in);
		System.out.print( "Enter customer ID:" );
		ID = keyboard.next();
		System.out.print( "Enter Name:" );
		Name = keyboard.next();
		System.out.print( "Enter tax code:" );
		Code = keyboard.next();
		System.out.print( "Enter amount:" );
		amount = keyboard.nextInt();
		
		if(Code.equalsIgnoreCase("NRM"))
			taxPercent = 0.06;
		else if(Code.equalsIgnoreCase("NPF"))
			taxPercent = 0;
		else if(Code.equalsIgnoreCase("BIZ"))
			taxPercent = 0.045;

		if(taxPercent == -1){
			System.out.println("Incorrect tax code");
		}
		else{
		totalAmount = (amount * taxPercent) + amount;	
		System.out.println("Customer ID: " + ID + "\n" + 
				"Customer Name: " + Name + "\n" + 
				"Sales Amount: $" + amount + "\n" + 
				"Tax Code: " + Code + "\n" + 
				"Total Amount Due: $" + totalAmount + "\n");
		}
		
		keyboard.close();

	}

}
