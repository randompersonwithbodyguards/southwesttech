/* austin smith
nov 19. */
import java.util.Scanner;


class Exercise8_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int victory = 0;
		
		String[][] stootNames = {
		
		{"Alabama", "Montgomery"},
		{"Alaska", "Juneau"},
		{"Arizona", "Phoenix"},
		{"Kansas", "Topeka"},
		{"California", "Sacramento"},
		{"Colorado", "Denver"},
		{"Conneticut", "Hartford"},		
		{"Delaware", "Dover"},
		{"Florida", "Tallahassee"},
		{"Georgia", "Atlanta"}
	};
		
		for(int row = 0; row < 10; row++){
			System.out.println("What is the capital of " + stootNames[row][0] + "?");
			String userInput = input.next();
			if (userInput.equalsIgnoreCase(stootNames[row][1])){
				victory++;
				System.out.println("That is correct 🎉🎉🎉🎉🎉, the capital is " + stootNames[row][1]);
			}
			else {
				System.out.println("YoU dOnE dId MeSs Up, the capital is actually " + stootNames[row][1]);
			}
		}
		System.out.println("You got " + victory + " state capitals correct🎉");
	}
}