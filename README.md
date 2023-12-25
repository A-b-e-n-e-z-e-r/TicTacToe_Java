# TicTacToe Java
This is a simple implementation of the classic TicTacToe game in Java. The game allows a player to compete against an AI opponent. The board is displayed in the console, and players take turns placing their symbols ('X' for the player and 'O' for the AI) on the board.

How to Play
Run the program, and the game will start.
Enter your move by specifying a position on the board (1-9) when prompted.
The AI will make its move automatically.
The game continues until there is a winner, a draw (stalemate), or you choose to exit.

Game Board
The game board is represented as a 3x3 grid, displayed in the console as follows:

 1 | 2 | 3 
-----------
 4 | 5 | 6 
-----------
 7 | 8 | 9 


Example Gameplay

LET'S PLAY SOME XO!

Enter your placement (1-9): 5
 X |   |  
-----------
   | O |  
-----------
   |   |  

Winner Conditions
The game checks for the following winner conditions after each move:

Any complete row (horizontal, vertical, or diagonal) filled with the same symbol.
Stalemate
If all positions on the board are filled, and there is no winner, the game ends in a stalemate.

Notes
The player's moves are denoted by 'X', and the AI's moves are denoted by 'O'.
The program uses a simple AI that makes random moves.
Have fun playing TicTacToe!
