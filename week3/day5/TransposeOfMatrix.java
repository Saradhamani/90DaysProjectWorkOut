package week3.day5;

public class TransposeOfMatrix {

	public static void main(String[] args) {

		int[][] array1= {{0,1,2},
				{3,4,5},
				{6,7,8}};
		System.out.println("Original Matrix");
		for (int[] row : array1) {
			for (int col : row) {
				System.out.print(col+" ");

			}
			System.out.println("");

		}

		
		for(int i=0;i<array1.length;i++) {
			for(int j=i;j<array1.length;j++) {
				int temp=array1[j][i];
				array1[j][i]=array1[i][j];
				array1[i][j]=temp;
				

			}
		}
		
		System.out.println("Transposed Matrix");
		for (int[] row : array1) {
			for (int col : row) {
				System.out.print(col+" ");

			}
			System.out.println("");

		}


	}

}
