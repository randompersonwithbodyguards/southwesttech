# BattleShip

## Synopsis

This project is just an ascii version of battleship. It is meant to be played by two different people on a local computer.

## How to play

Just follow the instructions on the screen, and it will tell you what to do :)

a couple of notes: you must always have the number before the letter, and have a space between them.
read the instructions carefully, cause if you type things wrong it might skip important things.
you must start with the uppermost or leftmost coordinate first. the boat placement system doesnt work the other way
wait for the screen to clear before handing the computer to your opponent.

## Code Example
this is a code snippet that places the boats

	for (int count = 0; count < 3; count++){
				
				player2boats[workingY][workingX] = " X ";
				
				if (workingX == finalX){
					workingY++;
				}
				 
				else if (workingY == finalY) {
					workingX++;
				}
        
![placing the boats](Bloop.png)
	
## Motivation       

my motivation for creating this is i thought it would be pretty cool if i was able to do it and it was

