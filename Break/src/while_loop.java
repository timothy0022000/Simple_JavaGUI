import java.util.Scanner;

public class while_loop {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		/*
		 * int num;
		 * 
		 * System.out.print("Enter a integter: "); num = input.nextInt();
		 * 
		 * int total = 0; while (num != 0) { total+=num; num++;
		 * 
		 * System.out.print("Enter a integter: "); num = input.nextInt(); }
		 * System.out.println("The total is : " + total);
		 * 
		 * 
		 * int num; int total =0;
		 * 
		 * 
		 * System.out.print("Enter a integter: "); num = input.nextInt(); do{
		 * total+=num; num++;
		 * 
		 * System.out.print("Enter a integter: "); num = input.nextInt();
		 * }while(num != 0);
		 * 
		 * System.out.println("The total is : " + total);
		 */
		System.out.print("Enter a integter: ");
		int num = input.nextInt();

		int total = 0;
		for (int i = num ; num != 0; i++){
			System.out.print("Enter a integter: ");
			num = input.nextInt();
			total += i;
			System.out.println("The total is : " + total);
		}
	}
}
