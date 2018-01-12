package com.company;

public class King extends chessPiece {

    public King(int boardSize, String pieceType, int row, int col) {
        super(boardSize, pieceType, row, col);
    }


    public boolean canMove(chessBoard theBoard, int targetCol, int targetRow, String SpacePieceType) {

        if (!SpacePieceType.equals("no piece")) { //if there's a piece at target
            if ((this.pieceType.equals(this.pieceType.toLowerCase()) && SpacePieceType.equals(SpacePieceType.toLowerCase())) ||
                    ((this.pieceType.equals(this.pieceType.toUpperCase()) && SpacePieceType.equals(SpacePieceType.toUpperCase())))) {
                return false; //If moving piece is same color as piece at target space, return false.
            }
        }

        Link current = theBoard.head;

        while (current != null) { //all 8 moves covered.

            if (targetCol == this.col && targetRow == this.row + 1) {
                    return true;
            }


            if (targetCol == this.col + 1 && targetRow == this.row + 1) {
                    return true;
            }

            if (targetCol == this.col + 1 && targetRow == this.row) {
                    return true;
            }

            if (targetCol == this.col + 1 && targetRow == this.row - 1) {
                    return true;
            }

            if (targetCol == this.col && targetRow == this.row - 1) {
                    return true;
            }

            if (targetCol == this.col - 1 && targetRow == this.row - 1) {
                    return true;
            }

            if (targetCol == this.col - 1 && targetRow == this.row) {
                    return true;
            }

            if (targetCol == this.col - 1 && targetRow == this.row + 1) {
                    return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isAttacking(chessPiece piece2, chessBoard theBoard) { //checks if attacking king

        if ((piece2.pieceType.equals("K") && ((this.pieceType.equals("k") || this.pieceType.equals("b") ||
                this.pieceType.equals("n") || this.pieceType.equals("p") || this.pieceType.equals("q") ||
                this.pieceType.equals("r")))) || ((piece2.pieceType.equals("k") && (this.pieceType.equals("K")
                || this.pieceType.equals("B") || this.pieceType.equals("N") || this.pieceType.equals("P")
                || this.pieceType.equals("Q") || this.pieceType.equals("R"))))) {

            if (canMove(theBoard, piece2.col, piece2.row, piece2.pieceType)) {
                int piece2col = piece2.col;
                int piece2row = piece2.row;

                if (this.col - 1 == piece2col && this.row == piece2row)
                    return true;
                if (this.col - 1 == piece2col && this.row + 1 == piece2row)
                    return true;
                if (this.col == piece2col && this.row + 1 == piece2row)
                    return true;
                if (this.col + 1 == piece2col && this.row + 1 == piece2row)
                    return true;
                if (this.col + 1 == piece2col && this.row == piece2row)
                    return true;
                if (this.col + 1 == piece2col && this.row - 1 == piece2row)
                    return true;
                if (this.col == piece2col && this.row - 1 == piece2row)
                    return true;
                if (this.col - 1 == piece2col && this.row - 1 == piece2row)
                    return true;
            }
        }
        return false;
    }
}