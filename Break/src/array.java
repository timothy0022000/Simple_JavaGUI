public class array {

	public static void main(String[] agrs) {

		int list[] = { 12, 1, 0, 45, 1475, 8 };

		int sum = sum(list);
		int max = max(list);
		
		System.out.println("ARRAY LIST");
		display(list);
		
		System.out.println();

		int list2 [] = makeArray(10);
		
		System.out.println("The sum of all the values are " + sum);
		System.out.println("The max of the values are " + max);
	}
	

	public static void display(int list[]) {

		for (int i : list) {
			System.out.print(i + " ");
		}
	}

	public static int sum(int list[]) {
		int total = 0;

		for (int i = 0; i <= list.length; i++) {

			total += list[i];
		}
		return total;
	}
	
	public static int max(int list[]){
		int max = list[0];
		for (int i = 1; i <= list.length; i++){
			
			if ( list[i] > max){
				max = list[i];
			}
		}
		return max;
	}

	public static int [] maxIndex(int list[]){
		
		int max = list[0];
		int maxIndex = 0;
		
		for (int i = 0; i <=list.length; i++){
			
			if (list[i] > max){
				max = list[i];
				
				maxIndex = i;
			}
		}
		return list;
		
	}
	
	public static int [] makeArray(int size){
		
		int list [] =  new int[size];
		
		for (int i = 0; i< size;i++){
		 list[i] = (int) (Math.random() * 10 );
		}
		return list;
	}
}
