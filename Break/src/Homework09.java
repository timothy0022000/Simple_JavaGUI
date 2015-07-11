/*
 * Create two arrays from user input
 * sum them together , fine average, then print.
 */

import java.util.Scanner;//import Scanner

public class Homework09 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		int array1[] = inputArray(0);
		int array2[] = inputArray(0);
		int array3[] = add(array1, array2);

		System.out.println();// white space
		System.out.println("ARRAY1");
		displayArray(array1);

		System.out.println();// white space

		System.out.println("ARRAY2");
		displayArray(array2);

		System.out.println();// white space

		System.out.println("ARRAY SUM");
		displayArray(array3);

		double avg = average(array1);
		System.out.println("________________________________________________");
		System.out.println("\n\t\tThe average of Array1 is :" + avg);
		System.out.println();
		System.out.println(" THANK YOU ");
		System.exit(0);// exit program
	}

	// print array method
	public static void displayArray(int list[]) {

		for (int i : list)
			System.out.println(i + " ");
	}

	// select size and array elements
	public static int[] inputArray(int size) {
		System.out.print("Enter size of array :");// prompt user
		size = input.nextInt();

		int list[] = new int[size];

		System.out.print("Enter elements :");// prompt user
		for (int i = 0; i < size; i++) {
			list[i] = input.nextInt();
		}
		return list;

	}

	// Average method
	public static double average(int list[]) {
		// declare variables
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < list.length; i++) {
			sum += list[i];// compute sum
		}
		avg = sum / list.length;// compute average

		return avg;
	}

	// Sum up arrays
	public static int[] add(int list[], int list2[]) {
		// declare array
		int list3[] = new int[list.length];

		for (int i = 0; i < list.length; i++) {

			list3[i] = list[i] + list2[i];// compute sum
		}

		return list3;
	}



}
