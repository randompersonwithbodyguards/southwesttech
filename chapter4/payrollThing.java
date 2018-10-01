/* Austin Smith
24/9/18 */
import java.util.Scanner;

public class payrollThing {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Employee name: ");
	    String employeeName = input.next();
	    
	    System.out.print("Number of hours worked: ");
	    Double hours = input.nextDouble();
	    
	    System.out.print("Hourly wage: "); 
	    Double wage = input.nextDouble();
	    
	    System.out.print("Enter federal tax withholding rate: ");
	    Double fedTax = input.nextDouble();
	    
	    System.out.print("Enter state tax withholding rate: ");
	    Double stateTax = input.nextDouble();
	    
	    Double grossPay = hours * wage;
	    double fedTotal = grossPay * fedTax;
	    double stateTotal = grossPay * stateTax;
	    double taxes = fedTotal + stateTotal;
	    double netPay = grossPay - taxes;
	    
	    String output = "Employee Name: " + employeeName + "\n ";
	    output += "Hours Worked: " + hours + "\n";
	    output += "Hourly Wage: $" + wage + "\n";
	    output += "Gross pay: $" + grossPay + "\n";
	    output += "Deductions:\n ";
	    output += "     Federal withholding: (" + fedTax * 100 + "%) $" + (int)(fedTotal * 100) / 100.0 + "\n";
	    output += "      State withholding: (" + stateTax * 100 + "%) $" + (int)(stateTotal * 100) / 100.0 + "\n";
	    output += "      Total deduction: (" + (fedTax + stateTax) * 100 + "%) $" + (int)(taxes * 100) / 100.0 + "\n";
	    output += "Net pay: $" + netPay;

	    System.out.println(output);
	}
}