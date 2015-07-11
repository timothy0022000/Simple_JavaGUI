/*
 * Copy array program; with print method.
 */

public class copy_array {

	public static void main(String[] agrs) {

		int list  [] = { 1, 4, 48, 7, 9 };// list 1
		int list2 [] = new int[list.length];// list 2
		int list3 [] = changeArray(list);
		
		// copy loop
		for (int i = 0; i < list.length; i++) {
			list2[i] = list[i];
		}

		System.out.println("ARRAY");// title
		System.out.println("_________________________________");

		print(list);// print list 1

		System.out.println();// white space

		System.out.println("ARRAY Copy");// title
		System.out.println("_________________________________");

		print(list2);// print list 2
		
		System.out.println();// white space

		System.out.println("ARRAY Copy2");// title
		System.out.println("_________________________________");
		
		print(list3);
		
		System.exit(0); //exit program 
	}

	// loop and print method
	public static void print(int x[]) {
		for (int i = 0; i < x.length; i++) {
			
			System.out.print( (x[i] != x[4]) ? x[i] + " , " : x[i] + " ");
		}
	}
	
	public static int [] changeArray(int [] x){
		
		int b[] = new int [x.length * 2];
		
		for (int i = 0; i < x.length ; i++){
			b[i] = x[i];
		}
		return b;
		
	}

}
