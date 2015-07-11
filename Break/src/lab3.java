import java.util.Scanner;//import scanner 

public class lab3 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		String answer = " ";

		do {
			// Prompt the user
			System.out.println("Enter a integer : ");
			int num = input.nextInt();

			// if else nesting
			if ((num % 5 == 0) && (num % 6 == 0)) {
				System.out.println(num + " " + "is divisible by 5 and 6. ");
			} else if ((num % 5 == 0) && (num % 6 != 0)) {
				System.out.println(num + " " + "is divisible by 5 but not 6. ");

			} else if ((num % 6 == 0) && (num % 5 != 0)) {
				System.out.println(num + " " + "is divisible by 6 but not 5. ");

			} else {
				System.out
						.println(num + " " + "is divisible by neither 5 or 6");
			}

			// Prompt user
			System.out.print("PLAY AGAIN? (YES OR NO)");
			answer = input.next();
		} while (answer.equalsIgnoreCase("yes"));

		System.out.println("THANK YOU FOR PLAYING!");
		System.exit(0);// exit program
	}

}
