
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
	
	
	public void improperConvert(){
		if (this.coefficient != 0) {
			setCoefficient(this.numerator / this.denominator);
			setNumerator(this.numerator % this.denominator);
		}
		else {
			setCoefficient(this.coefficient);
		}
	}
	
	public void simplify(int gcdNumber){
		setNumerator(this.numerator / gcdNumber);
		setDenominator(this.denominator / gcdNumber);
		double pass1 = this.numerator;
		double pass2 = this.denominator;
		if (Math.floor(pass1 / pass2) != 0) {
			int cache = this.getNumerator() + (int)Math.floor(pass1 / pass2);
			setCoefficient(cache);
			setNumerator(this.numerator % this.denominator);
		}
				
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