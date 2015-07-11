/*
 * Timothy Johnson 
 * program that gives a boolean result, which takes user input 
 * with scanner class (on weather or not to speed up on HW)
 */

import java.util.Scanner;

public class homework01 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		// Prompt user
		System.out
				.print("Enter the number of days you have remaining until assingment is due : ");
		int day = input.nextInt();

		System.out.print("Enter the temperature : ");
		double temp = input.nextDouble();

		System.out.print("Enter the number of assingments due : ");
		int assignments = input.nextInt();

		System.out.print("Is it raining (true or false) : ");
		String rain = input.next();

		// declare boolean variable
		boolean doHomework;

		doHomework = ((day < 5) || (assignments > 4) || (temp < 50.0)
				&& (rain.equalsIgnoreCase("ture")));

		// printout
		System.out.println(doHomework);

	}
}
