package week1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome2 {

	/**
	 * The logic in this main method accepts a string from the user and computes the reverse string of the input . It then
	 * prints if the given input string is palindrome or not based on its equality with the reversed string . This uses the StringBuilder class to 
	 * get the reversed string .
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String: ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb= new StringBuilder(input);
		String reversedInput = sb.reverse().toString();
		System.out.println(reversedInput.equals(input)? "Given String is a Palindrome":"Given String is not a Palindrome");


	}

}
