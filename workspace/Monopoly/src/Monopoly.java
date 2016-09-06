import java.util.Random;

public class Monopoly {
	public static void main(String[] args) {
		Random rnd = new Random();
		boolean isDouble = true;
		int counter = 0;
		int total = 0;
		
		while(isDouble == true){
			int dienumber1 = rnd.nextInt(6) + 1;
			int dienumber2 = rnd.nextInt(6) + 1;
			total = dienumber1 + dienumber2;
			if(dienumber1 != dienumber2){
				isDouble = false;
				System.out.println("User rolls " + dienumber1 + " and " + dienumber2 + "\nMove " + total + " Spaces and stop");
				break;
			}
			else if(counter == 2){
				System.out.println("User rolls " + dienumber1 + " and " + dienumber2 + "\nDOUBLES!!\n" + "Go to jail!");
				isDouble = true;
				counter++;
				break;
			}
			else{
				System.out.println("User rolls " + dienumber1 + " and " + dienumber2 + "\nDOUBLES!!\nMove " + total + " Spaces and roll again getting...");			
				isDouble = true;
				counter++;
			}
		}
	}
}
