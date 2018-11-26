/*ausitn smith
11/16 */
import java.util.Scanner;

class Exercise8_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("put a nmber between 0 and 511: ");
		short number = input.nextShort();
		
		char[] binary = toBinaryChars(number);
		
		for (int i = 1; i <= binary.length; i++){
			System.out.print(((binary[i - 1] == '0')?'H':'T')+ " ");
			if(i % 3 == 0)
				System.out.println();
		}
	}
	public static char[] toBinaryChars(short number){
		char[] result = new char[9];
		int i = result.length -1;
		while(number != 0){
			if(number % 2 == 0){
				result[i--] = '0';
			}
			else {
				result[i--] = '1';
			}
			number /= 2;
		}
		for (int k = i; k >= 0; k--){
			result[k] = '0';
		}
		return result;
	}
}