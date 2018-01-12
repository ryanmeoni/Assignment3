package com.company;

public abstract class chessPiece {

    public int boardSize;
    public String pieceType;
    public int col;
    public int row;

    public chessPiece() {
    }

    public chessPiece(int boardSize, String pieceType, int row, int col) {

        this.boardSize = boardSize;
        this.pieceType = pieceType;
        this.col = col;
        this.row = row;

    }

    public abstract boolean canMove(chessBoard theBoard, int targetCol, int targetRow, String SpacePieceType);

    public abstract boolean isAttacking(chessPiece chessPiece2, chessBoard theBoard);


    public String toString() {
        return (this.col + " " + this.row);
    }
}