import java.util.Random;
import java.util.Scanner;

public class Zork {
	static String pathFinder = "";
	static boolean unlocked = false;
	static boolean money2 = false;
	static boolean money3 = false;
	static boolean money4 = false;
	static boolean money5 = false;
	static boolean money6 = false;
	static boolean money7 = false;
	static boolean money8 = false;
	static int totalMoney = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Zork.");

		// Random rnd = new Random();
		// int randomInt = 2 + rnd.nextInt(8);

		pathFinder += "You entered the Foyer. ";
		visitRoom1();
	}

	public static void visitRoom1() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the foyer of an old house. You see a dead scorpion. {You can (1)exit to the north or press (2) to quit}");
		int response = sc.nextInt();
		if (response == 1) {
			if (money2 = false) {
				Random rnd = new Random();
				totalMoney += (1 + rnd.nextInt(1000));
				money2 = true;
				pathFinder += "You went to the front room.";
				visitRoom2();
			} else {
				pathFinder += "You went to the front room.";
				visitRoom2();
			}
		} else {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(4);
			if (randomInt == 1) {
				System.out.println("You have exited the house, but you are being followed by a GHOST!");
			} else {
				System.out.println("You have exited the house, stay safe!");
			}
			System.out.println("Log: " + pathFinder);
		}
		sc.close();
	}

	public static void visitRoom2() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are in the front room and you see a piano. {You can (1) exit to the south or (2) exit to the west or (3) exit to the east}");
		int response = sc.nextInt();
		if (response == 1) {
			pathFinder += "You entered the Foyer. ";
			visitRoom1();
		}
		if (response == 2) {
			if (money3 = false) {
				Random rnd = new Random();
				totalMoney += (1 + rnd.nextInt(1000));
				money3 = true;
				pathFinder += "You entered the Library. ";
				visitRoom3();
			} else {
				pathFinder += "You entered the Library. ";
				visitRoom3();
			}
		} else {
			if (money4 = false) {
				Random rnd = new Random();
				totalMoney += (1 + rnd.nextInt(1000));
				money4 = true;
				pathFinder += "You entered the Kitchen. ";
				visitRoom4();
			} else {
				pathFinder += "You entered the Kitchen. ";
				visitRoom4();
			}
		}
		sc.close();
	}

	public static void visitRoom3() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the library. You see a bunch of spiders. {You can (1)exit to the east or (2)exit to the north}");
		int response = sc.nextInt();
		if (response == 1) {
			if (money2 = false) {
				Random rnd = new Random();
				totalMoney += (1 + rnd.nextInt(1000));
				money2 = true;
				pathFinder += "You went to the front room. ";
				visitRoom2();
			} else {
				pathFinder += "You went to the front room. ";
				visitRoom2();
			}
		} else {
			if (money5 = false) {
				Random rnd = new Random();
				totalMoney += (1 + rnd.nextInt(1000));
				money5 = true;
				pathFinder += "You entered the Dining Room. ";
				visitRoom5();
			} else {
				pathFinder += "You entered the Dining Room. ";
				visitRoom5();
			}
		}
		sc.close();
	}

	public static void visitRoom4() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the kitchen. You see a lot of bats flying. {You can (1)exit to the west or (2)exit to the north}");
		int response = sc.nextInt();
		if (response == 1) {
			if (money2 = false) {
				Random rnd = new Random();
				totalMoney += (1 + rnd.nextInt(1000));
				money2 = true;
				pathFinder += "You went to the front room.";
				visitRoom2();
			} else {
				pathFinder += "You went to the front room.";
				visitRoom2();
			}
		} else {
			if (money7 = false) {
				Random rnd = new Random();
				totalMoney += (1 + rnd.nextInt(1000));
				money7 = true;
				pathFinder += "You entered the Parlor. ";
				visitRoom7();
			} else {
				pathFinder += "You entered the Parlor. ";
				visitRoom7();
			}
		}
		sc.close();
	}

	public static void visitRoom5() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the dining room. You see a lot of dust and an empty box. {You can (1)exit to the south or (2)exit the game}");
		int response = sc.nextInt();
		if (response == 1) {
			if (money3 = false) {
				Random rnd = new Random();
				totalMoney += (1 + rnd.nextInt(1000));
				money3 = true;
				pathFinder += "You entered the Library. ";
				visitRoom3();
			} else {
				pathFinder += "You entered the Library. ";
				visitRoom3();
			}
		} else {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(8);
			if (randomInt == 1 || randomInt == 3 || randomInt == 5 || randomInt == 7) {
				System.out.println("What? You came to room 7!");
				if (money7 = false) {
					Random rnd2 = new Random();
					totalMoney += (1 + rnd2.nextInt(1000));
					money7 = true;
					pathFinder += "You entered the Parlor. ";
					visitRoom7();
				} else {
					pathFinder += "You entered the Parlor. ";
					visitRoom7();
				}
			} else {
				System.out.println("What? You came to room 2!");
				if (money2 = false) {
					Random rnd2 = new Random();
					totalMoney += (1 + rnd2.nextInt(1000));
					money2 = true;
					pathFinder += "You went to the front room.";
					visitRoom2();
				} else {
					pathFinder += "You went to the front room.";
					visitRoom2();
				}
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
					if (money8 = false) {
						Random rnd2 = new Random();
						totalMoney += (1 + rnd2.nextInt(1000));
						money8 = true;
						pathFinder += "You unlocked and entered the Secret Room. ";
						visitRoom8();
					} else {
						pathFinder += "You unlocked and entered the Secret Room. ";
						visitRoom8();
					}
				} else {
					if (money7 = false) {
						Random rnd2 = new Random();
						totalMoney += (1 + rnd2.nextInt(1000));
						money7 = true;
						pathFinder += "You entered the Parlor. ";
						visitRoom7();
					} else {
						pathFinder += "You entered the Parlor. ";
						visitRoom7();
					}
				}
			}
		} else {
			pathFinder += "You entered the Secret Room. ";
			visitRoom8();
		}
		sc.close();
	}

	public static void visitRoom7() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You are standing in the parlor. You see a treasure chest. {You can (1)exit to the west or (2)exit to the south}");
		int response = sc.nextInt();
		if (response == 1) {
			if (money6 = false) {
				Random rnd2 = new Random();
				totalMoney += (1 + rnd2.nextInt(1000));
				money6 = true;
				pathFinder += "You entered the Vault. ";
				visitRoom6();
			} else {
				pathFinder += "You entered the Vault. ";
				visitRoom6();
			}
		} else {
			if (money4 = false) {
				Random rnd2 = new Random();
				totalMoney += (1 + rnd2.nextInt(1000));
				money4 = true;
				pathFinder += "You entered the Kitchen. ";
				visitRoom4();
			} else {
				pathFinder += "You entered the Kitchen. ";
				visitRoom4();
			}
		}
		sc.close();
	}

	public static void visitRoom8() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"You find the secret room. You see piles of gold. {You can (1)exit to the west with the gold or (2)exit the game without the gold}");
		int response = sc.nextInt();
		if (response == 1) {
			if (money6 = false) {
				Random rnd2 = new Random();
				totalMoney += (1 + rnd2.nextInt(1000));
				money6 = true;
				pathFinder += "You entered the Vault. ";
				visitRoom6();
			} else {
				pathFinder += "You entered the Vault. ";
				visitRoom6();
			}
		} else {
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(4);
			if (randomInt == 1) {
				System.out.println("You have exited the house, but you are being followed by a GHOST!");
			} else {
				System.out.println("You have exited the house, stay safe!");
			}
			System.out.println("Log: " + pathFinder);
		}
		sc.close();
	}
}
