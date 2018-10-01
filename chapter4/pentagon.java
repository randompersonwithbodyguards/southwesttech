/* austin smith
20/9/18*/
import java.util.Scanner;

public class pentagon {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length from the vertex to the center: ");
		double r = input.nextDouble();
		
		double s = 2 * r * Math.sin(Math.PI/5);
		
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI /5));
		
		
		
		System.out.println("The area of the pentagon is " + area);
		
	}
}
