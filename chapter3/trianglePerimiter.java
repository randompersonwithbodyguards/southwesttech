/*austin smith
14/9/19 */
import java.util.Scanner;

public class trianglePerimiter {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in the lengths of sides 1, 2, and 3: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (side1 + side2 < side3) {
			System.out.println("Those side lengths don't make a valid triangle, try again");
		}
		else {
			if (side1 + side3 < side2) {
				System.out.println("Those side lengths don't make a valid triangle, try again.");
			}
			else {
				if (side2 + side3 < side1) {
					System.out.println("Those side lengths don't make a valid triangle, try again.");
				} 
				else {
					System.out.println("The area is: " + (side1 + side2 + side3));
				}
			}
		}
	}
}