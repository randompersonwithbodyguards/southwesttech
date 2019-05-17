## Synopsis

It takes fractions and solves them, keeping the answer in fraction form
## Code Example
```
public void solveImproper(){
		if (addBoolean) {
			int gcd = recursiveGCD(fraction1.getDenominator(), fraction2.getDenominator());
			
			int lcm = (fraction1.getDenominator() * fraction2.getDenominator()) / gcd;
			
			fraction1.makaBig(lcm);
			fraction2.makaBig(lcm);
			
			fraction1.mixedConvert();
			fraction2.mixedConvert();
						
			ansnumerator.setText(Integer.toString(fraction1.getNumerator() + fraction2.getNumerator()));
			
			ansdenominator.setText(Integer.toString(fraction1.getDenominator()));
  ```	

## Motivation

it seemed like a simple enough premise and fun to code so i did it.

## Tests

Describe and show how to run the tests with code examples.

## License

A short snippet describing the license (MIT, Apache, etc.)
