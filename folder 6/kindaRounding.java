/* austin smith
today 
exercise 6-37*/
import java.util.Scanner;

class kindaRounding {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Put your number here: ");
		int firstNum = input.nextInt();
		System.out.println("Enter the length that you want it: ");
		int widthNum = input.nextInt();
		
		System.out.println(format(firstNum, widthNum));
		
		
	}
	public static String format(int number, int width){
		String result = number + "";
		
		for (int i = 0; i < width - length(number); i++){
			result = "0" + result;
		}
		
		return result;
	}
	public static Integer length(int number){
		int size = 0;
		while (number > 0){
			size += 1;
			number = number / 10;
		}
		return size;
	}
}