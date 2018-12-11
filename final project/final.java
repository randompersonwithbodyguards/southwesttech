import java.util.Scanner;

class Final {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[][] player1boats = {
			{"  "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "},
			{"1 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"2 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"3 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"4 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"5 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"6 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"7 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"8 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"9 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"10|"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
		};
		String[][] player2boats = {
			{"  "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "},
			{"1 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"2 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"3 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"4 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"5 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"6 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"7 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"8 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"9 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"10|"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
		};
		String[][] player1guesses = {
			{"  "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "},
			{"1 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"2 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"3 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"4 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"5 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"6 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"7 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"8 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"9 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"10|"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
		};
		String[][] player2guesses = {
			{"  "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "},
			{"1 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"2 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"3 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"4 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"5 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"6 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"7 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"8 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"9 |"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
			{"10|"," O "," O "," O "," O "," O "," O "," O "," O "," O "," O "},
		};
		
		//starting game code
		System.out.println("Press enter to start game!");
		String starter = input.nextLine();
		
		//sets up boats for p1
		if (starter.equalsIgnoreCase("")){
			System.out.println("Your first ship is 3 spaces long, ships can only be placed horizontally or vertically. Type the coordinates of your ship with one space between the number and letter. Ex: 2 B");
			
			printingPress(player1boats);
			
			int count = 0;
			//submarine 3
			while (count < 3){
				int ycor = input.nextInt();
				int xcor = lettersMagic(input.next());
				player1boats[ycor][xcor] = " X ";
				printingPress(player1boats);
				count++;
			}
			System.out.println("This ");
			while (count < 3){
				int ycor = input.nextInt();
				int xcor = lettersMagic(input.next());
				player1boats[ycor][xcor] = " X ";
				printingPress(player1boats);
				count++;
			}
		}
		
					
		System.out.println("Type \"end\" and press enter to end your turn");
		starter = input.next();
		
		if (starter.equalsIgnoreCase("end")){
			clearScreen();
		}
		
		System.out.println("Type \"ready\" to begin your turn:");
		starter = input.next();
		
		//sets up boats for p1
		if (starter.equalsIgnoreCase("ready")){
			System.out.println("Your first ship is 3 spaces long, ships can only be placed horizontally or vertically. Type the coordinates of your ship with one space between the number and letter. Ex: 2 B");
			
			printingPress(player2boats);
			
			int count = 0;
			while (count < 3){
				int ycor = input.nextInt();
				int xcor = lettersMagic(input.next());
				player2boats[ycor][xcor] = " X ";
				printingPress(player2boats);
				count++;
			}
		}
		//insert code here
		
}
	
	
	//converts the letter coordinate to a number
	public static int lettersMagic(String origin) {
			int x = 0;
			if (origin.equalsIgnoreCase("A"))
				x = 1;
			if (origin.equalsIgnoreCase("B"))
				x = 2;
			if (origin.equalsIgnoreCase("C"))
				x = 3;
			if (origin.equalsIgnoreCase("D"))
				x = 4;
			if (origin.equalsIgnoreCase("E"))
				x = 5;
			if (origin.equalsIgnoreCase("F"))
				x = 6;
			if (origin.equalsIgnoreCase("G"))
				x = 7;
			if (origin.equalsIgnoreCase("H"))
				x = 8;
			if (origin.equalsIgnoreCase("I"))
				x = 9;
			if (origin.equalsIgnoreCase("J"))
				x = 10;
			
			return x;
		}
		
		
		//prints out the matrix
		public static void printingPress(String[][] matrix) {
			for(int row = 0; row < 11; row++){
				for(int col = 0; col < 11; col++){
					System.out.print(matrix[row][col]);
				}
				System.out.println();
			}	
		}
		
		
		//prints the backspace character a bunch
		public static void clearScreen(){
			for(int i = 0; i < 100; i++){
				System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
			}
		}
	}