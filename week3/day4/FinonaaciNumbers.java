package week3.day4;

import java.util.Arrays;
import java.util.Collections;

public class FinonaaciNumbers {

	public static void main(String[] args) {

	Integer[] fib = new Integer[10];// collections.reverse only works if defined as a wrapper class
	int count=1;
	fib[0]=0;
	fib[1]=1;
	System.out.println("First ten fibonacci numbers are :");
	
	for(int i=2;i<10;i++) {
		fib[count+1]=fib[count]+fib[count-1];
		count++;
		}
	Collections.reverse(Arrays.asList(fib));
	System.out.println(Arrays.toString(fib));

	}
	
	

}
