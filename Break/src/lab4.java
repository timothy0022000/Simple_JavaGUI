import java.util.Scanner;//import Scanner 

public class lab4 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {
		int sum = 0;// declare sum

		// prompt user
		System.out.print("Enter a number : ");
		int num = input.nextInt();

		System.out.print("Enter a number : ");
		int num2 = input.nextInt();

		// for loop
		for (int i = num; i <= num2; i++) {
			sum += i;
		}

		// printout
		System.out.println("Total = " + sum);
	}

}
