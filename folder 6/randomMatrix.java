/* austin smith
10/11/18*/
import java.util.Scanner;
class randomMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("how many lines? : ");
		int lines = input.nextInt();
		
		matrixPrint(lines);
		
		
	}
	
	public static void matrixPrint(int lines) {
		for (int rowsTotal = 1; rowsTotal <= lines; rowsTotal++){
			for( int columnsTotal = 1; columnsTotal <= lines; columnsTotal++){
				System.out.print((int)(Math.random() * 2) + "  ");
			}
		System.out.println();
		}
	}
}