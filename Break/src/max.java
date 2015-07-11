import java.util.Scanner;

public class max {

	static Scanner input = new Scanner(System.in);

	public static int max(int n1, int n2) {

		int result;

		result = (n1 > n2) ? n1 : n2;

		return result;
	}
	
	public static double max(double n1,double n2){
		double result;
		
		result = (n1 > n2) ? n1 : n2;
		
		return result;
	}
	
	public static double max (double num1, double num2, double num3){
		
		return max (max (num1 , num2), num3) ;
	}
	

	public static void main(String[] agrs) {

		String question = " ";

		//do while loop 
		do {

			//Prompt user 
			System.out.print("Enter a num1 : ");
			int num1 = input.nextInt();

			System.out.print("Enter a num2 : ");
			int num2 = input.nextInt();

			int max = max(num1, num2);

			//if statement
			if (num1 == num2) {
				System.out.println("number1 and number2 are the same !!!!");
			} else

				//printout
				System.out.println("The max of " + num1 + " and " + num2
						+ " is : " + max);

			System.out.println("The max of 3 numbers is : " + max(10.0,1.5,20.6));
			
			//Continue ? question
			System.out.print("Continue (yes or no) ? ");
			question = input.next();
		} while ((question.equalsIgnoreCase("yes")));
	}
}
