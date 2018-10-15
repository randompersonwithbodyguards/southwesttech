/* austin smiht
10/12/18 
6-25 */
import java.util.Scanner;

class milliSeconds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time in milliseconds: ");
		Long milliTime = input.nextLong();
		
		System.out.println(convertMillis(milliTime));
	
	}
	public static String convertMillis(long millis){
		long totalSeconds = millis / 1000;
		int remainSeconds = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		int remainMinutes = (int)(totalMinutes % 60);
		long totalHours = totalMinutes / 60;
		
		return totalHours + ":" + remainMinutes + ":" + remainSeconds;
	}
}