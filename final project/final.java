import java.util.Scanner;

class Final {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[][] player1boats = {
			{"   "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "},
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
			{"   "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "},
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
			{"   "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "},
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
			{"   "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "},
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
			System.out.println("Your first ship is the submarine, it is 3 spaces long, ships can only be placed horizontally or vertically. Type the coordinates of your ship with one space between the number and letter.\nEx: 2 B \n4 b");
			
			printingPress(player1boats);
			
			//submarine 3
			int workingY = input.nextInt();
			int workingX = lettersMagic(input.next());
			
			int finalY = input.nextInt();
			int finalX = lettersMagic(input.next());

			
			for (int count = 0; count < 3; count++){
				
				player1boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
			
			System.out.println("This one is the Carrier, it is 5 long. ");
			printingPress(player1boats);
						
			workingY = input.nextInt();
			workingX = lettersMagic(input.next());
			
			finalY = input.nextInt();
			finalX = lettersMagic(input.next());
			
			for (int count = 0; count < 5; count++){
				
				player1boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
			System.out.println("This one is the Battleship, it is 4 spaces long. ");
			printingPress(player1boats);
						
			workingY = input.nextInt();
			workingX = lettersMagic(input.next());
			
			finalY = input.nextInt();
			finalX = lettersMagic(input.next());
		
			for (int count = 0; count < 4; count++){
				
				player1boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
			System.out.println("This one is the Destroyer, it is 3 long. ");
			printingPress(player1boats);
						
			workingY = input.nextInt();
			workingX = lettersMagic(input.next());
			
			finalY = input.nextInt();
			finalX = lettersMagic(input.next());

			for (int count = 0; count < 3; count++){
				
				player1boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
			System.out.println("This one is the Patrol Boat, it is 2 spaces long. ");
			printingPress(player1boats);	
						
			workingY = input.nextInt();
			workingX = lettersMagic(input.next());
			
			finalY = input.nextInt();
			finalX = lettersMagic(input.next());

			for (int count = 0; count < 2; count++){
				
				player1boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
		}
		
					
		System.out.println("Type \"end\" and press enter to end your turn");
		starter = input.next();
		
		if (starter.equalsIgnoreCase("end")){
			clearScreen();
		}
		
		System.out.println("Type \"ready\" to begin your turn:");
		starter = input.next();
		
		//sets up boats for p2
		if (starter.equalsIgnoreCase("ready")){
			
			System.out.println("Your first ship is 3 spaces long, ships can only be placed horizontally or vertically. Type the coordinates of one end of your ship with one space between the number and letter, then type the other end.\nEx: 2 B\n 2 D");
			
			printingPress(player2boats);
			
			int workingY = input.nextInt();
			int workingX = lettersMagic(input.next());
			
			int finalY = input.nextInt();
			int finalX = lettersMagic(input.next());
			
			for (int count = 0; count < 3; count++){
				
				player2boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
			
			System.out.println("This one is the Carrier, it is 5 long. ");
			printingPress(player2boats);
						
			workingY = input.nextInt();
			workingX = lettersMagic(input.next());
			
			finalY = input.nextInt();
			finalX = lettersMagic(input.next());

			for (int count = 0; count < 5; count++){
				
				player2boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
			
			System.out.println("This one is the Battleship, it is 4 spaces long. ");
			printingPress(player2boats);
						
			workingY = input.nextInt();
			workingX = lettersMagic(input.next());
			
			finalY = input.nextInt();
			finalX = lettersMagic(input.next());

			for (int count = 0; count < 4; count++){
				
				player2boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
			
			System.out.println("This one is the Destroyer, it is 3 long. ");
			printingPress(player2boats);
						
			workingY = input.nextInt();
			workingX = lettersMagic(input.next());
			
			finalY = input.nextInt();
			finalX = lettersMagic(input.next());

			for (int count = 0; count < 3; count++){
				
				player2boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
			
			System.out.println("This one is the Patrol Boat, it is 2 spaces long. ");
			printingPress(player2boats);
						
			workingY = input.nextInt();
			workingX = lettersMagic(input.next());
			
			finalY = input.nextInt();
			finalX = lettersMagic(input.next());

			for (int count = 0; count < 5; count++){
				
				player2boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
				
				else {
					System.out.println("That is not a correct value, or the code messed up");
				}
			}
		}
		
					
		System.out.println("Type \"done\" and press enter to end your turn");
		starter = input.next();
		
		if (starter.equalsIgnoreCase("done")){
			clearScreen();
		}
		
		int hitsp1 = 0;
		int hitsp2 = 0;
		
		while (hitsp1 < 17 && hitsp2 < 17){
		
		System.out.println("Player one, Press q to take your turn, press w to see your boats");
		
		starter = input.next();
		
		if (starter.equalsIgnoreCase("q")){
			printingPress(player1guesses);
			System.out.println("Take a guess: ");
			int guessy = input.nextInt();
			int guessx = lettersMagic(input.next());
			
			// and then create a checker for that
			if (player2boats[guessy][guessx].equalsIgnoreCase(" X ")){
				player2boats[guessy][guessx] = " X ";
				player1guesses[guessy][guessx] = " X ";
				printingPress(player1guesses);
				System.out.println("Hit");
				hitsp1++;
			}
			else{
				player1guesses[guessy][guessx] = " 0 ";
				System.out.println("Miss");
			}
			System.out.println("Type d press enter to end your turn");
			starter = input.next();
			if (starter.equalsIgnoreCase("d")){
				clearScreen();
			}	
		}
		//end q if statement ^
		
		if (starter.equalsIgnoreCase("w")){
			printingPress(player1boats);
			System.out.println("Player 1, do it. Now press q to take your turn");
			
			starter = input.next();
			
			if (starter.equalsIgnoreCase("q")){
				printingPress(player1guesses);
				System.out.println("Take a guess: ");
				int guessy = input.nextInt();
				int guessx = lettersMagic(input.next());
				
				// and then create a checker for that
				if (player2boats[guessy][guessx].equalsIgnoreCase(" X ")){
					player2boats[guessy][guessx] = " X ";
					player1guesses[guessy][guessx] = " X ";
					printingPress(player1guesses);
					System.out.println("Hit");
					hitsp1++;
				}
				else{
					player1guesses[guessy][guessx] = " 0 ";
					printingPress(player1guesses);
					System.out.println("Miss");
				}
				System.out.println(" Player 1, Type d and press enter to end your turn");
				starter = input.next();
				if (starter.equalsIgnoreCase("d")){
					clearScreen();
				}	
			}
		}
		//end of w loop
		
		System.out.println("player 2, Press z to take your turn, or press x to see your boats");
		starter = input.next();
		
		if (starter.equalsIgnoreCase("z")){
			printingPress(player2guesses);
			System.out.println("Take a guess: ");
			int guessy = input.nextInt();
			int guessx = lettersMagic(input.next());
			
			// and then create a checker for that
			if (player1boats[guessy][guessx].equalsIgnoreCase(" X ")){
				player1boats[guessy][guessx] = " X ";
				player2guesses[guessy][guessx] = " X";
				printingPress(player2guesses);
				System.out.println("Hit");
				hitsp2++;
			}
			else{
				player2guesses[guessy][guessx] = " 0 ";
				printingPress(player2guesses);
				System.out.println("Miss");
			}
			System.out.println("p2, Type f and press enter to end your turn");
			starter = input.next();
			if (starter.equalsIgnoreCase("f")){
				clearScreen();
			}	
		}
		if (starter.equalsIgnoreCase("x")){
			printingPress(player2boats);
			System.out.println("Now press c to take your turn");
			
			starter = input.next();
			
			if (starter.equalsIgnoreCase("c")){
				printingPress(player2guesses);
				System.out.println("Take a guess: ");
				int guessy = input.nextInt();
				int guessx = lettersMagic(input.next());
				
				// and then create a checker for that
				if (player1boats[guessy][guessx].equalsIgnoreCase(" X ")){
					player1boats[guessy][guessx] = " X ";
					player2guesses[guessy][guessx] = " X ";
					printingPress(player2guesses);
					System.out.println("Hit");
					hitsp2++;
				}
				else{
					player2guesses[guessy][guessx] = " 0 ";
					printingPress(player2guesses);
					System.out.println("Miss");
				}
				System.out.println(" p2 Type v and press enter to end your turn");
				starter = input.next();
				if (starter.equalsIgnoreCase("v")){
					clearScreen();
				}	
			}
		}
	}
	//end of turn while loop^
		
		if (hitsp1 == 17){
			System.out.println("Player One wins 🎉");
		}
		else if (hitsp2 == 17) {
			System.out.println("Player Two wins 🎉🎉");
		}
		else {
			System.out.println("if this shows up, somethings not counting riiiiiight");
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
			for(int i = 0; i < 150; i++){
				System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
			}
		}
	}