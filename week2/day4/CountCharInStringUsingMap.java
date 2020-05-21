package week2.day4;

import java.util.LinkedHashMap;

public class CountCharInStringUsingMap {

	public static void main(String[] args) {
		String str="Karma is powerful than God";
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character,Integer>();
		int i=0;
		while(i<str.length()) {
			if(map.containsKey(str.charAt(i))) {
			Integer val = (Integer) map.get(str.charAt(i));
			map.replace(str.charAt(i),val+1);
			}
			else
				map.put(str.charAt(i),1);
			i++;
		}
		System.out.println(map);

	}

}
