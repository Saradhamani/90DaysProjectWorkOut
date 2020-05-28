package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int[] a = {1, 2, 5, 5, 6, 6, 7, 2};
		Set<Integer>duplicates=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++){
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				{
					duplicates.add(a[i]);
				}
				
			}
			
		}
		System.out.println("Duplicates in the array are :"+ duplicates);
	}

}
