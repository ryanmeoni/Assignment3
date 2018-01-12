package com.company;

public class Bishop extends chessPiece {

    public Bishop(int boardSize, String pieceType, int row, int col) {
        super(boardSize, pieceType, row, col);
    }

    public boolean canMove(chessBoard theBoard, int targetCol, int targetRow, String SpacePieceType) {

        if (!SpacePieceType.equals("no piece")) { //if there's a piece at target
            if ((this.pieceType.equals(this.pieceType.toLowerCase()) && SpacePieceType.equals(SpacePieceType.toLowerCase())) ||
                    ((this.pieceType.equals(this.pieceType.toUpperCase()) && SpacePieceType.equals(SpacePieceType.toUpperCase())))) {
                return false; //If moving piece is same color as piece at target space, return false.
            }
        }

        if (!checkValidMove(targetCol, targetRow)) { //check if valid piece path
            return false;
        }

        Link current = theBoard.head;

        while (current != null) {

            if (targetCol > this.col && targetRow > this.row) { //If bishop is moving up/right

                for (int i = this.col + 1, j = this.row + 1; i < targetCol && j < targetRow; i++, j++) {

                    if (current.piece.col == i && current.piece.row == j) //If a piece is in the way of bishop, blocked.
                        return false;
                }
            }

            if (targetCol > this.col && targetRow < this.row) { //If bishop is moving down/right

                for (int i = this.col + 1, j = this.row - 1; i < targetCol && j > targetRow; i++, j--) {

                    if (current.piece.col == i && current.piece.row == j) //If a piece is in the way of bishop, blocked.
                        return false;
                }
            }

            if (targetCol < this.col && targetRow < this.row) { //If bishop is moving down/left

                for (int i = this.col - 1, j = this.row - 1; i > targetCol && j > targetRow; i--, j--) {

                    if (current.piece.col == i && current.piece.row == j) //If a piece is in the way of bishop, blocked.
                        return false;
                }
            }

            if (targetCol < this.col && targetRow > this.row) { //If bishop is moving up/left

                for (int i = this.col - 1, j = this.row + 1; i > targetCol && j < targetRow; i--, j++) {

                    if (current.piece.col == i && current.piece.row == j) //If a piece is in the way of bishop row increment, blocked.
                        return false;
                }
            }
            current = current.next;
        }
        return true;
    }

    public boolean isAttacking(chessPiece piece2, chessBoard theBoard) {

        if ((piece2.pieceType.equals("K") && ((this.pieceType.equals("k") || this.pieceType.equals("b") ||
                this.pieceType.equals("n") || this.pieceType.equals("p") || this.pieceType.equals("q") ||
                this.pieceType.equals("r")))) || ((piece2.pieceType.equals("k") && (this.pieceType.equals("K")
                || this.pieceType.equals("B") || this.pieceType.equals("N") || this.pieceType.equals("P")
                || this.pieceType.equals("Q") || this.pieceType.equals("R"))))) {

            if (canMove(theBoard, piece2.col, piece2.row, piece2.pieceType)) {
                int piece2col = piece2.col;
                int piece2row = piece2.row;

                for (int i = this.col, j = this.row; i <= boardSize && j <= boardSize; i++, j++) { //diagonal up/right
                    if (i == piece2col && j == piece2row)
                        return true;
                }
                for (int i = this.col, j = this.row; i >= 0 && j <= boardSize; i--, j++) {//diagonal up/left
                    if (i == piece2col && j == piece2row)
                        return true;
                }
                for (int i = this.col, j = this.row; i >= 0 && j >= 0; i--, j--) {//diagonal down/left
                    if (i == piece2col && j == piece2row)
                        return true;
                }
                for (int i = this.col, j = this.row; i <= boardSize && j >= 0; i++, j--) {//diagonal down/right
                    if (i == piece2col && j == piece2row)
                        return true;
                }
            }
        }
        return false;
    }

    public boolean checkValidMove(int targetCol, int targetRow) {

        for (int i = this.col, j = this.row; i <= boardSize && j <= boardSize; i++, j++) { //diagonal up/right
            if (targetCol == i && targetRow == j)
                return true;
        }
        for (int i = this.col, j = this.row; i >= 0 && j <= boardSize; i--, j++) {//diagonal up/left
            if (targetCol == i && targetRow == j)
                return true;
        }
        for (int i = this.col, j = this.row; i >= 0 && j >= 0; i--, j--) {//diagonal down/left
            if (targetCol == i && targetRow == j)
                return true;
        }
        for (int i = this.col, j = this.row; i <= boardSize && j >= 0; i++, j--) {//diagonal down/right
            if (targetCol == i && targetRow == j)
                return true;
        }
        return false;
    }
}




