/*austin smith
14/9/18 */
import java.util.Scanner;

class coordinatePoint {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		double varx = input.nextDouble();
		
		System.out.println("Enter the value of y: ");
		double vary = input.nextDouble();
		
		if (Math.abs(varx) <= (10/2)) {
			if (Math.abs(vary) <= (5.0/2)) {
				System.out.println("Point (" + varx + ", " + vary + ") is in the rectangle");
			} 
			else {
				System.out.println("Point (" + varx + ", " + vary + ") is not in the rectangle");
			}
		}
		else {
			System.out.println("Point (" + varx + ", " + vary + ") is not in the rectangle");
		}
	}
}