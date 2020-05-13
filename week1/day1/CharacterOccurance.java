package week1.day1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterOccurance {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a String : ");
		String stringInput=br.readLine();
		System.out.println("Please enter the character to be found :");
		char chartoCount=br.readLine().charAt(0);
		char[] charArray=stringInput.toCharArray();
		int countOfChar=0;
		for(int i=0; i<charArray.length;i++) {
			if(charArray[i]==chartoCount) {
				countOfChar+=1;
			}
		}
		
		System.out.println("The number of '"+chartoCount+ "' in the given string is : "+countOfChar);
		
		
		
	}

}
