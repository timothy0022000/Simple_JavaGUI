/*
 * linear search with user input
 * and passing methods 
 */
import java.util.Scanner;//import scanner 
public class Linear_Search {// search method

	static Scanner input = new Scanner(System.in);

	public static int linearSearch(int list[], int key) {

		// loop thur array until find element
		for (int i = 0; i < list.length; i++) {

			if (key == list[i]) {
				return i;
			}
		}
		return -1;// if not found return -1
	}

	public static void main(String[] args) {

		int list[] = new int[5];// array of 5 elements
		// prompt user to input array elements
		System.out.print("Enter six elements :");

		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		// prompt user to enter key
		System.out.print("Enter a key : ");
		int key = input.nextInt();

		int sort = linearSearch(list, key);// invoke search method

		// display
		if (sort < 0) {
			System.out.println("Element not found");
		} else

			System.out.println(key + "  Found at index  : " + sort);
		System.exit(0);// exit program

	}
}
