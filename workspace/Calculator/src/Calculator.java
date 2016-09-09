import java.util.Scanner;
public class Calculator {
static Scanner sc = new Scanner(System.in);
static int firstNumber = 0, action = 0, secondNumber = 0;
	public Calculator(int fn, int sign, int sn) {
		//System.out.println("Welcome to the calculator");
		//System.out.println("What is the the first number? :");
		firstNumber = fn;
		//System.out.println("1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division \n5 - Modulus");
		//System.out.println("What do you want to do? :");
		action = sign;
		//System.out.println("What is the the second number? :");
		secondNumber = sn;
		calculatorFunction();
		
	}
	public double calculatorFunction(){
		double calculation = 0;
		if(action == 1){
			calculation = firstNumber + secondNumber;
		}
		else if(action == 2){
			calculation = firstNumber - secondNumber;
		}
		else if(action == 3){
			calculation = firstNumber * secondNumber;
		}
		else if(action == 4){
			calculation = firstNumber / secondNumber;
		}
		else if(action == 5){
			calculation = firstNumber % secondNumber;
		}
		return calculation;
	}

}
