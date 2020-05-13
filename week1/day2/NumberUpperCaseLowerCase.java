package week1.day2;

import java.io.CharArrayReader;

public class NumberUpperCaseLowerCase {

	/**
	 * Difficulty level: Medium
1. Write a java code to find the sum of the given numbers
Input: "asdf1qwer9as8d7"
output: 1+9+8+7 = 25
- ascii 
- regex
- Character class
2. Write a java program to do the following.
Input: "When the world realise its own mistakes, corona will dissolve automatically"
output: "When eht world esilaer its nwo mistakes, anoroc will evlossid automatically"
- Iterate and even digit will be reverse looped
3. Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
Input: "1. It is Work from Home  not Work for Home"
- Character class
- ascii
- regex

	 * @param args
	 */
	public static void main(String[] args) {

		String input="1. It is Work from Home  not Work for Home";
		int uppercase = 0,lowercase = 0,space=0,numbers=0;
		char[] charArray= input.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(Character.isUpperCase(charArray[i])) {
				uppercase+=1;
			}
			else if(Character.isLowerCase(charArray[i])) {
				lowercase+=1;
			}
			else if(Character.isDigit(charArray[i])) {
				numbers+=1;
			}
			else if(Character.isSpaceChar(charArray[i]))
				space+=1;
			
		}
		System.out.println("The number of UpperCase: "+ uppercase);
		System.out.println("The number of Lowercase:"+lowercase);
		System.out.println("The number of Digits:"+numbers);
		System.out.println("The number of Spaces:"+space);

	}

}
