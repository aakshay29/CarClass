import java.util.Scanner;;
public class Grades {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your test score: ");
		int score = scanner.nextInt();
		char grade = 'F';//I'm not hopeful

		if (score > 89)
		    grade = 'A';
		else if (score > 79)
		    grade = 'B';
		else if (score > 69)
		    grade = 'C';
		else if (score > 59)
		    grade = 'D';
		else 
		    grade = 'F';
		String sign = "";
		int units = score % 10;
		if(units >= 0 && units <=2)
			sign = "-";
		if(units >= 7 && units <=9)
			sign = "+";
		
		System.out.println("Your grade is: " + grade + sign);
		
		scanner.close();
//		if (score > 69)
//		    System.out.println("Very good! You don't have to retake the exam!");
//		else
//		    System.out.println("Did you even look at the book?");
	}
}
