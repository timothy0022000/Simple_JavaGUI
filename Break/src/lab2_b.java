import java.util.Scanner;//import Scanner 

public class lab2_b {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] agrs) {
		int temp;//declare variable

		
		//prompt user
		System.out.print("Enter a integer : ");
		int num = input.nextInt();

		System.out.print(" Enter another integer : ");
		int num2 = input.nextInt();

		//swap statement
		if (num > num2) {
			temp = num;
			num = num2;
			num2 = temp;
		}

		//print out 
		System.out.println("The sorted numbers are : " + num + "," + num2);
	}
}
