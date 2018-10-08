/* austin smith
today */

import java.util.Scanner;
class countingLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentance: ");
		String s = input.nextLine();
		
		int vowels = 0;
		int consonants = 0;
		
		for (int i = 0; i < s.length(); i++){
			char cache = Character.toUpperCase(s.charAt(i));
			if (cache == 'A' || cache == 'E' || cache == 'I' || cache == 'O' || cache == 'U') {
				vowels++;
			}
			else if (Character.isLetter(cache)){
				consonants++;
			}
		}
		System.out.println("There are " + vowels + " vowels and " + consonants + " consonants in this string.");
	}
}