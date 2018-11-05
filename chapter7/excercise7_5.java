/*austin smith
spooky season
halloween*/
import java.util.Scanner;
class excercise7_5 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		int distinktNumbers = 0;
				
		System.out.print("put in 10 numbers: ");
		for(int i = 0; i < 10; i++){
			int value = input.nextInt();
			
			boolean inIt = false;
			for (int j = 0; j < distinktNumbers; j++){
				if(value == numbers[j]){
					inIt = true;
				}
			}
			if(!inIt){
				numbers[distinktNumbers] = value;
				distinktNumbers++;
			}	
		}
		System.out.println("The number of distinkt numbers in the array array is: " + distinktNumbers);
		
		System.out.print("The list without duplicates: ");
		
		for (int i = 0; i < distinktNumbers; i++){
			System.out.print(numbers[i] + " ");
		}	
	}
}