public class nested_loop {

	public static void main(String[] agrs) {

		for (int i = 1; i <= 7; i++) {
			// System.out.println(i);
			for (int j = 1; j <= 7 - i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
