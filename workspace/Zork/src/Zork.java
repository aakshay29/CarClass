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
		}
	}

	public static void checkLamp(int roomNumber) {
		if (roomNumber == lampRoom && hasLamp == false) {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"There is a lamp in this room. You can see the rooms better with the lamp. Type \"Get Lamp\" to get it.");
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Get Lamp")) {
				hasLamp = true;
			} else {
				System.out.println("You did not pick up the lamp.");
			}
			sc.close();
		}
	}

	public static void illuminatedRoom(int roomNumber) {
		if (roomNumber == 1 && hasLamp == true && room2WithLamp == false) {
			System.out.println("it has a spider web made from pure silk containing gold coins. \"Pick up\".");
			Scanner sc = new Scanner(System.in);
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Pick Up")) {
				room1WithLamp = true;
				stash += "Gold Coins. ";
			} else {
				System.out.println("You did not take the gold coins.");
			}
			sc.close();
		}
		if (roomNumber == 2 && hasLamp == true && room2WithLamp == false) {
			System.out.println("The piano has the sheet music for your favorite song. \"Play\"?");
			Scanner sc = new Scanner(System.in);
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Play")) {
				room2WithLamp = true;
				stash += "Piano. ";
			} else {
				System.out.println("You did not play the piano.");
			}
			sc.close();
		}
		if (roomNumber == 3 && hasLamp == true && room3WithLamp == false) {
			System.out.println("You see a scret message on the wall. \"Inspect Scroll\"");
			Scanner sc = new Scanner(System.in);
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
						visitRoom8();
					}
				} else {
					System.out.println("Your answer was incorrect! Re-enter this room to play again.");
				}
			}
			sc.close();
		} else if (roomNumber == 3 && hasLamp == false) {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"You are standing in the library. You see a bunch of spiders. {You can (1)exit to the east or (2)exit to the north}");
			int response = sc.nextInt();
			if (response == 1) {
				pathFinder += "\nYou went to the front room. ";
				payMoney(2);
				checkForBurglar(2);
				visitRoom2();
			} else {
				pathFinder += "\nYou entered the Dining Room. ";
				payMoney(5);
				checkForBurglar(5);
				visitRoom5();
			}
			sc.close();
		}
		if (roomNumber == 4 && hasLamp == true && room4WithLamp == false) {
			System.out.println("You find food there. \"Drink Coke\" or \"Eat Chips\"");
			Scanner sc = new Scanner(System.in);
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
			sc.close();
		}
		if (roomNumber == 5 && hasLamp == true && room5WithLamp == false) {
			System.out.println("The box has an Amazon Gift Card. \"Get Gift Card\"?");
			Scanner sc = new Scanner(System.in);
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Get Gift Card")) {
				room5WithLamp = true;
				stash += "Amazon Gift Card. ";
			} else {
				System.out.println("You did not take the gift card.");
			}
			sc.close();
		}
		if (roomNumber == 7 && hasLamp == true && room7WithLamp == false) {
			System.out.println("This place has a poster of Tom Hanks with 5 tickets to Sully next week. \"Pick Up\"?");
			Scanner sc = new Scanner(System.in);
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Pick Up")) {
				room7WithLamp = true;
				stash += "Tom Hanks Poster. 5 Sully movie tickets. ";
			} else {
				System.out.println("You did not pick up the stuff.");
			}
			sc.close();
		}
		if (roomNumber == 8 && hasLamp == true && room8WithLamp == false) {
			System.out.println("You found a map of the house. \"Pick Up\"?");
			Scanner sc = new Scanner(System.in);
			String response = sc.nextLine();
			if (response.equalsIgnoreCase("Pick Up")) {
				room8WithLamp = true;
				stash += "Map. ";
			} else {
				System.out.println("You did not pick up the map.");
			}
			sc.close();
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
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the foyer of an old house. You see a dead scorpion. {You can (1)exit to the north or press (2) to quit}");
		int response = sc.nextInt();
		if (response == 1) {
			pathFinder += "\nYou went to the front room.";
			payMoney(2);
			checkForBurglar(2);
			visitRoom2();
		} else {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(4);
			if (randomInt == 1) {
				System.out.println("You have exited the house, but you are being followed by a GHOST!");
			} else {
				System.out.println("You have exited the house, stay safe!");
			}
			System.out.println("Log: " + pathFinder + "\n\nYour total money: " + totalMoney + "\n\nYour stash: " + stash);
		}
		sc.close();
	}

	public static void visitRoom2() {
		illuminatedRoom(2);
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are in the front room and you see a piano. {You can (1) exit to the south or (2) exit to the west or (3) exit to the east}");
		int response = sc.nextInt();
		if (response == 1) {
			pathFinder += "\nYou entered the Foyer and saw dead scorpions. ";
			System.out.println("Your total money now is: $" + totalMoney);
			checkForBurglar(1);
			visitRoom1();
		}
		if (response == 2) {
			pathFinder += "\nYou entered the Library and saw spiders.";
			payMoney(3);
			checkForBurglar(3);
			visitRoom3();
		} else {
			pathFinder += "\nYou entered the Kitchen and saw bats. ";
			payMoney(4);
			checkForBurglar(4);
			visitRoom4();
		}
		sc.close();
	}

	public static void visitRoom3() {
		illuminatedRoom(3);
		// Scanner sc = new Scanner(System.in);
		// System.out.println("You are standing in the library. You see a bunch
		// of spiders. {You can (1)exit to the east or (2)exit to the north}");
		// int response = sc.nextInt();
		// if (response == 1) {
		// pathFinder += "\nYou went to the front room. ";
		// payMoney(2);
		// checkForBurglar(2);
		// visitRoom2();
		// } else {
		// pathFinder += "\nYou entered the Dining Room. ";
		// payMoney(5);
		// checkForBurglar(5);
		// visitRoom5();
		// }
		// sc.close();
	}

	public static void visitRoom4() {
		illuminatedRoom(4);
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the kitchen. You see a lot of bats flying. {You can (1)exit to the west or (2)exit to the north}");
		int response = sc.nextInt();
		if (response == 1) {
			pathFinder += "\nYou went to the front room.";
			payMoney(2);
			checkForBurglar(2);
			visitRoom2();
		} else {
			pathFinder += "\nYou entered the Parlor and saw a treasure chest. ";
			payMoney(7);
			checkForBurglar(7);
			visitRoom7();
		}
		sc.close();
	}

	public static void visitRoom5() {
		illuminatedRoom(5);
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the dining room. You see a lot of dust and an empty box. {You can (1)exit to the south or (2)exit the game}");
		int response = sc.nextInt();
		if (response == 1) {
			pathFinder += "\nYou entered the Library and saw spiders. ";
			payMoney(3);
			checkForBurglar(3);
			visitRoom3();
		} else {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(8);
			if (randomInt == 1 || randomInt == 3 || randomInt == 5 || randomInt == 7) {
				System.out.println("What? You came to room 7!");
				pathFinder += "\nYou entered the Parlor and saw a treasure chest. ";
				payMoney(7);
				checkForBurglar(7);
				visitRoom7();
			} else {
				System.out.println("What? You came to room 2!");
				pathFinder += "\nYou went to the front room.";
				payMoney(2);
				checkForBurglar(2);
				visitRoom2();
			}
		}
		sc.close();
	}

	public static void visitRoom6() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the vault room. You see 3 walking skeletons. {You can quickly (1)exit to the east}");
		int response = sc.nextInt();
		if (unlocked = false) {
			if (response == 1) {
				Random rnd = new Random();
				int randomInt = 1 + rnd.nextInt(4);
				if (randomInt == 1) {
					pathFinder += "\nYou unlocked and entered the Secret Room and see piles of gold. ";
					payMoney(8);
					checkForBurglar(8);
					visitRoom8();
				} else {
					pathFinder += "\nYou entered the Parlor and see a treasure chest. ";
					payMoney(7);
					checkForBurglar(7);
					visitRoom7();
				}
			}
		} else {
			pathFinder += "\nYou entered the Secret Room and see piles of gold. ";
			payMoney(8);
			checkForBurglar(8);
			visitRoom8();
		}
		sc.close();
	}

	public static void visitRoom7() {
		illuminatedRoom(7);
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the parlor. You see a treasure chest. {You can (1)exit to the west or (2)exit to the south}");
		int response = sc.nextInt();
		if (response == 1) {
			pathFinder += "\nYou entered the Vault and see 3 walking skeletons. ";
			payMoney(6);
			checkForBurglar(6);
			visitRoom6();
		} else {
			pathFinder += "\nYou entered the Kitchen and see bats. ";
			payMoney(4);
			checkForBurglar(4);
			visitRoom4();
		}
		sc.close();
	}

	public static void visitRoom8() {
		illuminatedRoom(8);
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You find the secret room. You see piles of gold. {You can (1)exit to the west with the gold or (2)exit the game without the gold}");
		int response = sc.nextInt();
		if (response == 1) {
			pathFinder += "\nYou entered the Vault and see 3 walking skeletons. ";
			payMoney(6);
			checkForBurglar(6);
			visitRoom6();
		} else {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(4);
			if (randomInt == 1) {
				System.out.println("You have exited the house, but you are being followed by a GHOST!");
			} else {
				System.out.println("You have exited the house, stay safe!");
			}
			System.out.println("Log: " + pathFinder + "\n\nYour total money: " + totalMoney + "\n\nYour stash: " + stash);
		}
		sc.close();
	}
}
