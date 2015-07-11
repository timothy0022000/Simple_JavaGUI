/*
 * builds array of six elements, finds max 
 * and how many times it repeats.
 */

import java.util.Scanner;//import Scanner

public class Testing_Array {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		// declare variables
		int Counter = 0;

		int list[] = new int[3];// build array

		// Prompt user
		System.out.print("Enter your values 3: ");
		int max = list[0];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
			// find max value in array
			if (list[i] > max) {
				max = list[i];
			}
			// find duplicates in array
			if (list[i] == max) {
				Counter++;
				
			}
		}
		// display
		System.out.print("The max number in the array is : " + max
				+ " \n The max duplicates " + Counter + "times.");

		System.exit(0);// exit program
	}

}
