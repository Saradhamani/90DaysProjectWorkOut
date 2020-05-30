package week3.day5;

import java.util.Arrays;

public class AdditionOfMatrices {

	public static void main(String[] args) {
		int[][] a1= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[][] a2={{9,8,7},
				{6,5,4},
				{3,2,1}};
		Integer [][] sum=new Integer[3][3];
		System.out.println("Array Length a1:"+a1.length);
		System.out.println("Array Length a2:"+ a2.length);
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				sum[i][j]=a1[i][j]+a2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("");
			
		}
		

		
		


	}

}
