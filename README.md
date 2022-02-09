# Voltorb-Flip
This is a clone of the Voltorb Flip minigame first seen in Pokemon HeartGold and SoulSilver.

# How to Play
This game is sorta similar to Sudoku and Minesweeper. There is a 5x5 grid, and the goal is to uncover all the '2s' and '3s' without uncovering any '0s' (also called 
bombs). The 'total points' to 'bombs' ratio is shown on the ends of each row and column. Points are recieved multiplicat-ably, meaning that uncovering a 1, 3, 2, 1, 
1, 3 would net 1x3x2x1x1x3 points or 18 points total. However, if the player uncovers a '0', the entire product is set to 0 and the board is reset. Uncovering '1s' 
do nothing to advance the player's score, but they could lead to clues as to where other '2s' and '3s' or 'bombs' could be.

There is also a marker button that allows the player to mark off certain tiles that will not help their score.

# Strategies
The biggest clues lie in the ratios on the ends of the board:  
1.) Of course, if the points to bomb ratio is 0:5, mark off the entire row/column.  
2.) Uncover any rows/columns that do not have any bombs, i.e. the ratio ends with a 0.  
3.) If the two integers in the ratio add up to 5 (i.e. 3:2 or 1:4), you know that there can be nothing of value in the row/column since, if you do the math, the 
row/column only contains 0s and 1s.  
4.) Use deductive reasoning if you uncover a '2' or '3': look to the perpendicular row/column and calculate if the rest of the row/column contains something of
value or not.  
5.) Everyone has 'statistical intuition': use that here if all the other previous hints won't reveal anything useful.  
6.) Diagonals!!! You'll understand if you play and it makes the 'logic' of the game way easier.  

# How to Run
Open the VoltorbFlip.jar file with Java installed. Alternatively, you can run the FlipGUI.java in an IDE with all the other files in the same project.

# Rights n Stuff
This is open source, feel free to modify and improve. I claim no right to the originality nor concept of the program.
