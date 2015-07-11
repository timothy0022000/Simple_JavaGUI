public class Homework11 {

	public static void main(String[] agrs) {

		int list[][] = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 } };

		int sum[] = sumUp(list);

		printMe(sum);
		
		System.out.println("\n");

		selection_srt(sum, list.length);
		for (int i : sum) {
			System.out.print(sum[i] + "  ");
		}

	}

	public static int[] sumUp(int list[][]) {

		int sum[] = new int[list.length];

		for (int row = 0; row < list.length; row++) {
			int total = 0;
			for (int col = 0; col < list[0].length; col++)

				total += list[row][col];
			sum[row] = total;

		}
		return sum;

	}

	public static void selection_srt(int array[], int n) {
		
		for (int x = 0; x < n; x++) {
			int index_of_min = x;
			for (int y = x; y < n; y++) {
				if (array[index_of_min] < array[y]) {
					index_of_min = y;
				}
			}
			int temp = array[x];
			array[x] = array[index_of_min];
			array[index_of_min] = temp;
		}
	}

	public static void printMe(int list[]) {

		for (int i = 0; i < list.length; i++) {
			System.out.println(" Employee" + i + " : " + list[i] + " hours ");
		}
	}
}
