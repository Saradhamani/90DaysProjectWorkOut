package week2.day1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Printlist1 {

	public static void main(String[] args) {
		List<Character>charList= new LinkedList<Character>() {{add('B');add('u');add('g');add('a');add('t');add('t');add('i');add(' ');add('C');add('h');add('i');add('r');add('o');add('n');}};
		System.out.println("Printing Array Method 1:" + charList.toString());
		System.out.println("Method 2:");
		for (Character character : charList) {
			System.out.println(character);
			
		}
		
		System.out.println("Method 3:");
		for(int i=0;i<charList.size();i++) {
			System.out.println(charList.get(i));
		}
		System.out.println("Method 4:");
		int i=0;
		while ( i <charList.size()){
			System.out.println(charList.get(i));
			i++;
		}
		System.out.println("Using Iterator");
		Iterator<Character> iterator = charList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		}


	}


