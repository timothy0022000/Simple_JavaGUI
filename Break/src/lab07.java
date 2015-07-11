import java.util.Scanner;

public class lab07 {

	static Scanner input = new Scanner(System.in);

	public static int max(int num, int num2) {
		if (num > num2)
			return num;
		else
			return num2;
	}

	public static int max(int num, int num2, int num3) {
		return max(max(num, num2), num3);
	}

	public static int max(int num, int num2, int num3, int num4) {
		return max(max(num, num2, num3), num4);
	}

	public static void main(String[] agrs) {

		// prompt user
		System.out.print("Enter a integer : ");
		int n = input.nextInt();

		System.out.print("Enter a integer : ");
		int n2 = input.nextInt();

		System.out.print("Enter a integer : ");
		int n3 = input.nextInt();

		System.out.print("Enter a integer : ");
		int n4 = input.nextInt();

		// invoke overload
		int largestOfTwo = max(n, n2);
		int largestOfThree = max(n, n2, n3);
		int largestOfFour = max(n, n2, n3, n4);

		// display
		System.out.println("The max of two numbers is : " + largestOfTwo);
		System.out.println("The max of three numbers is : " + largestOfThree);
		System.out.println("The max of four numbers is : " + largestOfFour);
	}

}
