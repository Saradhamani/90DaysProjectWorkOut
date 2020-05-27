package week3.day2;

public class AverageNumOfArray {

	public static void main(String[] args) {
		int[] array= {20, 30, 25, 35, -16, 60, -100};
		int sum=0,i=0;
		for(i=0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("Average of the array number is :"+ (sum/array.length));

	}

}
