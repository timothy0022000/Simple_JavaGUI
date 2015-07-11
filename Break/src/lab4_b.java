import java.util.Scanner;

public class lab4_b {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		int num = 0;
		int counter = 0;
		while (num > 0) {
			
			System.out.print("Enter a value : ");
			num = input.nextInt();

			counter++;
			

			System.out.println(num);
		}
		System.out.println(counter);
	}
}
