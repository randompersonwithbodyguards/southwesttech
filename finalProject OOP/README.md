## Synopsis

It takes fractions and solves them, keeping the answer in fraction form.  It can take mixed numbers or improper fractions, or a combination of each.
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

## Using
just type in your two fractions in the text boxes and press the button to solve it. Be sure to select an operator for it to solve the equation with. If you want to simplify, then type the fraction you want to simplify into the answer field and press simplify. The simplified answer will overwrite the answer field so be careful.

## Motivation

It seemed like a simple enough premise and like it would be interesting to code so I did it.


