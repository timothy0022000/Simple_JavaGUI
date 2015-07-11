import java.util.Scanner;//import scanner

public class lab_03b {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {

		//prompt user
		System.out.println("Enter a integer : ");
		int num = input.nextInt();

		//nested if statements 
		if ((num % 5 == 0) && (num % 6 == 0)) {
			System.out.println("number is divisble by 5 and 6");
		} else if ((num % 5 == 0) && (num % 6 != 0)) {
			System.out.println("number is divisble by 5 but not 6");
		} else if ((num % 5 != 0) && (num % 6 == 0)) {
			System.out.println("number is divisble by 6 but not 5");
		} else
			System.out.println("number is divisble by neither 5 or 6");

	}
}
