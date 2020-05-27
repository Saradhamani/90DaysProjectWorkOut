package week3.day2;

public class CommonItemsInArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		System.out.println("Common Elements in the arrays are :");
		for(int itemInArray1:array1) {
			for(int itemInArray2:array2) {
				if(itemInArray1==itemInArray2) {
					System.out.println(itemInArray1);
				}
			}
		}

	}

}
