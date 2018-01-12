# Chess-Checker
Java Chess Checker

INPUT FROM CONSOLE: 
The first line must indicate board size and piece setup. 
Example first line: 5 k 1 1 K 2 2 
the first number (5) specifies board size. This will be a 5x5 board. 
The next character specifies what piece you're placing. Lower case = white player. Upper case = black player. 
VALID PIECES - k K q Q b B r R p P k K 

The second line must indicate the moves you wish to preform. 
Example second line: 3 3 4 4 1 1 2 2 
It will be checked if the piece at location 3,3 on the board can move to location 4,4. Then it will check if the piece at 
location 1,1 can move to location 2,2. This will repeat for as many moves you wish to check. 

Program can be slightly modified to take inputs from a text file and output the results. Taken from console now for simplicity. 
