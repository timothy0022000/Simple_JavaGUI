import java.util.Scanner;//import Scanner 

public class homework_09 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		// prompt user
		System.out.print("enter the size of the array : ");
		int size = input.nextInt();

		System.out.println();// white space

		// array
		int list[] = inputArray(size);

		System.out.println("ARRAY 1");
		printArray(list);

		// array
		int list2[] = inputArray(size);

		System.out.println("\nARRAY 2");
		printArray(list2);

		System.out.println("\nTHE AVERAGE");
		System.out.println();

		double avg = avg(list);

		System.out.println(avg);

	}

	// builds a array base on user input
	public static int[] inputArray(int size) {

		int list[] = new int[size];

		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 10);// Generate numbers between 1-9
		}
		return list;// return array
	}

	public static double avg(int[] list) {

		int total = 0;
		for (int i : list) {
			total += i;
		}
		double avg = total / list.length;

		return avg;
	}

	public static void printArray(int[] list) {
		for (int j : list) {
			System.out.print(j + " ");
		}
	}

	/*
	 * public static int[] add(int[] list1, int[] list2) {
	 * 
	 * for (int i = 0; i < list1.length; i++) { int c = (int) (list1[i] +
	 * list2[i]);// the sum array
	 * 
	 * } //return c; }
	 */
}
