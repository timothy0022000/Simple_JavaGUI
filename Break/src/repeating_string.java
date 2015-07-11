import java.util.Scanner;

public class repeating_string {

	static Scanner input = new Scanner (System.in);
	
	public static String repeat(String s , int num){
		
		for (int i = 1 ; i <= num; i++){
			System.out.println(s);
		}
		return s;
	}
	
	public static void main (String [] agrs){
		//prompt user , enter string
		System.out.print("Enter a string : ");
		String s = input.next();
		
		//how many times you want it to repeat
		System.out.print("How many times u wish to repeat the string : ");
		int num = input.nextInt();
		
		//invoke repeat method
		repeat(s,num);
		
	}
}
