import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of side 1 of the triangle");
		int side1 = scanner.nextInt();
		System.out.println("Enter length of side 2 of the triangle");
		int side2 = scanner.nextInt();
		System.out.println("Enter length of side 3 of the triangle");
		int side3 = scanner.nextInt();
		scanner.close();
		
		if(side1 == side2 && side2 == side3){
			System.out.println("The triangle is an equilateral triangle");
		}
		else{
			if(side2 > side1 && side2 > side3){
				double hyp = side2 * side2;
				double angle = side1 * side1 + side3 * side3;
				if(hyp == angle){
					System.out.println("The triangle is a right angled triangle");
				}
				else{
					System.out.println("The triangle is not a right angled triangle");
				}
			}
			else if(side3 > side1 && side3 > side2){
				double hyp = side3 * side3;
				double angle = side1 * side1 + side2 * side2;
				if(hyp == angle){
					System.out.println("The triangle is a right angled triangle");
				}
				else{
					System.out.println("The triangle is not a right angled triangle");
				}
			}		
			else{
				double hyp = side1 * side1;
				double angle = side3 * side3 + side2 * side2;
				if(hyp == angle){
					System.out.println("The triangle is a right angled triangle");
				}
				else{
					System.out.println("The triangle is not a right angled triangle");
				}
			}	
		}
	}

}
