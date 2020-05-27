package week3.day2;

import java.util.Arrays;
import java.util.Collections;

public class SortArray2 {

	public static void main(String[] args) {
		Integer[] array = {5,1,33,79,22,11,45};
		Arrays.sort(array);
		System.out.println("Sorted Array : "+ Arrays.toString(array));
		
		System.out.print("Reversed array :");
		Collections.reverse(Arrays.asList(array));
		System.out.println(Arrays.toString(array));

	}

}
