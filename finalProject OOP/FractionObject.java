
public class FractionObject{
	private int numerator = 0;
	private int denominator = 1;
	private int coefficient = 0;
	
	
	
	public FractionObject(){
		
	}
	
	public FractionObject(int num, int denom){
		this.numerator = num;
		this.denominator = denom;
	}
	
	public FractionObject(int num, int denom, int coefee){
		this.numerator = num;
		this.denominator = denom;
		this.coefficient = coefee;
	}
	
	public int getNumerator(){
		return this.numerator;
	}
	
	public int getDenominator(){
		return this.denominator;
	}
	
	public int getCoefficient(){
		return this.coefficient;
	}
	
	public void setNumerator(int newnum){
		this.numerator = newnum;
	}
	
	public void setDenominator(int newnum){
		this.denominator = newnum;
	}
	
	public void setCoefficient(int newnum){
		this.coefficient = newnum;
	}
	
	//improper TO mixed
	public void improperConvert(){
		if (this.coefficient == 0) {
			System.out.println("it not zero anymore");
			double pass = Math.floor(this.numerator/this.denominator);
			setCoefficient((int)pass);
			setNumerator(this.numerator % this.denominator);
		}
		else {
			setCoefficient(this.coefficient);
			System.out.println("it not detecting");
		}
	}
	
	public void simplify(int gcdNumber){
		setNumerator(this.numerator / gcdNumber);
		setDenominator(this.denominator / gcdNumber);
	
				
	}
	//FROM mixed TO improper
	public void mixedConvert(){
		setNumerator((this.coefficient * this.denominator) + this.numerator);
		setCoefficient(0);
	}
	public void makaBig(int lcmNumber){
		int timeser = lcmNumber / this.denominator;
		setDenominator(timeser * this.denominator);
		setNumerator(timeser * this.numerator);
	}
	
}