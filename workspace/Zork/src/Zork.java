import java.util.Random;
import java.util.Scanner;

public class Zork {
	static boolean unlocked = false;
	static boolean money2 = false;
	static boolean money3 = false;
	static boolean money4 = false;
	static boolean money5 = false;
	static boolean money6 = false;
	static boolean money7 = false;
	static boolean money8 = false;
	static boolean hasLamp = false;
	static boolean burgled = false;
	static boolean room1WithLamp = false;
	static boolean room2WithLamp = false;
	static boolean room3WithLamp = false;
	static boolean room4WithLamp = false;
	static boolean room5WithLamp = false;
	static boolean room7WithLamp = false;
	static boolean room8WithLamp = false;
	static int burglarRoom = 0;
	static int totalMoney = 0;
	static int lampRoom = 0;
	static String stash = "";
	static String pathFinder = "";
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Zork.");
		Random rnd = new Random();
		burglarRoom = 2 + rnd.nextInt(8);
		lampRoom = 2 + rnd.nextInt(8);
		pathFinder += "\nYou entered the Foyer. ";
		visitRoom1();
	}

	public static void checkForBurglar(int roomNumber) {
		if (roomNumber == burglarRoom) {
			burgled = true;
			totalMoney = 0;
			System.out.println(
					"There is a burglar in this room who has a knife. You lose all your money in order to protect your life.");
			System.out.println("Your total money now is: $" + totalMoney);
		}
	}

	public static void checkLamp(int roomNumber) {
		if (roomNumber == lampRoom && hasLamp == false) {

			System.out.println(
					"There is a lamp in this room. You can see the rooms better with the lamp. Type \"GetLamp\" to get it.");
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("GetLamp")) {
				hasLamp = true;
			} else {
				System.out.println("You did not pick up the lamp.");
			}

		} else {
			// do nothing
		}
	}

	public static void illuminatedRoom(int roomNumber) {
		if (roomNumber == 1 && hasLamp == true && room2WithLamp == false) {
			System.out.println("it has a spider web made from pure silk containing gold coins. \"Pick up\".");

			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Pick Up")) {
				room1WithLamp = true;
				stash += "Gold Coins. ";
			} else {
				System.out.println("You did not take the gold coins.");
			}

		}
		if (roomNumber == 2 && hasLamp == true && room2WithLamp == false) {
			System.out.println("The piano has the sheet music for your favorite song. \"Play\"?");
			String response = sc.next();
			if (response.equalsIgnoreCase("Play")) {
				room2WithLamp = true;
				stash += "Piano. ";
			} else {
				System.out.println("You did not play the piano.");
			}

		}
		if (roomNumber == 3 && hasLamp == true && room3WithLamp == false) {
			System.out.println("You see a secret message on the wall. \"Inspect Scroll\"");

			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Inspect Scroll")) {
				System.out.println("It says \"What comes down but never goes up?\" What is your answer?");
				response = sc.nextLine();
				if (response.equalsIgnoreCase("Rain")) {
					System.out.println("Congratulations! You got an additional $1000.");
					System.out.println("Your total money now is: $" + totalMoney);
					room3WithLamp = true;
					System.out.println("You can now \"Enter\" the secret room!");
					response = sc.nextLine();
					if (response.equalsIgnoreCase("Enter")) {
						checkLamp(8);
						visitRoom8();
					}
				} else {
					System.out.println("Your answer was incorrect! Re-enter this room to play again.");
				}
			}

		} else if (roomNumber == 3 && hasLamp == false) {

			System.out.println(
					"You are standing in the library. You see a bunch of spiders. {You can go \"east\" to the \"front room\" or \"north\" to the \"dining room\"}");
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("east") || response.equalsIgnoreCase("front room")) {
				pathFinder += "\nYou went to the front room. ";
				payMoney(2);
				checkForBurglar(2);
				checkLamp(2);
				visitRoom2();
			} else if (response.equalsIgnoreCase("north") || response.equalsIgnoreCase("dining room")) {
				pathFinder += "\nYou entered the Dining Room. ";
				payMoney(5);
				checkForBurglar(5);
				checkLamp(5);
				visitRoom5();
			}

		}
		if (roomNumber == 4 && hasLamp == true && room4WithLamp == false) {
			System.out.println("You find food there. \"Drink Coke\" or \"Eat Chips\"");
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Drink Coke")) {
				room4WithLamp = true;
				stash += "Coke. ";
			} else if (response.equalsIgnoreCase("Eat Chips")) {
				room4WithLamp = true;
				stash += "Chips. ";
			} else {
				System.out.println("You did not eat anything.");
			}

		}
		if (roomNumber == 5 && hasLamp == true && room5WithLamp == false) {
			System.out.println("The box has an Amazon Gift Card. \"Get Gift Card\"?");

			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Get Gift Card")) {
				room5WithLamp = true;
				stash += "Amazon Gift Card. ";
			} else {
				System.out.println("You did not take the gift card.");
			}

		}
		if (roomNumber == 7 && hasLamp == true && room7WithLamp == false) {

			System.out.println("This place has a poster of Tom Hanks with 5 tickets to Sully next week. \"Pick Up\"?");
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Pick Up")) {
				room7WithLamp = true;
				stash += "Tom Hanks Poster. 5 Sully movie tickets. ";
			} else {
				System.out.println("You did not pick up the stuff.");
			}

		}
		if (roomNumber == 8 && hasLamp == true && room8WithLamp == false) {
			System.out.println("You found a map of the house. \"Pick Up\"?");

			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Pick Up")) {
				room8WithLamp = true;
				stash += "Map. ";
			} else {
				System.out.println("You did not pick up the map.");
			}

		}
	}

	public static void payMoney(int roomNumber) {
		Random rnd = new Random();
		if (roomNumber == 2 && money2 == false) {
			int moneyFound = (1 + rnd.nextInt(1000));
			totalMoney += moneyFound;
			money2 = true;
			System.out.println("You found $" + moneyFound + " in this room!");
			System.out.println("Your total money now is: $" + totalMoney);
		} else if (roomNumber == 2 && money2 == true) {
			System.out.println("There is no more money in this room.");
			System.out.println("Your total money now is: $" + totalMoney);
		}
		if (roomNumber == 3 && money3 == false) {
			int moneyFound = (1 + rnd.nextInt(1000));
			totalMoney += moneyFound;
			money3 = true;
			System.out.println("You found $" + moneyFound + " in this room!");
			System.out.println("Your total money now is: $" + totalMoney);
		} else if (roomNumber == 3 && money3 == true) {
			System.out.println("There is no more money in this room.");
			System.out.println("Your total money now is: $" + totalMoney);
		}
		if (roomNumber == 4 && money4 == false) {
			int moneyFound = (1 + rnd.nextInt(1000));
			totalMoney += moneyFound;
			money4 = true;
			System.out.println("You found $" + moneyFound + " in this room!");
			System.out.println("Your total money now is: $" + totalMoney);
		} else if (roomNumber == 4 && money4 == true) {
			System.out.println("There is no more money in this room.");
			System.out.println("Your total money now is: $" + totalMoney);
		}
		if (roomNumber == 5 && money5 == false) {
			int moneyFound = (1 + rnd.nextInt(1000));
			totalMoney += moneyFound;
			money5 = true;
			System.out.println("You found $" + moneyFound + " in this room!");
			System.out.println("Your total money now is: $" + totalMoney);
		} else if (roomNumber == 5 && money5 == true) {
			System.out.println("There is no more money in this room.");
			System.out.println("Your total money now is: $" + totalMoney);
		}
		if (roomNumber == 6 && money6 == false) {
			int moneyFound = (1 + rnd.nextInt(1000));
			totalMoney += moneyFound;
			money6 = true;
			System.out.println("You found $" + moneyFound + " in this room!");
			System.out.println("Your total money now is: $" + totalMoney);
		} else if (roomNumber == 6 && money6 == true) {
			System.out.println("There is no more money in this room.");
			System.out.println("Your total money now is: $" + totalMoney);
		}
		if (roomNumber == 7 && money7 == false) {
			int moneyFound = (1 + rnd.nextInt(1000));
			totalMoney += moneyFound;
			money7 = true;
			System.out.println("You found $" + moneyFound + " in this room!");
			System.out.println("Your total money now is: $" + totalMoney);
		} else if (roomNumber == 7 && money7 == true) {
			System.out.println("There is no more money in this room.");
			System.out.println("Your total money now is: $" + totalMoney);
		}
		if (roomNumber == 8 && money8 == false) {
			int moneyFound = (1 + rnd.nextInt(1000));
			totalMoney += moneyFound;
			money8 = true;
			System.out.println("You found $" + moneyFound + " in this room!");
			System.out.println("Your total money now is: $" + totalMoney);
		} else if (roomNumber == 8 && money8 == true) {
			System.out.println("There is no more money in this room.");
			System.out.println("Your total money now is: $" + totalMoney);
		}
	}

	public static void visitRoom1() {
		illuminatedRoom(1);

		System.out.println(
				"You are standing in the foyer of an old house. You see a dead scorpion. {You can go \"north\" to the \"front room\" or \"quit\"}");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("north") || response.equalsIgnoreCase("front room")) {
			pathFinder += "\nYou went to the front room.";
			payMoney(2);
			checkForBurglar(2);
			checkLamp(2);
			visitRoom2();
		} else if (response.equalsIgnoreCase("quit")) {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(4);
			if (randomInt == 1) {
				System.out.println("You have exited the house, but you are being followed by a GHOST!");
			} else {
				System.out.println("You have exited the house, stay safe!");
			}
			System.out.println(
					"\nLog: " + pathFinder + "\n\nYour total money: " + totalMoney + "\n\nYour stash: " + stash);
		}

	}

	public static void visitRoom2() {
		illuminatedRoom(2);

		System.out.println(
				"You are in the front room and you see a piano. {You can go \"south\" to the \"Foyer\" or go \"west\" to the \"Library\" or go \"east\" to the \"kitchen\"}");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("south") || response.equalsIgnoreCase("Foyer")) {
			pathFinder += "\nYou entered the Foyer and saw dead scorpions. ";
			System.out.println("Your total money now is: $" + totalMoney);
			checkForBurglar(1);
			checkLamp(1);
			visitRoom1();
		} else if (response.equalsIgnoreCase("west") || response.equalsIgnoreCase("Library")) {
			pathFinder += "\nYou entered the Library and saw spiders.";
			payMoney(3);
			checkForBurglar(3);
			checkLamp(3);
			visitRoom3();
		} else if (response.equalsIgnoreCase("east") || response.equalsIgnoreCase("kitchen")) {
			pathFinder += "\nYou entered the Kitchen and saw bats. ";
			payMoney(4);
			checkForBurglar(4);
			checkLamp(4);
			visitRoom4();
		}

	}

	public static void visitRoom3() {
		illuminatedRoom(3);
	}

	public static void visitRoom4() {
		illuminatedRoom(4);

		System.out.println(
				"You are standing in the kitchen. You see a lot of bats flying. {You can go \"west\" to the \"front room\" or go \"north\" to the \"parlor\"}");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("west") || response.equalsIgnoreCase("front room")) {
			pathFinder += "\nYou went to the front room.";
			payMoney(2);
			checkForBurglar(2);
			checkLamp(2);
			visitRoom2();
		} else if (response.equalsIgnoreCase("north") || response.equalsIgnoreCase("parlor")) {
			pathFinder += "\nYou entered the Parlor and saw a treasure chest. ";
			payMoney(7);
			checkForBurglar(7);
			checkLamp(7);
			visitRoom7();
		}

	}

	public static void visitRoom5() {
		illuminatedRoom(5);

		System.out.println(
				"You are standing in the dining room. You see a lot of dust and an empty box. {You can go \"south\" to the \"library\" or \"exit\" the game}");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("south") || response.equalsIgnoreCase("library")) {
			pathFinder += "\nYou entered the Library and saw spiders. ";
			payMoney(3);
			checkForBurglar(3);
			checkLamp(3);
			visitRoom3();
		} else if (response.equalsIgnoreCase("quit")) {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(8);
			if (randomInt == 1 || randomInt == 3 || randomInt == 5 || randomInt == 7) {
				System.out.println("What? You came to room 7!");
				pathFinder += "\nYou entered the Parlor and saw a treasure chest. ";
				payMoney(7);
				checkForBurglar(7);
				checkLamp(7);
				visitRoom7();
			} else {
				System.out.println("What? You came to room 2!");
				pathFinder += "\nYou went to the front room.";
				payMoney(2);
				checkForBurglar(2);
				checkLamp(2);
				visitRoom2();
			}
		}

	}

	public static void visitRoom6() {

		System.out.println(
				"You are standing in the vault room. You see 3 walking skeletons. {You can quickly go \"east\" or go \"north\"}");
		String response = sc.nextLine();
		if (unlocked = false) {
			if (response.equalsIgnoreCase("east")) {
				Random rnd = new Random();
				int randomInt = 1 + rnd.nextInt(4);
				if (randomInt == 1) {
					pathFinder += "\nYou unlocked and entered the Secret Room and see piles of gold. ";
					payMoney(8);
					checkForBurglar(8);
					checkLamp(8);
					visitRoom8();
				} else {
					pathFinder += "\nYou entered the Parlor and see a treasure chest. ";
					payMoney(7);
					checkForBurglar(7);
					checkLamp(7);
					visitRoom7();
				}
			} else if (response.equalsIgnoreCase("north")) {
				System.out.println("What? You came to room 2!");
				pathFinder += "\nYou went to the front room.";
				payMoney(2);
				checkForBurglar(2);
				checkLamp(2);
				visitRoom2();
			}
		} else {
			pathFinder += "\nYou entered the Secret Room and see piles of gold. ";
			payMoney(8);
			checkForBurglar(8);
			checkLamp(8);
			visitRoom8();
		}

	}

	public static void visitRoom7() {
		illuminatedRoom(7);

		System.out.println(
				"You are standing in the parlor. You see a treasure chest. {You can go \"west\" to the \"Vault\" or go \"south\" to the \"kitchen\"}");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("west") || response.equalsIgnoreCase("vault")) {
			pathFinder += "\nYou entered the Vault and see 3 walking skeletons. ";
			payMoney(6);
			checkForBurglar(6);
			checkLamp(6);
			visitRoom6();
		} else if (response.equalsIgnoreCase("south") || response.equalsIgnoreCase("kitchen")) {
			pathFinder += "\nYou entered the Kitchen and see bats. ";
			payMoney(4);
			checkForBurglar(4);
			checkLamp(4);
			visitRoom4();
		}

	}

	public static void visitRoom8() {
		illuminatedRoom(8);

		System.out.println(
				"You find the secret room. You see piles of gold. {You can go \"west\" to the \"vault\" with the gold or \"quit\" the game without the gold}");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("west") || response.equalsIgnoreCase("vault")) {
			pathFinder += "\nYou entered the Vault and see 3 walking skeletons. ";
			payMoney(6);
			checkForBurglar(6);
			checkLamp(6);
			visitRoom6();
		} else if (response.equalsIgnoreCase("quit")) {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(4);
			if (randomInt == 1) {
				System.out.println("You have exited the house, but you are being followed by a GHOST!");
			} else {
				System.out.println("You have exited the house, stay safe!");
			}
			System.out.println(
					"\nLog: " + pathFinder + "\n\nYour total money: " + totalMoney + "\n\nYour stash: " + stash);
		}

	}
}
