import java.util.Scanner;//import scanner 

public class homework_05 {
	static Scanner input = new Scanner(System.in);

	// good comments
	public static void printGoodComment(int userAnswer, int correctAnswer) {
		// random generator
		int good = (int) (Math.random() * 4);

		switch (good) {

		case 0:
			System.out.println("Good Job!!!");
			break;

		case 1:
			System.out.println("Excellent!!!");
			break;

		case 2:
			System.out.println("Terrific!!!");
			break;

		case 3:
			System.out.println("Nice Job!!!");
			break;
		}

	}

	public static void printBadComment(int userAnswer, int correctAnswer) {
		// bad comment
		int bad = (int) (Math.random() * 3);// random generator

		switch (bad) {

		case 0:
			System.out.println("Sorry, Try next time!!!");
			break;

		case 1:
			System.out.println("Oops, You need more work!!!");
			break;

		case 2:
			System.out.println("Hmm, Incorrect!!!");
			break;

		}

	}

	// random number method
	public static int getRandomNumber() {
		int number = (int) (Math.random() * 5) + 1;
		return number;
	}

	// game method
	public static void playGame() {
		final int NUMBER_OF_QUESTIONS = 5;
		int count = 0;
		int correctCount = 0;
		// set 5 questions
		while (count < NUMBER_OF_QUESTIONS) {

			int num1 = getRandomNumber();
			int num2 = getRandomNumber();

			System.out.print(num1 + " * " + num2 + "=" + "?");
			int userAnswer = input.nextInt();

			int correctAnswer = num1 * num2;

			if (userAnswer == correctAnswer) {

				printGoodComment(userAnswer, correctAnswer);
				correctCount++;
			} else {

				printBadComment(userAnswer, correctAnswer);
				System.out.println("The answer should be  " + num1 * num2);
			}
			count++;

		}

		System.out.println("You have " + correctCount + " out of 5");

	}

	// loop game ?
	public static boolean playAgain() {

		while (true) {
			String output = " ";
			System.out.print("Continue? (yes or no)");
			output = input.next();

			if (output.equalsIgnoreCase("yes")) {
				return true;
			} else if (output.equalsIgnoreCase("no")) {
				return false;
			} else
				System.out.println("Invaild Input (yes or no)");
		}
	}

	public static void main(String[] agrs) {

		do {

			playGame();

		} while (playAgain());

		System.out.println("THANK YOU FOR PLAYING!!!");
	}
}
