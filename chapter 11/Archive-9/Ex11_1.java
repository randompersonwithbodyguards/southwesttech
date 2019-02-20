/* austin smith
12-2-19 */


import java.util.Scanner;
class Ex11_1 {
	public static void main(String[] args) {
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		String color = "";
		boolean filled = false;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length of side 1: ");
		s1 = input.nextDouble();
		
		System.out.println("Enter length of side 2: ");
		s2 = input.nextDouble();

		System.out.println("Enter length of side 3: ");
		s3 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Enter color: ");
		color = input.nextLine().trim();
		System.out.println("Is this shape filled? (true / false)");
		filled = input.nextBoolean();
		
		Triangle t1 = new Triangle(s1, s2, s3);
		t1.setColor(color);
		t1.setFilled(filled);
		
		System.out.println(t1);
		
	}
}