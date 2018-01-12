package com.company;

public class Link {

    chessPiece piece;
    Link next;

    Link (chessPiece nextPiece) {

        piece = nextPiece;
        next = null;
    }

    public String toString () {
        return (this.piece.pieceType + " " + this.piece.col + " " + this.piece.row);
    }
}


