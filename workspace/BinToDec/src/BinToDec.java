import java.util.Scanner;
public class BinToDec {

	public static void main(String[] args) {
		System.out.println("Enter binary number: ");
        Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int len = Integer.toString(number).length();
		int[] iarray = new int[len];
		for (int index = 0; index < len; index++) {
		    iarray[index] = number % 10;
		    number /= 10;
		}
		int total = 0;
		for(int i = 0; i < len; i++){
			if(iarray[i] == 1)
				total += Math.pow(2, i);
		}
		System.out.println("Decimal equivalent: " + total);
		sc.close();
	}

}
