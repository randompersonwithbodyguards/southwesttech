/* Austin Smith
21/9/18 */

import java.util.Scanner;
public class yearcrap{

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

		int Feb = 28;
		
		// propt for year and month

		System.out.println("Enter the year:");
		int year = input.nextInt();
		System.out.println("Enter the month (ex. Jan, Feb...):");
		String month = input.next();

		if (year % 4 == 0) {
			if (year % 100 == 0){
				if (year % 400 == 0){
					Feb = 29;
				}
			}
			else { 
				Feb = 29;
			}
		}

		// assign strings and variable names together

		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
			System.out.println(month + " " + year + " has 31 days.");
		}

		else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
			System.out.println(month + " " + year + " has 30 days.");
		}
		else if (month.equals("Feb")){
			System.out.println(month + " " + year + " has " + Feb + " days." );
		}
		else {
			System.out.println("Ya done messed up A-A ron!");
		}
	}
}