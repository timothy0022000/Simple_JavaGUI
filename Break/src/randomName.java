import java.util.Scanner;//import scanner 

public class randomName {

	static Scanner input = new Scanner(System.in);

	// he name select statement
	public static void heNames() {

		int name = (int) (Math.random() * 5) + 1;

		switch (name) {

		case 0:
			System.out.println("Tim");
			break;

		case 1:
			System.out.println("Jack");
			break;

		case 2:
			System.out.println("Ronricas");
			break;

		case 3:
			System.out.println("Dominic");
			break;

		case 4:
			System.out.println("Jim");
			break;
		}

	}

	// she name statement
	public static void sheNames() {

		int name = (int) (Math.random() * 5) + 1;

		switch (name) {

		case 0:
			System.out.println("Trey");
			break;

		case 1:
			System.out.println("Kristy");
			break;

		case 2:
			System.out.println("Kim");
			break;

		case 3:
			System.out.println("DeDe");
			break;

		case 4:
			System.out.println("Jesscia");
			break;

		}
	}

	public static boolean anotherName() {
		while (true) {
			String choice = " ";

			// prompt user
			System.out.print("Do you want another name ? :");
			choice = input.next();

			if (choice.equalsIgnoreCase("yes")) {
				return true;
			} else if (choice.equalsIgnoreCase("no")) {
				return false;
			} else

				System.out.println("Invalid Input: (yes or no) ");
		}
	}

	// main method
	public static void main(String[] agrs) {

		do {
			// prompt user
			System.out.print("What is ur gender ? : ");
			String txt = input.next();

			if (txt.equalsIgnoreCase("male")) {
				heNames();
			} else if (txt.equalsIgnoreCase("female")) {
				sheNames();
			} else
				System.out.println("Invaild Input : (Enter he or she )");

		} while (anotherName());
		System.out.println("Enjoy your new name !!!");
	}
}
