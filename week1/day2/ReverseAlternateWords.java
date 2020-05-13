package week1.day2;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ReverseAlternateWords {

	//Write a java program to do the following.
	//Input: "When the world realise its own mistake, corona will dissolve automatically"
	//output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"
	public static void main(String[] args) {

		String input="When the world realise its own mistake, corona will dissolve automatically";
		String[] split_String = input.split(" ");
		
		LinkedList<String> result= new LinkedList();
	
		for(int i=0; i<split_String.length;i++) {
			if(i%2!=0) {
				StringBuilder sb= new StringBuilder(split_String[i]);
				result.add(sb.reverse().toString());
				
			}
			else 
				result.add(split_String[i]);
		}
		
		for (String string : result) {
			System.out.print(string+" ");
			
		}
		

	}

}
