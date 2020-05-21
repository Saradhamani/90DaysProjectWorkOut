package week2.day4;

import java.util.Hashtable;

public class CountCharInStringUsingHashTable {

	public static void main(String[] args) {
		String str="Karma is powerful than God";
		Hashtable<Character, Integer> charCount= new Hashtable<Character, Integer>();
		int i=0;
		while(i<str.length()) {
			Integer ifPresent =charCount.computeIfPresent(str.charAt(i), (k,v)->v+1);
			if(ifPresent==null)
			 charCount.computeIfAbsent(str.charAt(i),k->1);			
			i++;
		}
		System.out.println(charCount);
	}

}
