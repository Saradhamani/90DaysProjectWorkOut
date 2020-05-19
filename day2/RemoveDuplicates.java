package week2.day2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {

	/**
	 * Removes Duplicates from a List and it doesnot use any additional list for manipulation
	 * @param args
	 */
	public static void main(String[] args) {

		List<Character> list=new LinkedList<Character>() {{add('A');add('B');add('C');add('D');add('A');add('D');add('E');add('F');}};
		Collections.sort(list);
		Iterator<Character>itr=list.iterator();
		Character tempchar=itr.next();
		while(itr.hasNext()) {
			if(tempchar==itr.next()) {
				itr.remove();
				
			}
			if(itr.hasNext())
			tempchar=itr.next();
		System.out.println(list.toString());	
			
		}

	}

}
