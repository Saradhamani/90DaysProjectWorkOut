package week3.day2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SortAndReverseArray {

	public static void main(String[] args) {
		Integer[] array = {5,1,33,79,22,11,45};
		System.out.println("Input Array:");
		for( int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		TreeSet<Integer>sortedArraySet=new TreeSet<Integer>();
		for(int i=0;i<array.length;i++) {
			sortedArraySet.add(array[i]);
		}
		array=null;
		array=new Integer[sortedArraySet.size()];
		int i=0;
		for (Integer integer : sortedArraySet) {
			array[i++]=integer;
			
		}
		
		
		
		System.out.println("After Sorting :");
		for( i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		
		NavigableSet<Integer> descendingSet = sortedArraySet.descendingSet();
		array=null;
		array=new Integer[descendingSet.size()];
		i=0;
		for (Integer integer : descendingSet) {
			array[i++]=integer;
			
		}
		System.out.println("After Reversing :");
		for( i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		

	}

}
