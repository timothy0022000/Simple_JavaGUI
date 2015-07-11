/*
 * Program that take input from user
 * for size of array then, user input elements'
 */

import java.util.Scanner;//import scanner 

public class student_grades {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		//prompt user 
		System.out.print("How many students will they be ? ");
		int size = input.nextInt();

		int list[] = new int[size];//intiz. array 

		//prompt user 
		System.out.println("Enter grades : ");
		

		//loop array
		for (int i = 0; i < size; i++) {
			list[i] = input.nextInt();
			
			
		}
		//print 
		for (int i = 0; i < list.length; i++) {
			System.out.println("Student " + i + " : " + list[i]  );
		}
		
		System.exit(0);//exit program 
	}

}
