import java.util.Scanner;
public class ChooseYourAdventure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
		String response = scanner.nextLine();
		if(response.equalsIgnoreCase("upstairs")){
			System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?");
			response = scanner.nextLine();
			if(response.equalsIgnoreCase("bedroom")){
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
				response = scanner.nextLine();
				if(response.equalsIgnoreCase("yes")){
					System.out.println("Congrats! You have found a treasure!");
				}
				else if(response.equalsIgnoreCase("no")){
					System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements");
				}
				else{
					System.out.println("Incorrect choice");
				}
			}
			else if(response.equalsIgnoreCase("bathroom")){
				System.out.println("Would you like to open the bathroom cabinet?");
				response = scanner.nextLine();
				if(response.equalsIgnoreCase("yes")){
					System.out.println("Congrats! You have found a treasure!");
				}
				else if(response.equalsIgnoreCase("no")){
					System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements");
				}
				else{
					System.out.println("Incorrect choice");
				}
			}
			else{
				System.out.println("Incorrect choice");
			}
		}
		else if(response.equalsIgnoreCase("kitchen")){
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
			response = scanner.nextLine();
			if(response.equalsIgnoreCase("refrigerator")){
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
				response = scanner.nextLine();
				if(response.equalsIgnoreCase("yes")){
					System.out.println("Congrats! You have found tasty food!");
				}
				else if(response.equalsIgnoreCase("no")){
					System.out.println("You die of starvation... eventually.");
				}
				else{
					System.out.println("Incorrect choice");
				}
			}
			else if(response.equalsIgnoreCase("cabinet")){
				System.out.println("Would you like to open the cabinet?");
				response = scanner.nextLine();
				if(response.equalsIgnoreCase("yes")){
					System.out.println("Congrats! You have found tasty food!");
				}
				else if(response.equalsIgnoreCase("no")){
					System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements");
				}
				else{
					System.out.println("Incorrect choice");
				}
			}
			else{
				System.out.println("Incorrect choice");
			}
		}
		else{
			System.out.println("Incorrect choice");
		}
		scanner.close();
	}

}
