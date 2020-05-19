package week2.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates2 {

	public static void main(String[] args) {
		String input="When life gives you lemons, make lemonade";
		String temp="";
		Set<Character>charSet= new LinkedHashSet<Character>();
		for(int i=0;i<input.length();i++) {
			charSet.add(input.charAt(i));
			
		}
		System.out.println(input.replaceAll(" ", "_"));
		
		System.out.println("Duplicates in the String are :");
		for(Character eachChar:charSet) {
			temp=new String(input);
			String newTemp=temp.replaceAll("[^"+eachChar+"]", "");
			if(newTemp.length()>1)
				System.out.println(eachChar);
		}

	}

}
