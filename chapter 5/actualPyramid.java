/* austin smith
today */
import java.util.Scanner;
class actualPyramid {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many lines do you want in your pyramid? ");
		int rowsWanted = input.nextInt();
		
		if (rowsWanted < 1 || rowsWanted > 15){
			System.out.println("Wrong input. keep it in ur pants");
		}
		else {
			for (int row = 1; row <= rowsWanted; row++){
				for (int spaces = 1; spaces <= rowsWanted - row; spaces++) {
					System.out.print("   ");
				}
				
				for(int left = row; left > 0; left--){
					System.out.print((left > 9) ? " " + left : "  " + left);
				}
				
				for (int right = 2; right <= row; right++){
					System.out.print((right > 9) ? " " + right : "  " + right);
				}
				
				System.out.println();
			}
		}
	}
}
		
		
		