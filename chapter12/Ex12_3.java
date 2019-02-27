/* austin smith
20-2-19 */

import java.util.*;


class Ex12_3 {
	public static void main(String[] args) {
		int[] test = new int[100];
		for(int i = 0; i < 100; i++){
			test[i] = (int)(Math.random() * 10000);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number 0- 99");
		int index = input.nextInt();

		try{
			System.out.println("The value at " + index + " is " + test[index]);
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("Error. u no type right number");
		}
	}
}
