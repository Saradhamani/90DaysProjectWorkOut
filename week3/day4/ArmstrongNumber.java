package week3.day4;
/**
 * Print the armstrong numbers between 1 and 1000.
 * armstrong number is the numbers are those numbers whose sum of cube of its digits is equal
 * to the number itself
 * @author saradhasriram
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Armstrong numbers from 0 to 100");
		for(int i=0;i<1000;i++) {
			int sum=sumOfCubesOfDigit(i);
			if(sum==i){
				System.out.println(i);
			}
		}
		

	}

	public static int sumOfCubesOfDigit(int number) {
		int sum=0;
		int q=number;
		while(q!=0) {
			q=number%10;// gives the last digit of the number
			sum+=q*q*q;
			q=number/10;// gives the number removing the last digit
			number=q;//should now operate on the number without its last digit as last digit is already processed
		}
		
	return sum;
	}
}
