import java.util.Scanner;

public class lab06 {

	static Scanner input = new Scanner(System.in);

	public static int sum(int n, int n2) {
		int total = 0;
		for (int i = n; i <= n2; i++) {
			total += i;

		}
		return total;
	}

	public static void main(String[] agrs) {

		System.out.print("Enter a integer : ");
		int num = input.nextInt();

		System.out.print("Enter a integer : ");
		int num2 = input.nextInt();

		System.out.println(" The sum is : " + sum(num, num2));

	}

}
