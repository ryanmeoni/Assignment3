# Chess-Checker
Java Chess Checker

Program that reads in a chessboard game of any size in progress, determines if there exists a check between either of the two players, and determines if a sequence of moves for specific pieces is valid.

The first line to the console must indicate board size and piece setup. The next character specifies what piece you're placing. Following each character must be the piece location on the board in (x, y) coordinate format. 

Example first line inputted at console: 5 k 1 1 K 2 2 

The first number, 5, specifies board size. In this example the chessboard will be a 5 x 5 board. 

The character after the board size is the first piece. 

Lower case character = white player. Upper case character = black player. 

VALID PIECES - k K q Q b B r R p P k K 

The second line must indicate the moves you wish to check if are valid. 

Example second line inputted at console: 3 3 4 4 1 1 2 2 

This example second line demands we check if the piece at location (3, 3) on the board can move to location (4, 4). Then we move to check if the piece at location (1,1) can move to location (2, 2) on the board. 

