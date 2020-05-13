package week1.day1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a String :");
		String s = br.readLine();
		
		int strlen=s.length();
		boolean isPalindrome=true;
		for(int i=0 ,j=strlen-1;i<(strlen/2);i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				isPalindrome=false;
				break;
				
			}
		}
		
		if(isPalindrome) {
			System.out.println("The given string "+s+" is a Palindrome ");
		}
		else 
			System.out.println("The given string "+s+" is not a Palindrome ");

	}

}
