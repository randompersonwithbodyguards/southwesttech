/* austin smith
11/1
7-15*/
import java.util.Scanner;

class noDuplicates {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("put 10 numbers ");
		
		for (int i = 0; i < 10; i++){
			numbers[i] = input.nextInt();
		}
		int[] result2 = eliminateDuplicates(numbers);
		
		System.out.print("the unique numbers in the array are ");
		for (int i = 0; i< result2.length; i++){
			System.out.print(result2[i]+ " ");
		}
	}
	public static int[] eliminateDuplicates(int[] list){
		int[] temp = new int[list.length];
		int size = 0;
		for(int i = 0; i < list.length; i++){
			boolean inIt = false;
			for(int j= 0; j < i && !inIt; j++ ){
				if (list[j] == list[i]){
					inIt = true;
				}
			}
			if (!inIt){
				temp[size] = list[i];
				size++;
			}
		}
		int [] result = new int [size];
		for (int i = 0; i< size; i++){
			result[i] = temp[i];
		}
		return result;
	}
}