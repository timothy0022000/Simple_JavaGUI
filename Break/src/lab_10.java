public class lab_10 {

	public static void main(String[] agrs) {

		int list[] = { 1, 2, 3, 4, 5 };
		int list2[] = new int[10];

		for (int i = 0; i < list.length; i++) {
			list2[i] = list[i];
			System.out.print(list2[i] + " ");
		}

		int[] doubleCapacity(int []array){
			int []result = new int[array.length];
			
			for (int i = 0,j = result.length; i < result.length;i++,j++ ){
				result[j]= result[i];
			}
					return result;	
		}
	}
}
