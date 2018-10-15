/* austin smith
10/10/18 */
import java.util.Scanner;
class emordnilap {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		
		int number = input.nextInt();
		
		if(isPalindrome(number)){
			System.out.println(number + " is a palindrome");
		}
		else{
			System.out.println("the number isnt a palindrome");
		}
	}
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number) {
		int reversing = 0;
		while(number != 0){
			
			int remainder = number % 10;
			reversing = reversing * 10 + remainder;
			
			number = number / 10;
		}
		return reversing;
	}
	
	// Return true if number is a palindrome
	public static boolean isPalindrome(int number){
		
		int forwards = number;
		int reversed = reverse(forwards);
		return forwards == reversed;
		
	}
}