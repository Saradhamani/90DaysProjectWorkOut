package week2.day1;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicates1 {

	public static void main(String[] args) {
		String input="When life gives you lemons, make lemonade";
		char[] charArray=input.toCharArray();
		int temp=0;
		LinkedHashMap<Character,Integer> charCount= new LinkedHashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++) {
			if(charCount.containsKey(charArray[i])) {
				temp=charCount.get(charArray[i])+1;
				charCount.put(charArray[i], temp);
				continue;
			}
			else {
				charCount.put(charArray[i], 1);
			}
			
		}
		
		System.out.println("The Duplicate Characters are :");
		for(Character mapkey:charCount.keySet()) {
			if(charCount.get(mapkey)>1) {
				System.out.println(mapkey);
			}
			
		}

	}

}
