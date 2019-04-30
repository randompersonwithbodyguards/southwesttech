import java.util.Scanner;

class greatestCommon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int firstInt = input.nextInt();
		System.out.println("Enter the second Integer: ");
		int secondInt = input.nextInt();
		System.out.println("The Greatest Common Divisor is: ");
		int gcf = recursiveGCD(firstInt, secondInt);
		System.out.println(gcf);
	}
	public static int recursiveGCD(int m, int n){
		if (m%n == 0){
			return n;
		}
		else {
			return recursiveGCD(n, m%n);
		}
	}
}