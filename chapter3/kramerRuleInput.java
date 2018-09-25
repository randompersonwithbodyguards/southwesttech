/* austin smith
13/9/18 */

import java.util.Scanner;

class kramerRuleInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, and f: ");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		if (((a * d) - (b * c)) == 0) {
			System.out.println("The equation has no solution.");
		}
		else {
			double x = ((e * d - b * f) / (a * d - b * c));
			double y = ((a * f - e * c) / (a * d - b * c));
			System.out.println("X is: " + x + " and y is: " + y);
		} 
	}
}