/*ausitn smith
11/15 */
import java.util.Scanner;

class Exercise8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		final int N = 3;
		final int M = 3;
		
		System.out.print("enter the first matrix: ");
		double[][] matrix1 = new double[N][M];
		
		for(int row = 0; row < matrix1.length; row++){
			for (int col = 0; col< matrix1[row].length; col++) {
				matrix1[row][col] = input.nextDouble();
			}
		}
		System.out.print("enter the second matrix: ");
		double[][] matrix2 = new double [N][M];
		
		for(int row = 0; row < matrix2.length; row++){
			for (int col = 0; col< matrix2[row].length; col++) {
				matrix2[row][col] = input.nextDouble();
			}
		}
		double[][] ansMatrix = matrixAdding(matrix1, matrix2);
		System.out.println("The sum of the matrices is ");
		printIt(ansMatrix);
		
		
	}
	public static double[][] matrixAdding(double[][] m1, double[][] m2){
		double[][] result = new double[m1.length][m1[0].length];
		for (int row = 0; row < result.length; row++){
			for (int col = 0; col < result[row].length; col++){
				result[row][col]= m1[row][col]+m2[row][col];
			}
		}
		return result;
	}
	public static void printIt(double[][] mathing){
		for( int row = 0; row< mathing.length; row++){
			for( int col = 0; col< mathing[row].length; col++){
				System.out.print(mathing[row][col]+ " ");
			}
			System.out.println();
		}
	}
}