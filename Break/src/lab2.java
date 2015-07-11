import java.util.Scanner;//import scanner
public class lab2 {

	static Scanner input = new Scanner (System.in);
	
	public static void main (String [] agrs){
		
		//Prompt user 
		System.out.print("Enter a integer : ");
		int num = input.nextInt();
		
		//printout
		System.out.println(" You have entered : " + num);
	}
}
