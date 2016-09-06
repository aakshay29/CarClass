import java.util.Scanner;
public class ChooseYourAdventure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You live alone in your apartment. You are fast asleep and somebody screams!  Would you like to go \"check\" outside or \"call\" someone?");
		String response = scanner.nextLine();
		if(response.equalsIgnoreCase("check")){
			System.out.println("You reach your door and then hear a little girl laughing right behind the door. Do you want to \"open\" the door or \"lie\" down till morning? ");
			response = scanner.nextLine();
			if(response.equalsIgnoreCase("open")){
				System.out.println("There is no one there! But the bathroom light in on! Check there? Yes/No");
				response = scanner.nextLine();
				if(response.equalsIgnoreCase("yes")){
					System.out.println("Where did this doll come from?");
				}
				else if(response.equalsIgnoreCase("no")){
					System.out.println("Ok then go back to sleep!");
				}
				else{
					System.out.println("Incorrect choice");
				}
			}
			else if(response.equalsIgnoreCase("lie")){
				System.out.println("How can you sleep with all of this going on? Want to call someone? Yes/No");
				response = scanner.nextLine();
				if(response.equalsIgnoreCase("yes")){
					System.out.println("The little girl picks up the phone from the other room and screams!");
				}
				else if(response.equalsIgnoreCase("no")){
					System.out.println("Come on! Do something!");
				}
				else{
					System.out.println("Incorrect choice");
				}
			}
			else{
				System.out.println("Incorrect choice");
			}
		}
		else if(response.equalsIgnoreCase("call")){
			System.out.println("Call doesnt go through! Want to check the \"kitchen\" or the \"living room\" phone?");
			response = scanner.nextLine();
			if(response.equalsIgnoreCase("kitchen")){
				System.out.println("The kitchen light in on! Check there? Yes/No");
				response = scanner.nextLine();
				if(response.equalsIgnoreCase("yes")){
					System.out.println("You see someone there!");
				}
				else if(response.equalsIgnoreCase("no")){
					System.out.println("Ok then go to sleep.");
				}
				else{
					System.out.println("Incorrect choice");
				}
			}
			else if(response.equalsIgnoreCase("living room")){
				System.out.println("The TV was on! Phew! Turn it off? Yes/no");
				response = scanner.nextLine();
				if(response.equalsIgnoreCase("yes")){
					System.out.println("It just turned itself on again!");
				}
				else if(response.equalsIgnoreCase("no")){
					System.out.println("Well you should turn off the TV and go to sleep.");
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
