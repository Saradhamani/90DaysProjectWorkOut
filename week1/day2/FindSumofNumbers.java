package week1.day2;

public class FindSumofNumbers {

	/**
	 * 1. Write a java code to find the sum of the given numbers  
		Input: "asdf1qwer9as8d7"  
		output: 1+9+8+7 = 25  
		
		options : reggular expression , ascii table
	 * 
	 */
	public static void main(String[] args) {
		String s= "asdf1qwer9as8d7";
		char[] charArray=s.toCharArray();
		int sum=0;
		for(int i=0 ; i<charArray.length;i++) {
			if((int)charArray[i]>=48 && (int)charArray[i]<=57) {
				sum+=Character.getNumericValue(charArray[i]);
				
			}
		}
		
		System.out.println("The sum of numbers in the given string is :"+sum);

	}

}
